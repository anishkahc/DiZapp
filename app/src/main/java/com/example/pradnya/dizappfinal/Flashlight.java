package com.example.pradnya.dizappfinal;

import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;

public class Flashlight extends AppCompatActivity {

    Camera mCamera;
    Camera.Parameters mParams;
    int delay = 100; // in ms
    boolean on;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashlight);

        Thread t = new Thread() {
            public void run() {
                try {
                    // Switch on the cam for app's life
                    if (mCamera == null) {
                        // Turn on Cam
                        mCamera = Camera.open();
                        try {
                            mCamera.setPreviewDisplay(null);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        mCamera.startPreview();
                    }

                    for (int i=0; i < 99999; i++) {
                        toggleFlashLight();
                        sleep(delay);
                    }

                    if (mCamera != null) {
                        mCamera.stopPreview();
                        mCamera.release();
                        mCamera = null;
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        };

        t.start();
        
        
    }

    /** Turn the devices FlashLight on */
    public void turnOn() {
        if (mCamera != null) {
            // Turn on LED
            mParams = mCamera.getParameters();
            mParams.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
            mCamera.setParameters(mParams);

            on = true;
        }
    }

    /** Turn the devices FlashLight off */
    public void turnOff() {
        // Turn off flashlight
        if (mCamera != null) {
            mParams = mCamera.getParameters();
            if (mParams.getFlashMode().equals(Camera.Parameters.FLASH_MODE_TORCH)) {
                mParams.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
                mCamera.setParameters(mParams);
            }
        }
        on = false;
    }

    /** Toggle the flashlight on/off status */
    public void toggleFlashLight() {
        if (!on) { // Off, turn it on
            turnOn();
        } else { // On, turn it off
            turnOff();
        }
    }

}
