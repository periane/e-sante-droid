package com.example.peria.e_sant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AuthentificationActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentification);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.btn1:
                i = new Intent(this, LoginActivity.class);
                startActivity(i)
                ;
                break;
            case R.id.btn2:
                i = new Intent(this, LoginActivity.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}