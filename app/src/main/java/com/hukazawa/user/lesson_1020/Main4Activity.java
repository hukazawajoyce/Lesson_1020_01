package com.hukazawa.user.lesson_1020;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TextView tv5 = (TextView) findViewById(R.id.textView5);
        Intent it = getIntent();
        String str = it.getStringExtra("NAME");
        tv5.setText(str);

    }
}
