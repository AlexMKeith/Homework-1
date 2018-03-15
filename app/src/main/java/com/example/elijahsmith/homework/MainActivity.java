package com.example.elijahsmith.homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButton = findViewById(R.id.start_button);

        startButton = findViewById(R.id.start_button);

        startListener();
    }

    private void startListener() {
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMenu();

            }
        });
    }

    private void startMenu() {
        Intent startup = new Intent(this, HelloActivity.class);
        startActivity(startup);
        finish();
    }

    public void hello_activity(View view) {
    }
}
