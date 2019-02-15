package com.hfad.nicoleampornbinette.nicolebinette;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
    static final int REQUEST_IMAGE_CAPTURE = 1;
    private int pictureIndex = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTakePictureClick( View view ) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult( int requestCode, int resultCode, Intent data) {
        if (pictureIndex < 12) {

            pictureIndex++;
        }
        else {
            pictureIndex = 0;
        }
        if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            ImageView[] imageViews = {findViewById(R.id.image1), findViewById(R.id.image2), findViewById(R.id.image3),
                    findViewById(R.id.image4), findViewById(R.id.image5), findViewById(R.id.image6),
                    findViewById(R.id.image7), findViewById(R.id.image8), findViewById(R.id.image9),
                    findViewById(R.id.image10), findViewById(R.id.image11), findViewById(R.id.image12)};
            if (extras != null) {
                if (extras.containsKey("data")) {
                    Bitmap imageBitmap = (Bitmap) extras.get("data");
                    if (imageBitmap != null) {
                        Bitmap scaledBitmap = Bitmap.createScaledBitmap(imageBitmap, 40, 40, false);
                        ImageView imageView = imageViews[pictureIndex];
                        imageView.setImageBitmap(scaledBitmap);
                    }
                }
            }

        }
    }
}
