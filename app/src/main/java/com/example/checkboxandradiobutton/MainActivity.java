package com.example.checkboxandradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.CheckBox;
public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton selectedRadioButton;
    Button buttonSubmit;
    CheckBox cb1, cb2, cb3, cb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // layout instances
        buttonSubmit = (Button) findViewById(R.id.btnSubmit);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        cb4 = (CheckBox) findViewById(R.id.cb4);

        /*
            Submit Button
        */
        buttonSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Get the selected RadioButton
                selectedRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
                // get RadioButton text
                String yourVote = selectedRadioButton.getText().toString();

                String checkBoxChoices = "";

                if (cb1.isChecked()) {
                    checkBoxChoices += cb1.getText().toString() + "\tYES";
                } else {
                    checkBoxChoices += cb1.getText().toString() + "\tNO";
                }

                if (cb2.isChecked()) {
                    checkBoxChoices += cb2.getText().toString() + "\tYES";
                } else {
                    checkBoxChoices += cb2.getText().toString() + "\tNO";
                }

                if (cb3.isChecked()) {
                    checkBoxChoices += cb3.getText().toString() + "\tYES";
                } else {
                    checkBoxChoices += cb3.getText().toString() + "\tNO";
                }

                if (cb4.isChecked()) {
                    checkBoxChoices += cb4.getText().toString() + "\tYES";
                } else {
                    checkBoxChoices += cb4.getText().toString() + "\tNO";
                }

                // display it as Toast to the user

                Toast.makeText(MainActivity.this, "Selected Radio Button is:" + yourVote + "\n CheckBox Choices: \n " + checkBoxChoices, Toast.LENGTH_LONG).show();

            }
        });
    }
}