package com.tugas_2.newsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed(){
        moveTaskToBack(true);
    }

    public void to_News_1(View view) {
        Intent a = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(a);
        finish();
//        Toast.makeText(this, "ke activity 2", Toast.LENGTH_SHORT).show();
    }

    public void to_Profile_1(View view) {
        Intent b = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(b);
        finish();
//        Toast.makeText(this, "ke activity 2", Toast.LENGTH_SHORT).show();
    }
}