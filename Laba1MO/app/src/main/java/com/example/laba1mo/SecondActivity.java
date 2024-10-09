package com.example.laba1mo;

import androidx.appcompat.app.AppCompatActivity; // Импорт класса AppCompatActivity
import android.os.Bundle; // Импорт класса Bundle
import android.view.View; // Импорт класса View
import android.widget.TextView; // Импорт класса TextView

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Используем тот же XML файл

        // Получаем параметр, переданный из первой активности
        String surname = getIntent().getStringExtra("surname");

        // Находим TextView и отображаем переданный параметр
        TextView textView = findViewById(R.id.textView);
        textView.setText("Переданный параметр: " + surname);
        textView.setVisibility(View.VISIBLE);  // Делаем текстовое поле видимым
    }
}
