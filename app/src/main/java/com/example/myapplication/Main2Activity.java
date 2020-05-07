package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class Main2Activity extends AppCompatActivity {

    EditText edt,edt1;
    int skor=100;
    String cc;
    String rst;
    Button btn,btn1,btn2,btn3,btn4,btn6,btn7,btn5,tmp,level;

    String kelime="MAÇ";
    String kelime1="ÇAM";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edt=(EditText)findViewById(R.id.editText1);
        edt1=(EditText)findViewById(R.id.editText2);
        tmp=(Button)findViewById(R.id.btn6);
        btn=(Button)findViewById(R.id.btn1);
        btn1=(Button)findViewById(R.id.btn2);
        btn2=(Button)findViewById(R.id.btn3);
        btn3=(Button)findViewById(R.id.btn4);
        btn4=(Button)findViewById(R.id.btn5);
        btn5=(Button)findViewById(R.id.btn7);
        btn6=(Button)findViewById(R.id.btn8);
        btn7=(Button)findViewById(R.id.btn9);
        level=(Button)findViewById(R.id.btn10);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rst=btn5.getText().toString();

                edt.setText(edt.getText()+rst);
                cc=cc+rst;
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rst=btn6.getText().toString();
                edt.setText(edt.getText()+rst);
                cc=cc+rst;
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rst=btn7.getText().toString();
                edt.setText(edt.getText()+rst);
                cc=cc+rst;
            }
        });
        tmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edt.getText().toString().equals(kelime)){
                    btn.setText(btn5.getText());
                    btn2.setText(btn6.getText());
                    btn4.setText(btn7.getText());
                }
                else if (edt.getText().toString().equals(kelime1)){
               btn3.setText(btn7.getText());
               btn1.setText(btn6.getText());
               btn.setText(btn5.getText());
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
                Intent i1 = new Intent(Main2Activity.this, Main3Activity.class);

                startActivity(i1);
            }
        });




    }





}
