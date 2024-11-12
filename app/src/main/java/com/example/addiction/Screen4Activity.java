package com.example.addiction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Screen4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
        // Find the button by its ID and set a click listener
        findViewById(R.id.goToScreen5Button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an intent to navigate to Screen5Activity
                Intent intent = new Intent(Screen4Activity.this, Screen5Activity.class);
                startActivity(intent);
            }
        });
    }
}
