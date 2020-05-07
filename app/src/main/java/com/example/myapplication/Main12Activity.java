package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Main12Activity extends AppCompatActivity {
    String cc1;
    String rst1;
    Button btnn, btnn1, btnn2, btnn3, btnn4, btnn6, btnn7, btnn5, tmmp, level1, btnn8,btnn9,btnn10,btnn11,btnn12;
    Button btnn13,btnn14,btnn15,btnn16,btnn17,btnn18,btnn19;
    EditText edt,edt1;
    int skor=100;
    String kelime = "ABRA";
    String kelime1 = "ABBA";
    String kelime2 = "ARRA";
    String kelime3 = "ARBA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
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
        btnn9 = (Button)findViewById(R.id.btn12);
        btnn10 = (Button)findViewById(R.id.btn13);
        btnn11 = (Button)findViewById(R.id.btn14);
        btnn12 = (Button)findViewById(R.id.btn15);
        btnn13 = (Button)findViewById(R.id.btn16);
        btnn14 = (Button)findViewById(R.id.btn17);
        btnn15 = (Button)findViewById(R.id.btn18);
        btnn16 = (Button)findViewById(R.id.btn19);
        btnn17 = (Button)findViewById(R.id.btn20);
        btnn18 = (Button)findViewById(R.id.btn21);
        btnn19 = (Button)findViewById(R.id.btn22);


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
        btnn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rst1 = btnn19.getText().toString();
                edt.setText(edt.getText()+rst1);
                cc1 = cc1 + rst1;
            }
        });
        tmmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt.getText().toString().equals(kelime)) {
                    btnn3.setText(btnn7.getText());
                    btnn1.setText(btnn19.getText());
                    btnn.setText(btnn6.getText());
                    btnn16.setText(btnn5.getText());
                } else if (edt.getText().toString().equals(kelime1)) {
                    btnn10.setText(btnn7.getText());
                    btnn11.setText(btnn19.getText());
                    btnn2.setText(btnn19.getText());
                    btnn17.setText(btnn7.getText());
                } else if (edt.getText().toString().equals(kelime2)) {
                    btnn9.setText(btnn7.getText());
                    btnn8.setText(btnn6.getText());
                    btnn4.setText(btnn6.getText());
                    btnn18.setText(btnn7.getText());
                } else if(edt.getText().toString().equals(kelime3)){
                    btnn12.setText(btnn9.getText());
                    btnn13.setText(btnn6.getText());
                    btnn14.setText(btnn19.getText());
                    btnn15.setText(btnn9.getText());

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
                Intent i = new Intent(Main12Activity.this, Main13Activity.class);

                startActivity(i);
            }
        });
    }
}
