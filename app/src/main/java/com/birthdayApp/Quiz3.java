package com.birthdayApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz3 extends AppCompatActivity {

    RadioGroup Question1, Question2, Question3;
    Button Submit1, Submit2, Submit3, Reward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);

        Question1 = findViewById(R.id.q1optionsquiz3);
        Question2 = findViewById(R.id.q2optionsquiz3);
        //Question3 = findViewById(R.id.q3optionsquiz3);
        Submit1 = findViewById(R.id.q1Submitquiz3);
        Submit2 = findViewById(R.id.q2Submitquiz3);
        //Submit3 = findViewById(R.id.q3Submitquiz3);
        Reward = findViewById(R.id.nextButtonquiz3);

        Submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedradioID = Question1.getCheckedRadioButtonId();
                RadioButton selectedradioButton = findViewById(selectedradioID);
                if(selectedradioButton.getText().equals("Neehar, even I am single and ready to mingle, you know.")) {
                    Submit2.setVisibility(View.VISIBLE);
                    Toast.makeText(Quiz3.this, "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(Quiz3.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
            }
        });

        Submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedradioID = Question2.getCheckedRadioButtonId();
                RadioButton selectedradioButton = findViewById(selectedradioID);
                if(selectedradioButton.getText().equals("Thatha")) {
                    Reward.setVisibility(View.VISIBLE);
                    Toast.makeText(Quiz3.this, "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(Quiz3.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
            }
        });



        Reward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Homies.class);
                startActivity(intent);
            }
        });
    }
}
