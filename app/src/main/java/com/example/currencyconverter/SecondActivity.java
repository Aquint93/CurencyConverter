package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    String str;
    TextView txt;
    EditText input, exchangeRate;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        str = getIntent().getStringExtra("Currency");
        txt = (TextView) findViewById(R.id.CurrChosen);
        txt.setText(str);
        input = findViewById(R.id.UsAmt);
        exchangeRate = findViewById(R.id.ForeignAmt);

        if (str.equalsIgnoreCase("Yen"))
            exchangeRate.setText("109.94");

        else if (str.equalsIgnoreCase("Cad"))
            exchangeRate.setText("1.26");

        else if (str.equalsIgnoreCase("Eur"))
            exchangeRate.setText("0.85");

    }
    public void OnReturn(View v) {
        finish();
    }
    public void FromUsd(View v) {
        input = findViewById(R.id.UsAmt);
        exchangeRate = findViewById(R.id.ForeignAmt);
        double userNum = Double.parseDouble(input.getText().toString());


        if (str.equalsIgnoreCase("Yen")) {
            exchangeRate.setText((userNum*109.94)+"");
        }
        else if (str.equalsIgnoreCase("Cad")) {
            exchangeRate.setText((userNum*1.26)+"");
        }
        else if (str.equalsIgnoreCase("Eur")) {
            exchangeRate.setText((userNum*0.85)+"");
        }
        else
            exchangeRate.setText("");

    }
    public void ToUsd(View v) {
        input = findViewById(R.id.ForeignAmt);
        exchangeRate = findViewById(R.id.UsAmt);
        double userNum = Double.parseDouble(input.getText().toString());


        if (str.equalsIgnoreCase("Yen")) {
            exchangeRate.setText((userNum/109.94)+"");
        }
        else if (str.equalsIgnoreCase("Cad")) {
            exchangeRate.setText((userNum/1.26)+"");
        }
        else if (str.equalsIgnoreCase("Eur")) {
            exchangeRate.setText((userNum/0.85)+"");
        }
        else
            exchangeRate.setText("");
    }
}