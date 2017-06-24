package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private final int[] mArrayBall = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };

    private Button mButtonAsk;
    private ImageView mImageViewBall;

    Random mRandomNumberGenerate = new Random();
    private int mRandomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonAsk = (Button) findViewById(R.id.activity_main_btn_ask);
        mImageViewBall = (ImageView) findViewById(R.id.activity_main_iv_magic_ball);

        mButtonAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRandomNumber = mRandomNumberGenerate.nextInt(5);
                mImageViewBall.setImageResource(mArrayBall[mRandomNumber]);
            }
        });
    }
}
