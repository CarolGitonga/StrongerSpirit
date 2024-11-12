package com.example.addiction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Screen2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        // Find the button by its ID and set a click listener
        findViewById(R.id.goToScreen3Button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an intent to navigate to Screen3Activity
                Intent intent = new Intent(Screen2Activity.this, Screen3Activity.class);
                startActivity(intent);

            }
        });
    }
}
