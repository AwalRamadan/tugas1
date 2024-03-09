package com.example.tmobilecomputing1;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.findViewById(R.id.LP).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent packageContext = new Intent();
                Intent open = new Intent(MainActivity.this, ForgotPassword.class);
                startActivity(open);
            }


        });

        this.findViewById(R.id.Daftar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent packageContext = new Intent();
                Intent open = new Intent(MainActivity.this, Registeractivity.class);
                startActivity(open);
            }
        });
    }
}