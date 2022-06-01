package com.example.imgprocessing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.OutputStream;

public class Nvpic2 extends AppCompatActivity {
    ImageView img;
    private CardView processimage1;
    private CardView saveimage1;
    OutputStream outputStream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nvpic2);
        processimage1 = (CardView) findViewById(R.id.processimage1_2);
        saveimage1 = (CardView) findViewById(R.id.saveimage1_2);
        img = (ImageView) findViewById(R.id.imageView1_2);
        processimage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.dubfr);
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
