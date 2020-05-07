package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);                    /// Bu sayfadaki intent kısmı ve edit text yapısı hazır kod olarak alınmıştır
        setContentView(R.layout.activity_main);
        final EditText et = (EditText) findViewById(R.id.editText1);
        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);

                startActivity(i);
            }
        });
    }
}

