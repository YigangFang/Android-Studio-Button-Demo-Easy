package com.aidenfang.button_demo;
//tested by YF and worked like a charm!

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);

        btn1.setOnClickListener(myListener);
        btn2.setOnClickListener(myListener);
        btn3.setOnClickListener(myListener);
    }

    private View.OnClickListener myListener = new View.OnClickListener() {
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button1:
                    //button1
                    Toast.makeText(MainActivity.this, "Button 1 Clicked", Toast.LENGTH_LONG).show();
                    break;
                case R.id.button2:
                    //button2
                    Toast.makeText(MainActivity.this, "Button 2 Clicked", Toast.LENGTH_LONG).show();
                    break;
                case R.id.button3:
                    //button3
                    Toast.makeText(MainActivity.this, "Button 3 Clicked", Toast.LENGTH_LONG).show();
                    break;
                default:

            }
        }
    };
}

