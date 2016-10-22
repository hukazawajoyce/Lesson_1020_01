package com.hukazawa.user.lesson_1020;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void clickback(View v)
    {
        EditText get = (EditText) findViewById(R.id.editText2);
        String str = get.getText().toString();
        Intent it = new Intent();
        it.putExtra("getdata",str);

        setResult(RESULT_OK, it);
        finish();
    }
}
