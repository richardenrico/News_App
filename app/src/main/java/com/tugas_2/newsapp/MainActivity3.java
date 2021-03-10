package com.tugas_2.newsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void to_Home_3(View view) {
        Intent a = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(a);

//        Toast.makeText(this, "ke activity 2", Toast.LENGTH_SHORT).show();
    }

    public void onBackPressed(){
        Intent intent = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(intent);
    }

    public void to_News_3(View view) {
        Intent b = new Intent(MainActivity3.this, MainActivity2.class);
        startActivity(b);
//        Toast.makeText(this, "ke activity 2", Toast.LENGTH_SHORT).show();
    }
}
