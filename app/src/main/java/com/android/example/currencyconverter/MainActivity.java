package com.android.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button convert;

    public void convertCurrency(){
        Log.i("info", "button pressed");

        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal);

        String amountInDollars = editText.getText().toString();
        double amountInDollarsDouble = Double.parseDouble(amountInDollars);
        double amountInEurosDouble = amountInDollarsDouble * 0.91;
        String amountInEuros = String.format("%.2f", amountInEurosDouble);

        Toast.makeText(this, "€ " +amountInEuros, Toast.LENGTH_SHORT).show();
        Log.i("amount in euros",amountInEuros);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convert = (Button) findViewById(R.id.button);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertCurrency();
            }
        });
    }
}