package com.example.finish_it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity1(View view){
        Toast.makeText(this, "Opening activity_slide1", Toast.LENGTH_SHORT).show();
        Intent intent=  new Intent(this, MainActivity_S1.class);
        startActivity(intent);
    }
    public void openActivity2(View view){
        Toast.makeText(this, "Opening activity_slide2", Toast.LENGTH_SHORT).show();
        Intent intent=  new Intent(this, MainActivity_S2.class);
        startActivity(intent);
    }
    public void openActivity3(View view){
        Toast.makeText(this, "Opening activity_slide3", Toast.LENGTH_SHORT).show();
        Intent intent=  new Intent(this, MainActivity_S3.class);
        startActivity(intent);
    }
}