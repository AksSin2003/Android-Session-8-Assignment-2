package com.example.akshit.rainbow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class rainbow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rainbow);
        TextView red=(TextView)findViewById(R.id.textView);
        TextView orange=(TextView)findViewById(R.id.textView2);
        TextView green=(TextView)findViewById(R.id.textView3);
        TextView yellow=(TextView)findViewById(R.id.textView4);
        TextView blue=(TextView)findViewById(R.id.textView5);
        TextView indigo=(TextView)findViewById(R.id.textView6);
        TextView violet=(TextView)findViewById(R.id.textView7);
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(rainbow.this,"You Clicked Red!",Toast.LENGTH_SHORT).show();
            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(rainbow.this,"You Clicked Orange!",Toast.LENGTH_SHORT).show();
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(rainbow.this,"You Clicked Green!",Toast.LENGTH_LONG).show();

            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(rainbow.this,"You Clicked Yellow!",Toast.LENGTH_SHORT).show();
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(rainbow.this,"Youe Clicked Blue!",Toast.LENGTH_SHORT).show();
            }
        });
        indigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(rainbow.this,"Yoe Clicked Indigo!",Toast.LENGTH_SHORT).show();
            }
        });
        violet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(rainbow.this,"You Clicked Violet",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
