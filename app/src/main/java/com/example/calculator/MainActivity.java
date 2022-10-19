package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, multi, AC, delete,
            divide, plus, subtract, equal;

    private TextView result, history;

    String enteredNumber = "";
    String histValue = "";
    char currentSign = ' ';

    private double lastNumber = 0;
    private double resultNumber = 0;

    private boolean haveFirst = false;
    private boolean eqlPressed = false;

    DecimalFormat wrapFormat = new DecimalFormat("##,##,##,##,###.##########");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initializeComponents();

        button0.setOnClickListener(v -> numberClick('0'));

        button1.setOnClickListener(v -> numberClick('1'));

        button2.setOnClickListener(v -> numberClick('2'));

        button3.setOnClickListener(v -> numberClick('3'));

        button4.setOnClickListener(v -> numberClick('4'));

        button5.setOnClickListener(v -> numberClick('5'));

        button6.setOnClickListener(v -> numberClick('6'));

        button7.setOnClickListener(v -> numberClick('7'));

        button8.setOnClickListener(v -> numberClick('8'));

        button9.setOnClickListener(v -> numberClick('9'));

        AC.setOnClickListener(v -> ac());

        delete.setOnClickListener(v -> {
            if(!eqlPressed) {
                String text = unWrapDecimal(result.getText().toString());
                String histText = history.getText().toString();
                if (text.length() > 0 && histText.length()>0) {
                    text = text.substring(0, text.length() - 1);
                    if(text.length()>0) result.setText(wrapFormat.format(Double.parseDouble(text)));
                    else result.setText("0");

                    history.setText(histText.substring(0, histText.length() - 1));
                    histValue = history.getText().toString();
                    enteredNumber = unWrapDecimal(result.getText().toString());
                } else {
                    delete.setClickable(false);
                }
            } else ac();
        });

        plus.setOnClickListener(v -> {
            signClicked('+');
        });

        subtract.setOnClickListener(v -> {
            signClicked('-');
        });

        divide.setOnClickListener(v -> {
            signClicked('/');
        });

        multi.setOnClickListener(v -> {
            signClicked('*');
        });

        equal.setOnClickListener(v -> equal());

    }

    private void ac() {
        result.setText("0");
        histValue = "";
        history.setText(histValue);
        enteredNumber = "";
        lastNumber = 0;
        resultNumber = 0;
        haveFirst = false;
    }


    private void equal() {
        lastNumber = Double.parseDouble(unWrapDecimal(result.getText().toString()));
        switch (currentSign) {
            case '+':
                resultNumber += lastNumber;
                break;
            case '-':
                resultNumber -= lastNumber;
                break;
            case '*':
                resultNumber *= lastNumber;
                break;
            case '/':
                resultNumber /= lastNumber;
                break;
            default:
                Toast.makeText(getApplicationContext(),"Internal error occurred in equal()",Toast.LENGTH_LONG).show();
        }
        result.setText(wrapFormat.format(resultNumber));
        histValue = wrapFormat.format(resultNumber);
        history.setText(histValue);
        enteredNumber = "";
        lastNumber = 0;
        currentSign = ' ';
        eqlPressed = true;
    }


    private void signClicked(char sign) {
        if(haveFirst) {
            lastNumber = Double.parseDouble(unWrapDecimal(result.getText().toString()));
            switch (currentSign) {
                case '+':
                    resultNumber += lastNumber;
                    break;
                case '-':
                    resultNumber -= lastNumber;
                    break;
                case '*':
                    resultNumber *= lastNumber;
                    break;
                case '/':
                    resultNumber /= lastNumber;
                    break;
                default:
                    Toast.makeText(getApplicationContext(),"Internal error occurred in signClicked()",Toast.LENGTH_LONG).show();
            }
            lastNumber = resultNumber;
        } else {
            resultNumber = Double.parseDouble(unWrapDecimal(result.getText().toString()));
            haveFirst = true;
        }
        histValue += sign;
        history.setText(histValue);
        currentSign = sign;
        result.setText("0");
        enteredNumber = "";
        lastNumber = 0;
        eqlPressed = false;
    }


    private void callHist(String hist) {
    }


    private void btnMethod() {


    }

    private void numberClick(char num) {
        if(!eqlPressed)
            if (result.getText().toString().length() > 0) delete.setClickable(true);
        else
            ac();
        enteredNumber += num;
        result.setText(wrapFormat.format(Double.parseDouble(enteredNumber)));
        histValue += num;
        history.setText(histValue);
        eqlPressed = false;
    }

    private void initializeComponents() {
        button0 = findViewById(R.id.button0);
        button9 = findViewById(R.id.button9);
        button8 = findViewById(R.id.button8);
        button7 = findViewById(R.id.button7);
        button6 = findViewById(R.id.button6);
        button5 = findViewById(R.id.button5);
        button4 = findViewById(R.id.button4);
        button3 = findViewById(R.id.button3);
        button2 = findViewById(R.id.button2);
        button1 = findViewById(R.id.button1);
        AC = findViewById(R.id.buttonAC);
        multi = findViewById(R.id.buttonMulti);
        delete = findViewById(R.id.buttonDelete);
        divide = findViewById(R.id.buttonDivide);
        plus = findViewById(R.id.buttonPlus);
        subtract = findViewById(R.id.buttonMinus);
        equal = findViewById(R.id.buttonEqual);

        history = findViewById(R.id.textViewHistory);
        result = findViewById(R.id.textViewResult);
    }

    private String unWrapDecimal(String string) {
        return string.replaceAll(",","");
    }



}