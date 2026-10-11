package com.example.gionstudio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button superButton = findViewById(R.id.superButton);

        superButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        MainActivity.this,
                        "Super Button clicked!",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        Button buttonTwo = findViewById(R.id.buttonTwo);

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        MainActivity.this,
                        "Button 2 clicked!",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        Button buttonThree = findViewById(R.id.buttonThree);

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        MainActivity.this,
                        "Button 3 clicked!",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}