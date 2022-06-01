package com.example.imgprocessing;

import androidx.appcompat.app.AppCompatActivity;

import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuUtama extends AppCompatActivity implements View.OnClickListener{

    private CardView Nghtvsn,Medic,Technique,members,next1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        Nghtvsn = (CardView) findViewById(R.id.cardviewnv);
        Medic = (CardView) findViewById(R.id.cardviewmedic);
        Technique = (CardView) findViewById(R.id.cardviewteknik);
        members = (CardView) findViewById(R.id.cardviewmembers);


        Nghtvsn.setOnClickListener(this);
        Medic.setOnClickListener(this);
        Technique.setOnClickListener(this);
        members.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardviewnv:
                i = new Intent(this, Nv.class);
                startActivity(i);
                break;
            case R.id.cardviewmedic:
                i = new Intent(this, medic.class);
                startActivity(i);
                break;
            case R.id.cardviewteknik:
                i = new Intent(this, teknik.class);
                startActivity(i);
                break;
            case R.id.cardviewmembers:
                i = new Intent(this, members.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }
}