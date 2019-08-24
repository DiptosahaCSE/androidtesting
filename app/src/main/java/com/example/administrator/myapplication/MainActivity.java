package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button b1,b2;
    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.outbutton);
        t1= (TextView)findViewById(R.id.test);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    @Override
    public void onClick(View view){
        if (view.getId() == R.id.b1) {
            t1.setText("Login Button is clicked ");
        }
        if (view.getId()==R.id.b2) {
            t1.setText("Logout button is clicked");

        }

    }
}
