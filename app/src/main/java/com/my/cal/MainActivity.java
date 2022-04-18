package com.my.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button A1, A2, A3, A4, A5, A6, A7, A8, A9, A0, A00, plus, muins, multi,division, equal, per, point, ac;
    TextView text_number;
    int first_num, second_num;
    char ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_number = findViewById(R.id.text_num);
        A1 = findViewById(R.id.one);
        A2 = findViewById(R.id.two);
        A3 = findViewById(R.id.three);
        A4 = findViewById(R.id.four);
        A5 = findViewById(R.id.five);
        A6 = findViewById(R.id.six);
        A7 = findViewById(R.id.seven);
        A8 = findViewById(R.id.eight);
        A9 = findViewById(R.id.nine);
        A0 = findViewById(R.id.zero);
        A00 = findViewById(R.id.d_zero);
        equal = findViewById(R.id.equal);
        muins = findViewById(R.id.muins);
        multi = findViewById(R.id.multi);
        plus = findViewById(R.id.plus);
        per = findViewById(R.id.per);
        point = findViewById(R.id.point);
        division = findViewById(R.id.division);
        ac = findViewById(R.id.ac);

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_number.setText("");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                first_num = Integer.parseInt(text_number.getText().toString());
                text_number.setText("");
                ope = '+';

            }
        });
        muins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                first_num = Integer.parseInt(text_number.getText().toString());
                text_number.setText("");
                ope = '-';

            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                first_num = Integer.parseInt(text_number.getText().toString());
                text_number.setText("");
                ope = '*';

            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                first_num = Integer.parseInt(text_number.getText().toString());
                text_number.setText("");
                ope = '/';

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(ope == '+'){
                    second_num = Integer.parseInt(text_number.getText().toString());
                    addition();

                }else if(ope == '-') {
                    second_num = Integer.parseInt(text_number.getText().toString());
                    sub();
                }else if(ope == '*') {
                    second_num = Integer.parseInt(text_number.getText().toString());
                    multi();
                }else if(ope == '/'){
                    second_num = Integer.parseInt(text_number.getText().toString());
                    division();
                }
            }
        });

        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "1");
            }
        });
        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "2");
            }
        });
        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "3");
            }
        });
        A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "4");
            }
        });
        A5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "5");
            }
        });
        A6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "6");
            }
        });
        A7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "7");
            }
        });
        A8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "8");
            }
        });
        A9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "9");
            }
        });
        A0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "0");
            }
        });
        A00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_number.getText().toString();
                text_number.setText(num + "00");
            }
        });
    }

    void addition() {

        int sum = first_num + second_num;
        text_number.setText("" + sum);

    }

    void sub() {

        int sum = first_num - second_num;
        text_number.setText("" + sum);

    }

    void multi() {

        int sum = first_num * second_num;
        text_number.setText("" + sum);

    }

    void division() {

        int sum = first_num / second_num;
        text_number.setText("" + sum);

    }

}