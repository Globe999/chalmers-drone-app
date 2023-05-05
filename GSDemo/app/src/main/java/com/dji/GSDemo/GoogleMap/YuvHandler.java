package com.dji.GSDemo.GoogleMap;
import android.media.Image;
import android.media.MediaFormat;
import android.os.AsyncTask;
import android.util.Log;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.widget.Toast;

import com.dji.GSDemo.GoogleMap.deepmodel.DetectionResult;
import com.dji.GSDemo.GoogleMap.deepmodel.MobileNetObjDetector;
import com.dji.GSDemo.GoogleMap.utils.ImageUtils;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

import dji.sdk.codec.DJICodecManager;
import android.content.Context;

public class YuvHandler implements DJICodecManager.YuvDataCallback {
    private static int MODEL_IMAGE_INPUT_SIZE = 300;
    private Bitmap imageBitmapForModel = null;
    private Bitmap rgbBitmapForCameraImage = null;
    private boolean computing = false;
    private Matrix imageTransformMatrix;
    private MobileNetObjDetector objectDetector;
    private static String LOGGING_TAG = MainActivity.class.getName();
    private Context context;

    public YuvHandler(Context context){
        this.context = context;
        try {
            objectDetector = MobileNetObjDetector.create(context.getAssets());
            Log.i(LOGGING_TAG, "Model Initiated successfully.");
            Toast.makeText(context, "MobileNetObjDetector created", Toast.LENGTH_SHORT).show();
        } catch(IOException e) {
            e.printStackTrace();
            Toast.makeText(context, "MobileNetObjDetector could not be created", Toast.LENGTH_SHORT).show();

        }
        imageBitmapForModel = Bitmap.createBitmap(MODEL_IMAGE_INPUT_SIZE, MODEL_IMAGE_INPUT_SIZE, Config.ARGB_8888);
        rgbBitmapForCameraImage = Bitmap.createBitmap(1920,1080, Config.ARGB_8888);

        imageTransformMatrix = ImageUtils.getTransformationMatrix(1920, 1080,
                MODEL_IMAGE_INPUT_SIZE, MODEL_IMAGE_INPUT_SIZE, 0,true);
        imageTransformMatrix.invert(new Matrix());
        Log.i("storlek", "initierat skit");
    }

    public void onYuvDataReceived(MediaFormat format, ByteBuffer yuvBuffer, int dataSize, int width, int height){


        Log.i("storlek", "w: " + width + "  h: " + height);
        Log.wtf("OnImageAvailable", "OnImageAvailable");
        Image imageFromCamera = null;

        try {
            imageFromCamera = reader.acquireLatestImage();
            if (imageFromCamera == null) {
                return;
            }
            if (computing) {
                imageFromCamera.close();
                return;
            }
            computing = true;
            preprocessImageForModel(imageFromCamera);
            imageFromCamera.close();
        } catch (final Exception ex) {
            if (imageFromCamera != null) {
                imageFromCamera.close();
            }
            Log.e(LOGGING_TAG, ex.getMessage());
        }

        runInBackground(() -> {
            final List<DetectionResult> results = objectDetector.detectObjects(imageBitmapForModel);
            Log.wtf("Results", results + "");
            overlayView.setResults(results);
            //Log.i(LOGGING_TAG, results.get(0).toString());

            if(results.size() > 0) {
                String title = results.get(0).getTitle();
                for(int ix = 1 ; ix < results.size() - 1; ix++) {
                    title += ", ";
                    title += results.get(ix).getTitle();
                }
                Toast.makeText(ObjectDetection2.this, title, Toast.LENGTH_LONG).show();
            }

            requestRender();
            computing = false;
        });
    }

    private void preprocessImageForModel(final Image imageFromCamera) {
        Log.wtf("preprocessImageForModel", "preprocessImageForModel");
        rgbBitmapForCameraImage.setPixels(ImageUtils.convertYUVToARGB(imageFromCamera, 1920, 1080),
                0, 1920, 0, 0, 1920, 1080);

        new Canvas(imageBitmapForModel).drawBitmap(rgbBitmapForCameraImage, imageTransformMatrix, null);
    }
    private class DetectionTask extends AsyncTask<Bitmap, Void, List<DetectionResult>> {
        @Override
        protected List<DetectionResult> doInBackground(Bitmap... bitmaps) {
            return objectDetector.detectObjects(bitmaps[0]);
        }

        @Override
        protected void onPostExecute(List<DetectionResult> results) {
            Log.wtf("Results", results + "");
            overlayView.setResults(results);

            if (results.size() > 0) {
                String title = results.get(0).getTitle();
                for (int ix = 1; ix < results.size() - 1; ix++) {
                    title += ", ";
                    title += results.get(ix).getTitle();
                }
                Toast.makeText(ObjectDetection2.this, title, Toast.LENGTH_LONG).show();
            }

            requestRender();
            computing = false;
        }
    }
}
