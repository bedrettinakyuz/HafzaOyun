package com.example.ba61.hafzaoyun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import  android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et =(EditText)findViewById(R.id.editText);
        String isim;
        ((Button)findViewById(R.id.btnGiris)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("mesaj",et.getText().toString());
                startActivity(i);
            }
        });

    }
}
