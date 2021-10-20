package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // User can tap a button to change the color fo the textview
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the color of the textview
                ((TextView)findViewById(R.id.tv1)).setTextColor(getResources().getColor(R.color.yellow) );
            }
        });
        findViewById(R.id.changeBGBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.drkblue));
            }
        });

        findViewById(R.id.changeTxtBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.tv1)).setText("Android is Awesome");
            }
        });
        findViewById(R.id.resetBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.tv1)).setText("Hello from Qizong!");
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.bgcolor));
                ((TextView)findViewById(R.id.tv1)).setTextColor(getResources().getColor(R.color.black) );
            }
        });
        findViewById(R.id.changcusBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((TextView)findViewById(R.id.et1)).getText().toString().isEmpty()){
                    ((TextView) findViewById(R.id.tv1)).setText("Hello from Qizong!");
                }else {
                    ((TextView) findViewById(R.id.tv1)).setText(((TextView) findViewById(R.id.et1)).getText().toString());
                }
            }
        });

    }
}