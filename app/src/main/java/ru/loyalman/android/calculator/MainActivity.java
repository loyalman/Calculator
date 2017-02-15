package ru.loyalman.android.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Button mPlusButton;
    private Button mMinusButton;
    private Button mMultiplyButton;
    private Button mDivideButton;
    private Button mClearButton;
    private TextView mTypingTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPlusButton=(Button)findViewById(R.id.plusButton);
        mMinusButton=(Button) findViewById(R.id.minusButton);
        mMultiplyButton=(Button) findViewById(R.id.multiplyButton);
        mDivideButton=(Button) findViewById(R.id.divideButton);
        mClearButton=(Button) findViewById(R.id.clearButton);
        mTypingTextView=(TextView)findViewById(R.id.typingTextView);
        mPlusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTypingTextView.setText(mTypingTextView.getText()+"+");
            }
        });
        mMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTypingTextView.setText(mTypingTextView.getText()+"-");
            }
        });
        mMultiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTypingTextView.setText(mTypingTextView.getText()+"*");
            }
        });
        mDivideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTypingTextView.setText(mTypingTextView.getText()+"/");
            }
        });
        mClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTypingTextView.setText("");
            }
        });
    }
}
