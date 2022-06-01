package com.example.imgprocessing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;;

public class Nvpicout1 extends AppCompatActivity implements View.OnClickListener {

    private CardView buttonmagic1,cardviewmtwo,cardviewmthree,cardviewmfour,cardviewmfive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nvpicout1);
        buttonmagic1 = (CardView) findViewById(R.id.buttonmagic1);

        buttonmagic1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.buttonmagic1:
                i = new Intent(this, medicpic1.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }
}