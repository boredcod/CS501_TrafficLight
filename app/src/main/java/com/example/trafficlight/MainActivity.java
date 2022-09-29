package com.example.trafficlight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView redlight;
    TextView yellowlight;
    TextView greenlight;
    Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redlight = findViewById(R.id.redlight);
        yellowlight = findViewById(R.id.redlight2);
        greenlight = findViewById(R.id.redlight3);

        but = findViewById(R.id.button);

        redlight.setText("light");

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!redlight.getText().equals("")){
                    redlight.setText("");
                    greenlight.setText("");
                    yellowlight.setText("light");
                }
                else if (!yellowlight.getText().equals("")){
                    yellowlight.setText("");
                    greenlight.setText("light");
                    redlight.setText("");
                }
                else if (!greenlight.getText().equals("")){
                    greenlight.setText("");
                    redlight.setText("light");
                    yellowlight.setText("");
                }
            }
        });
    }
}