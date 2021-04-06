package com.example.assignment_science;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button law1;
    Button law2;
    Button law3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        law1 = findViewById(R.id.button);
        law2 = findViewById(R.id.button2);
        law3 = findViewById(R.id.button3);
    }

    public void LawOne(View view) {
        Intent intent = new Intent(this,Law_One.class);
        startActivity(intent);
    }

    public void LawTwo(View view) {
        Intent intent = new Intent(this,Law_Two.class);
        startActivity(intent);
    }

    public void LawThree(View view) {
        Intent intent = new Intent(this,Law_Three.class);
        startActivity(intent);
    }
}