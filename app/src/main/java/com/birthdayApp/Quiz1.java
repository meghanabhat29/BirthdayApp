package com.birthdayApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz1 extends AppCompatActivity {

    RadioGroup Question1, Question2, Question3;
    Button Submit1, Submit2, Submit3, Reward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        Question1 = findViewById(R.id.q1options);
        Question2 = findViewById(R.id.q2options);
        Question3 = findViewById(R.id.q3options);
        Submit1 = findViewById(R.id.q1Submit);
        Submit2 = findViewById(R.id.q2Submit);
        Submit3 = findViewById(R.id.q3Submit);
        Reward = findViewById(R.id.nextButton2);

        Submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedradioID = Question1.getCheckedRadioButtonId();
                RadioButton selectedradioButton = findViewById(selectedradioID);
                if(selectedradioButton.getText().equals("Bingo")) {
                    Submit2.setVisibility(View.VISIBLE);
                    Toast.makeText(Quiz1.this, "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(Quiz1.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
            }
        });

        Submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedradioID = Question2.getCheckedRadioButtonId();
                RadioButton selectedradioButton = findViewById(selectedradioID);
                if(selectedradioButton.getText().equals("Stree")) {
                    Submit3.setVisibility(View.VISIBLE);
                    Toast.makeText(Quiz1.this, "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(Quiz1.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
            }
        });

        Submit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedradioID = Question3.getCheckedRadioButtonId();
                RadioButton selectedradioButton = findViewById(selectedradioID);
                if(selectedradioButton.getText().equals("Toothbrush")) {
                    Reward.setVisibility(View.VISIBLE);
                    Toast.makeText(Quiz1.this, "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(Quiz1.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
            }
        });

        Reward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz1.this, Nalapaaka.class);
                startActivity(intent);
            }
        });
    }
}
