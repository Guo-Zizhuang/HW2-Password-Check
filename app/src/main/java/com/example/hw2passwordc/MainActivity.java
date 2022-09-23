package com.example.hw2passwordc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edtOp1;
    private EditText edtOp2;
    private Button Button_Check;
    private TextView result_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtOp1 = (EditText) findViewById(R.id.edtOp1);
        edtOp2 = (EditText) findViewById(R.id.edtOp2);
        result_txt = (TextView) findViewById(R.id.result_txt);

        Button_Check = findViewById(R.id.Button_Check);
        Button_Check.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button button = (Button) view;
        String button_txt = button.getText().toString();
        String line1 = edtOp1.getText().toString();
        String line2 = edtOp2.getText().toString();

        if(button_txt.equals("Check")){
            if(line1.equals(line2)){
                result_txt.setText("THANK YOU!");
            }else{
                result_txt.setText("PASSWORDS MUST MATCH!");
            }
        }

        edtOp1.setText(line1);
        edtOp2.setText(line2);

    }
}