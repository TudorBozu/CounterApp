package com.example.viweexemple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // variabile
    Button button;
    TextView tet1,tet2;
    int conter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn);
        tet1 = findViewById(R.id.text1);
        tet2 = findViewById(R.id.text2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tet2.setText(" "+IncreseCounter());
            }
        });


    }
    public int IncreseCounter(){
      return++conter;

    }
}