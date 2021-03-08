package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button mButtonZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        mButtonZero = (Button) findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        if (mCount % 2 == 1){
            mShowCount.setBackgroundColor(Color.GREEN);
        }else {
            mShowCount.setBackgroundColor(Color.RED);
        }
        mButtonZero.setBackgroundColor(Color.rgb(203,69,204));

    }

    public void set_showcount_0(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        mButtonZero.setBackgroundColor(Color.rgb(128,128,128));
    }
}