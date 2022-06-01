package com.example.imgprocessing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Nv extends AppCompatActivity implements View.OnClickListener {

    private CardView cardviewnvone,cardviewnvtwo,cardviewnvthree,cardviewnvfour,cardviewnvsix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nv);
        cardviewnvone = (CardView) findViewById(R.id.cardviewnvone);
        cardviewnvtwo = (CardView) findViewById(R.id.cardviewnvtwo);
        cardviewnvthree = (CardView) findViewById(R.id.cardviewnvthree);
        cardviewnvfour = (CardView) findViewById(R.id.cardviewnvfour);
        cardviewnvsix = (CardView) findViewById(R.id.cardviewnvsix);



        cardviewnvone.setOnClickListener(this);
        cardviewnvtwo.setOnClickListener(this);
        cardviewnvthree.setOnClickListener(this);
        cardviewnvfour.setOnClickListener(this);
        cardviewnvsix.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardviewnvone:
                i = new Intent(this, Nvpic1.class);
                startActivity(i);
                break;
            case R.id.cardviewnvtwo:
                i = new Intent(this, Nvpic2.class);
                startActivity(i);
                break;
            case R.id.cardviewnvthree:
                i = new Intent(this, Nvpic3.class);
                startActivity(i);
                break;
            case R.id.cardviewnvsix:
                i = new Intent(this, Nv2.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }
}