package com.universaladapter.yangxb.imageapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bitmap defaultImage= BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        Bitmap errorImage=BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher_round);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        String url = "http://01.imgmini.eastday.com//mobile//20171226//20171226114844_0cf902a2a2d039fe857dd1d57e9b5fd7_2_mwpm_03200403.jpg";
        ImageCacheManager.loadImage(this, url, imageView, defaultImage, errorImage);
    }
}
