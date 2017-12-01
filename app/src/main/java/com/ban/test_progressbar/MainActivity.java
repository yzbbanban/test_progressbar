package com.ban.test_progressbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private HorizontalProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
//        pb = (HorizontalProgressBar) findViewById(R.id.pb);
//        pb.setProgressListener(new HorizontalProgressBar.ProgressListener() {
//            @Override
//            public void currentProgressListener(float currentProgress) {
//
//            }
//        });
    }
}
