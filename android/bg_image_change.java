package com.example.bgimagechange;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.view);

        Button btn = findViewById(R.id.button);

        int[] images = {R.drawable.one, R.drawable.two, R.drawable.three};
        Random rnd = new Random();

        btn.setOnClickListener(v -> {
            int idx = rnd.nextInt(images.length);
            view.setBackgroundResource(images[idx]);
        });

    }
}