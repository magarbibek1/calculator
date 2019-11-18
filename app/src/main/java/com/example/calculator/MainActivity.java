package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etText;

    private Button btnOne, btnTwo, btnThree, btnAdd, btnFour, btnFive,
            btnSix, btnSub, btnSeven, btnEight, btnNine, btnMultiply, btnDot, btnZero, btnDivide,
            btnEqual, btnClear;
    public int value1, value2, result;

    boolean Add, Sub, Multi, Divide;
    char temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etText = findViewById(R.id.etText);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnAdd = findViewById(R.id.btnAdd);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSub = findViewById(R.id.btnSub);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDot = findViewById(R.id.btnDot);
        btnZero = findViewById(R.id.btnZero);
        btnDivide = findViewById(R.id.btnDivide);
        btnEqual = findViewById(R.id.btnEqual);
        btnClear=findViewById(R.id.btnClear);


        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "0");

            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "1");

            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "2");

            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "3");

            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value1 = Integer.parseInt(etText.getText() + "");
                temp='+';
                etText.setText(null);
            }



        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "4");

            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "5");

            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "6");

            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                value1 = Integer.parseInt(etText.getText() + "");
                temp='-';
                etText.setText(null);


            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "7");

            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "8");

            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "9");

            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                value1 = Integer.parseInt(etText.getText() + "");
                temp='*';
                etText.setText(null);
            }


        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + ".");

            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "0");

            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value1 = Integer.parseInt(etText.getText() + "");
                temp='/';
                etText.setText(null);
            }


        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2 = Integer.parseInt(etText.getText() + "");

                switch (temp) {

                    case '+':
                        calcu calculate = new calcu(value1, value2);
                        result = calculate.Add();
                        etText.setText(result + "");
                        break;
                    case '-':
                        calcu calculates= new calcu(value1,value2);
                        result=calculates.Sub();
                        etText.setText(result + "");
                        break;
                    case '*':
                        calcu cm= new calcu(value1, value2);
                        result= cm.Multiply();
                        etText.setText(result + "");
                        break;
                    case '/':
                        calcu cn= new calcu(value1, value2);
                        result= cn.Divide();
                        etText.setText(result + "");
                        break;


                }
                btnClear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        etText.setText("");

                    }
                });

            }
        });
    }
}
