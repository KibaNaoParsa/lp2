package com.example.alunos.fatorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText txt = (EditText) findViewById(R.id.boxNumber);
    TextView txtv = (TextView) findViewById(R.id.boxText);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean verifier(View vi) {
        String val = txt.getText().toString();
        int valor = Integer.parseInt(val);
        if (valor % 1 == 0)
            return true;
        return false;
    }

    public void printer(View vi, String val) {
        txtv.setText(val);

    }

    public void fatorial(View vi) {
        if (!verifier(vi))
            return;

        String value = txt.getText().toString();
        int valor = Integer.parseInt(value);
        int fat = 1;
        for (int i = 1; i <= valor; i++)
            fat *= i;

        String val = String.valueOf(fat);

        printer(vi, val);
    }
}
