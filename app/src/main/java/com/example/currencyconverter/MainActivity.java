package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonNext(View v){
        Button btn = (Button) v;
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
        String currency = "YEN";
        
        int id = rg.getCheckedRadioButtonId();
        if (id == R.id.YEN) {
            currency = "YEN";
        }
        else if (id == R.id.CAD){
            currency = "CAD";
        }
        else if (id == R.id.EUR){
            currency = "EUR";
        } 

        Intent myIntent = new Intent(this, SecondActivity.class);
        myIntent.putExtra("Currency", currency);
        startActivity(myIntent);
    }
}