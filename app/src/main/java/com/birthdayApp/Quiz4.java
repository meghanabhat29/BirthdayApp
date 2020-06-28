package com.birthdayApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz4 extends AppCompatActivity {

    RadioGroup Question1, Question2, Question3;
    Button Submit1, Submit2, Submit3, Reward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);

        Question1 = findViewById(R.id.q1optionsquiz4);
        //Question2 = findViewById(R.id.q2optionsquiz4);
        Question3 = findViewById(R.id.q3optionsquiz4);
        Submit1 = findViewById(R.id.q1Submitquiz4);
        //Submit2 = findViewById(R.id.q2Submitquiz4);
        Submit3 = findViewById(R.id.q3Submitquiz4);
        Reward = findViewById(R.id.nextButtonquiz4);

        Submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedradioID = Question1.getCheckedRadioButtonId();
                RadioButton selectedradioButton = findViewById(selectedradioID);
                if(selectedradioButton.getText().equals("School")) {
                    Submit3.setVisibility(View.VISIBLE);
                    Toast.makeText(Quiz4.this, "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(Quiz4.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
            }
        });

        Submit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedradioID = Question3.getCheckedRadioButtonId();
                RadioButton selectedradioButton = findViewById(selectedradioID);
                if(selectedradioButton.getText().equals("1522")) {
                    Reward.setVisibility(View.VISIBLE);
                    Toast.makeText(Quiz4.this, "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(Quiz4.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
            }
        });


        Reward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Memories.class);
                startActivity(intent);
            }
        });
    }
}
