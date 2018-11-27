package com.example.devalodh.customcounter;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mView = (TextView)findViewById(R.id.textView);
    }

    public void showToast(View view) {
        Toast t = Toast.makeText(this,"Hello",Toast.LENGTH_SHORT);
        t.show();

    }

    public void reset(View view) {
        mView.setText("0");
        mCount = 0;
        mView.setTextColor(Color.GRAY);
    }


    public void Count(View view) {
        mCount++;
        if(mView != null){
            mView.setText(Integer.toString(mCount));
            if(mCount%2 == 0)
                mView.setTextColor(Color.RED);
            else
                mView.setTextColor(Color.GREEN);
        }
    }
}
