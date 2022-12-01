package com.kampusmerdeka.finalproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView inputOutput;
    String oldNumber = "";
    String op = "+";
    Boolean isNewOp = true;
    Button btnDell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputOutput = findViewById(R.id.inputOutput);

        btnDell = findViewById(R.id.btnDell);
        btnDell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputOutput.setText("");
            }
        });
    }

    public void numberEvent(View view) {
        if(isNewOp){
            inputOutput.setText("");
            isNewOp = false;
        }
        String angka = inputOutput.getText().toString();
        switch (view.getId()){
            case R.id.btn0:
                angka+="0";
                break;
            case R.id.btn1:
                angka+="1";
                break;
            case R.id.btn2:
                angka+="2";
                break;
            case R.id.btn3:
                angka+="3";
                break;
            case R.id.btn4:
                angka+="4";
                break;
            case R.id.btn5:
                angka+="5";
                break;
            case R.id.btn6:
                angka+="6";
                break;
            case R.id.btn7:
                angka+="7";
                break;
            case R.id.btn8:
                angka+="8";
                break;
            case R.id.btn9:
                angka+="9";
                break;
            case R.id.btnTitik:
                angka+=".";
                break;
        }
        inputOutput.setText(angka);



    }

    public void operatorEvent(View view) {
        isNewOp = true;
        oldNumber = inputOutput.getText().toString();
        switch (view.getId()){
            case R.id.btnTambah: op = "+"; break;
            case R.id.btnMines: op = "-"; break;
            case R.id.btnKali: op = "*"; break;
            case R.id.btnBagi: op = "/"; break;
        }
        inputOutput.setText("");
    }

    public void jawaban(View view) {
        String newNumber = inputOutput.getText().toString();
        double hasil = 0.0;
        switch (op){
            case "+":
                hasil = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
                break;
            case "-":
                hasil = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
                break;
            case "*":
                hasil = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
                break;
            case "/":
                hasil = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
                break;
        }
        inputOutput.setText(hasil+"");
    }

    public void percentEvent(View view) {
        double no = Double.parseDouble(inputOutput.getText().toString())/100;
        inputOutput.setText(no+"");
        isNewOp = true;
    }


}