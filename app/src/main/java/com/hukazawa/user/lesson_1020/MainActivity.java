package com.hukazawa.user.lesson_1020;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int REQUEST_CODE_FOR_INPUT = 9487;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v) {
        Intent it = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(it);
    }

    public void click2(View v) {
        Intent it = new Intent();
        it.setAction("call123");
        startActivity(it);
    }

    public void clickuri(View v) {
        Uri uri = Uri.parse("https://www.google.com.tw/");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void clicktel(View v) {
        Uri uri = Uri.parse("tel:948794");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }

    public void clickmap(View v) {
        Uri uri = Uri.parse("geo:0,0?q=桃園市楊梅區幼獅路二段3號");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void clicksend(View v) {
        EditText name = (EditText) findViewById(R.id.editText);
        String nam = name.getText().toString();

        Intent it = new Intent(MainActivity.this, Main4Activity.class);
        it.putExtra("NAME", nam);
        startActivity(it);
    }

    public void clicktoget(View v) {
        Intent it = new Intent(MainActivity.this, Main5Activity.class);
        startActivityForResult(it, REQUEST_CODE_FOR_INPUT);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_FOR_INPUT)
        {
            if (resultCode == RESULT_OK) {
                String get = data.getStringExtra("getdata");
                TextView vi = (TextView) findViewById(R.id.textView6);
                vi.setText(get);
            }
        }

    }
}
