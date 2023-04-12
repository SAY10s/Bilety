package com.example.bilety;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn);
        EditText input =  (EditText) findViewById(R.id.text);
        TextView result =  (TextView) findViewById(R.id.view);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int inputKM = Integer.parseInt(input.getText().toString());

                if(inputKM > 0 & inputKM <= 10){
                    result.setText("Należność: 2zł");
                }else if(inputKM > 10  & inputKM <= 30){
                    double cena = inputKM * 0.1 + 1;
                    result.setText("Należność: " + cena);
                }else if(inputKM > 30){
                    double cena = inputKM * 0.08 + 1;
                    result.setText("Należność: " + cena);
                }

            }
        });
    }
}