package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class FirstActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.IntentsProj.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.example.IntentsProj.MESSAGE2";

    private Button bOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        bOK = (Button) findViewById(R.id.button);
        bOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity();
            }
        });
    }


    public void openSecondActivity(){

        Intent intent = new Intent(this, SecondActivity.class);

        Context context = getApplicationContext();
        CharSequence message = "You just clicked the OK button";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,message,duration);

        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER , 0 , 0);

        toast.show();

        EditText editText1 = (EditText) findViewById(R.id.input1);
        EditText editText2 = (EditText) findViewById(R.id.input2);

        String num1 = editText1.getText().toString();
        String num2 = editText2.getText().toString();

        
        intent.putExtra(EXTRA_MESSAGE, num1);
        intent.putExtra(EXTRA_MESSAGE2, num2);

        startActivity(intent);

    }
}
