package com.example.tute2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.Tute02.Message";

    private Button button;
    private EditText txt1;
    private EditText txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        txt1 = (EditText) findViewById(R.id.editText4);
        txt2 = (EditText) findViewById(R.id.editText5);

    }

    public void onClick(View view){
        Intent i = new Intent(this, SecondActivity.class);
        String data1 = txt1.getText().toString();
        String data2 = txt2.getText().toString();

        i.putExtra("A",data1);
        i.putExtra("B",data2);
        startActivity(i);
        finish();

        Context context = getApplicationContext();
        CharSequence text = "You just Clicked the OK button...";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(getApplicationContext(),"Sending Message....Wait!",Toast.LENGTH_LONG);
        toast.show();

        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0,0);
    }
}
