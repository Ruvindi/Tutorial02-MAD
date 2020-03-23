package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {



    Button add, sub, mul, div;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        final String num1 = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE);
        final String num2 = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE2);

        EditText editText1 = findViewById(R.id.editText3);
        editText1.setText(num1);

        EditText editText2 = findViewById(R.id.editText4);
        editText2.setText(num2);

        add = (Button) findViewById(R.id.button7);
        sub = (Button) findViewById(R.id.button2);
        mul = (Button) findViewById(R.id.button8);
        div = (Button) findViewById(R.id.button6);

        result = (TextView) findViewById(R.id.output);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ans  = Integer.parseInt(num1) + Integer.parseInt(num2);
                String x = String.valueOf(num1 +"+"+ num2 +"=" + ans);

                result.setText(x);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ans  = Integer.parseInt(num1) - Integer.parseInt(num2);
                String x = String.valueOf(num1 +"-"+ num2 +"=" + ans);

                result.setText(x);
            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ans  = Integer.parseInt(num1) * Integer.parseInt(num2);
                String x = String.valueOf(num1 +"*"+ num2 +"=" + ans);

                result.setText(x);
            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ans  = Integer.parseInt(num1) / Integer.parseInt(num2);
                String x = String.valueOf(num1 +"/"+ num2 +"=" + ans);

                result.setText(x);
            }
        });



    }
}
