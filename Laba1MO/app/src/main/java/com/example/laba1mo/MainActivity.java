package com.example.laba1mo;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Подключаем XML разметку

        // Находим кнопку и назначаем действие при нажатии
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переход на SecondActivity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                // Передаем параметр (фамилию)
                intent.putExtra("surname", "Федоренко");
                startActivity(intent);
            }
        });
    }
}
