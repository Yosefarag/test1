package com.example.test1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class FourActivity extends Activity {
Button newbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four_activity);
        Button btn = (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addButton();
            }
        });
    }
    public void addButton(){
        LinearLayout layout = (LinearLayout) findViewById(R.id.rootlayot);
        newbtn = new Button( this);
        newbtn.setText("new Button");
        layout.addView(newbtn);
    }
}

