package com.example.test1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class ThreeActivity extends Activity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;





    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_activity);

        Button nextP = findViewById(R.id.next);
        nextP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ThreeActivity.this,FourActivity.class);
                startActivity(intent);
            }
        });


        radioGroup =findViewById(R.id.radioGroup);
        textView= findViewById(R.id.text_view_selected);

        Button buttonApply = findViewById(R.id.button_apply);
        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioId);

                textView.setText("your choice: " + radioButton.getText());
            }
        });
    }
    public  void  checkButton(View v) {
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);

        Toast.makeText(this, "selected Radio Button: " + radioButton.getText(), Toast.LENGTH_SHORT).show();



    }
}


