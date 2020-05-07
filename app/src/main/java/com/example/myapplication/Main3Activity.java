package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {
    EditText edt,edt1;
    int skor=100;
    String cc1;
    String rst1;
    Button btnn, btnn1, btnn2, btnn3, btnn4, btnn6, btnn7, btnn5, tmmp, level1,btnn8;

    String kelime = "DNA";
    String kelime1 = "AND";
    String kelime2= "AD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        edt=(EditText)findViewById(R.id.editText1);
        edt1=(EditText)findViewById(R.id.editText2);
        tmmp = (Button) findViewById(R.id.btn6);
        btnn = (Button) findViewById(R.id.btn1);
        btnn1 = (Button) findViewById(R.id.btn2);
        btnn2 = (Button) findViewById(R.id.btn3);
        btnn3 = (Button) findViewById(R.id.btn4);
        btnn4 = (Button) findViewById(R.id.btn5);
        btnn5 = (Button) findViewById(R.id.btn7);
        btnn6 = (Button) findViewById(R.id.btn8);
        btnn7 = (Button) findViewById(R.id.btn9);
        btnn8 = (Button) findViewById(R.id.btn11);

        level1 = (Button) findViewById(R.id.btn10);

        btnn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rst1 = btnn5.getText().toString();
                edt.setText(edt.getText()+rst1);
                cc1 = cc1 + rst1;
            }
        });
        btnn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rst1 = btnn6.getText().toString();
                edt.setText(edt.getText()+rst1);
                cc1 = cc1 + rst1;
            }
        });
        btnn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rst1 = btnn7.getText().toString();
                edt.setText(edt.getText()+rst1);
                cc1 = cc1 + rst1;
            }
        });
        tmmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt.getText().toString().equals(kelime)){
                    btnn3.setText(btnn5.getText());
                    btnn1.setText(btnn7.getText());
                    btnn.setText(btnn6.getText());
                }
                else if (edt.getText().toString().equals(kelime1)){
                    btnn.setText(btnn6.getText());
                    btnn2.setText(btnn7.getText());
                    btnn4.setText(btnn5.getText());
                }
                else if(edt.getText().toString().equals(kelime2)){
                    btnn8.setText(btnn6.getText());
                    btnn4.setText(btnn5.getText());
                }
                else
                    skor=skor-10;
                String eyolla=Integer.toString(skor);
                edt1.setText(eyolla);
            }
        });
        ((Button) findViewById(R.id.btn10)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this, Main4Activity.class);

                startActivity(i);
            }
        });
    }
}
