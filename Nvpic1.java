package com.example.imgprocessing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.annotation.NonNull;
import org.jetbrains.annotations.NotNull;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Nvpic1 extends AppCompatActivity {
    ImageView img;
    private CardView processimage1;
    private CardView saveimage1;
    OutputStream outputStream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nvpic1);
        processimage1 = (CardView) findViewById(R.id.processimage1);
        saveimage1 = (CardView) findViewById(R.id.saveimage1);
        img = (ImageView) findViewById(R.id.imageView4);
        processimage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.mipmap.medoneafr);
            }
        });
        saveimage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Imej disimpan"
                        ,Toast.LENGTH_SHORT).show();
        }
        });
    }

    }
