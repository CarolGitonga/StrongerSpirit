package com.example.addiction;

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
    // Method to handle navigation to Screen2Activity
    public void navigateToScreen2(View view) {
        Intent intent = new Intent(this, Screen2Activity.class);
        startActivity(intent);
    }


}
