package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // function for 15% of  bill amount
    public void  fifteen_per(View v){
        EditText et1 = (EditText)findViewById(R.id.editTextText1);
        TextView t1 = (TextView)findViewById(R.id.textView2);
        int n1 = Integer.parseInt(et1.getText().toString());
        double result = Double.parseDouble(String.format("%.2f", n1 * 0.15));
        t1.setText("Tip: $"+ Double.toString(result) + ", Total Bill: $" + n1);
    }

    // function for 15% of  bill amount
    public void  eighteen_per(View v){
        EditText et2 = (EditText)findViewById(R.id.editTextText1);
        TextView t2 = (TextView)findViewById(R.id.textView2);
        int n2 = Integer.parseInt(et2.getText().toString());
        double result2 = Double.parseDouble(String.format("%.2f", n2 * 0.18));
        t2.setText("Tip: $"+ Double.toString(result2) + ", Total Bill: $" + n2);
    }

    // function for 15% of  bill amount
    public void  twenty_per(View v){
        EditText et3 = (EditText)findViewById(R.id.editTextText1);
        TextView t3 = (TextView)findViewById(R.id.textView2);
        int n3 = Integer.parseInt(et3.getText().toString());
        double result3 = Double.parseDouble(String.format("%.2f", n3 * 0.2));
        t3.setText("Tip: $"+ Double.toString(result3) + ", Total Bill: $" + n3);
    }
}