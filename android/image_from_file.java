package com.example.backgroundimage;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView banner = findViewById(R.id.banner);

        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);
        Button three = findViewById(R.id.three);

        one.setOnClickListener(v -> {
            banner.setImageResource(R.drawable.one);
        });

        two.setOnClickListener(v -> {
            banner.setImageResource(R.drawable.two);
        });

        three.setOnClickListener(v -> {
            banner.setImageResource(R.drawable.three);
        });
    }
}