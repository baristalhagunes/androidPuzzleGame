package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Main19Activity extends AppCompatActivity {
    String cc1;
    String rst1;
    Button btnn, btnn1, btnn2, btnn3, btnn4, btnn6, btnn7, btnn5, tmmp, level1, btnn8,btnn9,btnn10,btnn11,btnn12;
    Button btnn13,btnn14,btnn15,btnn16,btnn17,btnn18,btnn19,btnn20,btnn21,btnn22,btnn23,btnn24;
    EditText edt,edt1;
    int skor=100;
    String kelime = "APRİL";
    String kelime1 = "LİRPA";
    String kelime2 = "PİRAL";
    String kelime3 = "LARPİ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);
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
        btnn20 = (Button)findViewById(R.id.btn23);
        btnn21 = (Button)findViewById(R.id.btn24);
        btnn22 = (Button)findViewById(R.id.btn25);
        btnn23 = (Button)findViewById(R.id.btn26);
        btnn24 = (Button)findViewById(R.id.btn27);


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
        btnn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rst1 = btnn24.getText().toString();
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
                    btnn.setText(btnn5.getText());
                    btnn16.setText(btnn6.getText());
                    btnn20.setText(btnn24.getText());
                } else if (edt.getText().toString().equals(kelime1)) {
                    btnn10.setText(btnn24.getText());
                    btnn11.setText(btnn6.getText());
                    btnn2.setText(btnn5.getText());
                    btnn17.setText(btnn19.getText());
                    btnn21.setText(btnn7.getText());
                } else if (edt.getText().toString().equals(kelime2)) {
                    btnn9.setText(btnn19.getText());
                    btnn8.setText(btnn6.getText());
                    btnn4.setText(btnn5.getText());
                    btnn18.setText(btnn7.getText());
                    btnn22.setText(btnn24.getText());
                } else if(edt.getText().toString().equals(kelime3)){
                    btnn12.setText(btnn24.getText());
                    btnn13.setText(btnn7.getText());
                    btnn14.setText(btnn5.getText());
                    btnn15.setText(btnn6.getText());
                    btnn23.setText(btnn19.getText());

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
                Intent i = new Intent(Main19Activity.this, MainActivity.class);

                startActivity(i);
            }
        });
    }
}
