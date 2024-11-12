package com.example.addiction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Screen3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        // Find the button by its ID and set a click listener
        findViewById(R.id.goToScreen4Button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an intent to navigate to Screen4Activity
                Intent intent = new Intent(Screen3Activity.this, Screen4Activity.class);
                startActivity(intent);

            }

        });
    }
}
