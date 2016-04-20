package com.filipkesteli.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etFirstNumber;
    private EditText etSecondNumber;
    private Button btnAdd;
    private Button btnSubtract;
    private Button btnMultiply;
    private Button btnDivide;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setupListeners();
    }

    private void initWidgets() {
        etFirstNumber = (EditText) findViewById(R.id.etFirstNumber);
        etSecondNumber = (EditText) findViewById(R.id.etSecondNumber);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        tvResult = (TextView) findViewById(R.id.tvResult);
    }

    private void setupListeners() {
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFormOK()){
                    double first = Double.parseDouble(etFirstNumber.getText().toString());
                    double second = Double.parseDouble(etSecondNumber.getText().toString());
                    double result = first + second;
                    tvResult.setText(result+"");
                }
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFormOK()){
                    double first = Double.parseDouble(etFirstNumber.getText().toString());
                    double second = Double.parseDouble(etSecondNumber.getText().toString());
                    double result = first - second;
                    tvResult.setText(result+"");
                }
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFormOK()){
                    double first = Double.parseDouble(etFirstNumber.getText().toString());
                    double second = Double.parseDouble(etSecondNumber.getText().toString());
                    double result = first * second;
                    tvResult.setText(result+"");
                }
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFormOK()){
                    double first = Double.parseDouble(etFirstNumber.getText().toString());
                    double second = Double.parseDouble(etSecondNumber.getText().toString());
                    double result = first / second;
                    tvResult.setText(result+"");
                }
            }
        });
    }

    private boolean isFormOK() {

        if (etFirstNumber.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, R.string.please_enter_first, Toast.LENGTH_SHORT).show();
            etFirstNumber.requestFocus();
            return false;
        }

        if (etSecondNumber.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, R.string.please_enter_second, Toast.LENGTH_SHORT).show();
            etSecondNumber.requestFocus();
            return false;
        }

        return true;
    }
}
