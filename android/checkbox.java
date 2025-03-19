package com.example.checkbox;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

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

        CheckBox java = findViewById(R.id.java);
        CheckBox python = findViewById(R.id.python);
        CheckBox c = findViewById(R.id.c);

        TextView result = findViewById(R.id.result);

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(v -> {
            StringBuffer str = new StringBuffer();
            str.append("Java: ").append(java.isChecked());
            str.append("\nPython: ").append(python.isChecked());
            str.append("\nC: ").append(c.isChecked());

            result.setText(str.toString());
        });
    }
}