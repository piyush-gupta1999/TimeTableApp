package com.example.android.test;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView birdImageView;
    public void screenClicked(View v)
    {
        birdImageView.animate().translationYBy(-100f).setDuration(1000);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        birdImageView = (ImageView)findViewById(R.id.birdImageView);

        final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                birdImageView.animate().translationYBy(100000000f).setDuration(1000000);
            }
        };
        handler.post(run);
    }
}
