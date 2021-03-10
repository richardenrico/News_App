package com.tugas_2.newsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
    }

    public void to_Home_2(View view) {
        Intent a = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(a);

//        Toast.makeText(this, "ke activity 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }

    public void to_Profile_2(View view) {
        Intent b = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(b);

//        Toast.makeText(this, "ke activity 2", Toast.LENGTH_SHORT).show();
    }
}
