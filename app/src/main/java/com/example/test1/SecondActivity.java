package com.example.test1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends Activity implements View.OnClickListener {
    TextView orderIs;
    CharSequence score;
    CharSequence op1 = " ";
    CharSequence op2 = " ";
    CharSequence op3 = " ";
    CharSequence op4 = " ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Button bigP = findViewById(R.id.btn_big_pizza);
        Button famP = findViewById(R.id.btn_family);
        Button perP = findViewById(R.id.btn_personal);
        Button olive = findViewById(R.id.btn_Olive);
        Button pine = findViewById(R.id.btn_P);
        Button mush = findViewById(R.id.btn_Mush);
        Button onion = findViewById(R.id.btn_Onion);
        orderIs = findViewById(R.id.Order);

        Button nextP = findViewById(R.id.next);
        nextP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SecondActivity.this,ThreeActivity.class);
                startActivity(intent);
            }
        });
        bigP.setOnClickListener(this);
        famP.setOnClickListener(this);
        perP.setOnClickListener(this);
        olive.setOnClickListener(this);
        pine.setOnClickListener(this);
        mush.setOnClickListener(this);
        onion.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btn_big_pizza) {
            score = getText(R.string.btn_big);
        } else if (view.getId() == R.id.btn_family) {
            score = getText(R.string.btn_fam);
        } else if (view.getId() == R.id.btn_personal) {
            score = getText(R.string.btn_per);
        }
        String btn_inv = getString(R.string.btn_inv);
        orderIs.setText(btn_inv + " " + score);
        {

        }
        if (view.getId() == R.id.btn_Olive) {
            op1 = getText(R.string.btn_olive);
        }
        if (view.getId() == R.id.btn_Onion) {
            op2 = getText(R.string.btn_onion);
        }
        if (view.getId() == R.id.btn_P) {
            op3 = getText(R.string.btn_p);
        }
        if (view.getId() == R.id.btn_Mush) {
            op4 = getText(R.string.btn_mush);
        }

        orderIs.setText(btn_inv + " " + score + "+" + op1 + " " + op2 + " " + op3 + " " + op4);

    }

}