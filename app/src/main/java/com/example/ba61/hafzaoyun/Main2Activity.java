package com.example.ba61.hafzaoyun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.GridLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        String s = i.getStringExtra("mesaj");
        TextView tv =(TextView)findViewById(R.id.textView2);
        tv.setText((s));
        GridLayout gl = (GridLayout)findViewById(R.id.gridLayout);
        //gl.addView(new);
    }
}
