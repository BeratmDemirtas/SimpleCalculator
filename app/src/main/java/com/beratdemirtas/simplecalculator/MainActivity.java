package com.beratdemirtas.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNumberText,secondNumberText;
    TextView myResultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberText=findViewById(R.id.firstNumberText);
        secondNumberText=findViewById(R.id.secondNumberText);
        myResultText=findViewById(R.id.myResultText);

    }
    public void sum(View view){
        if (firstNumberText.getText().toString().matches("") || secondNumberText.getText().toString().matches("")){
            myResultText.setText("Enter Number!");
        } else {
            int firstNumber = Integer.parseInt(firstNumberText.getText().toString());
            int secondNumber = Integer.parseInt(secondNumberText.getText().toString());
            int result = firstNumber + secondNumber;

            myResultText.setText("Result: " + result);
        }
    }

    public void deduct(View view) {
        if (firstNumberText.getText().toString().matches("") || secondNumberText.getText().toString().matches("")) {
            myResultText.setText("Enter Number!");
        } else {
            int firstNumber = Integer.parseInt(firstNumberText.getText().toString());
            int secondNumber = Integer.parseInt(secondNumberText.getText().toString());
            int result = firstNumber - secondNumber;

            myResultText.setText("Result: " + result);
        }
    }
    public void multiply(View view) {
        if (firstNumberText.getText().toString().matches("") || secondNumberText.getText().toString().matches("")) {
            myResultText.setText("Enter Number!");
        } else {
            int firstNumber = Integer.parseInt(firstNumberText.getText().toString());
            int secondNumber = Integer.parseInt(secondNumberText.getText().toString());
            int result = firstNumber * secondNumber;

            myResultText.setText("Result: " + result);
        }
    }
    public void divide(View view) {
        if (firstNumberText.getText().toString().matches("") || secondNumberText.getText().toString().matches("")) {
            myResultText.setText("Enter Number!");
        } else {
            int firstNumber = Integer.parseInt(firstNumberText.getText().toString());
            int secondNumber = Integer.parseInt(secondNumberText.getText().toString());
            int result = firstNumber / secondNumber;

            myResultText.setText("Result: " + result);
        }
    }
}