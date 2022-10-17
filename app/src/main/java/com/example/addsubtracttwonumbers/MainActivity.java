package com.example.addsubtracttwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mEditNum1,mEditNum2;
    TextView mTextResult;
    Button btnAdd;
    Button btnSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditNum1=(EditText)findViewById(R.id.etNum1);
        mEditNum2=(EditText)findViewById(R.id.etNum2);
        mTextResult= (TextView) findViewById(R.id.tvResult);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        onAdd();
        btnSub=(Button)findViewById(R.id.btnSub);
        onSub();
    }


    private void onAdd() {
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(mEditNum1.getText().toString());
                int num2=Integer.parseInt(mEditNum2.getText().toString());
                int result=num1+num2;
                mTextResult.setText(Integer.toString(result));
            }
        })
    ;}

    private void onSub() {
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(mEditNum1.getText().toString());
                int num2=Integer.parseInt(mEditNum2.getText().toString());
                int result=num1-num2;
                mTextResult.setText(Integer.toString(result));
            }
        });
    }
}