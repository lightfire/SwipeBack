package com.liuguangqiang.swiplebacksample;

import android.app.Activity;
import android.os.Bundle;

import com.liuguangqiang.progressbar.CircleProgressBar;
import com.liuguangqiang.swipeback.SwipeBackLayout;

/**
 * Project : SwipeBack
 * Edited by Kadir 07/10/17
 * Created by Eric on 15/2/27.
 */
public class DemoActivity extends Activity {

    private CircleProgressBar progressBar;

    @SuppressWarnings("FieldCanBeLocal")
    private SwipeBackLayout swipeBackLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        initViews();
    }

    private void initViews() {
        progressBar = findViewById(R.id.progressbar1);
        swipeBackLayout = findViewById(R.id.swipe_layout);
        swipeBackLayout.setEnableFlingBack(false);

        swipeBackLayout.setOnSwipeBackListener(new SwipeBackLayout.SwipeBackListener() {
            @Override
            public void onViewPositionChanged(float fractionAnchor, float fractionScreen) {
                progressBar.setProgress((int) (progressBar.getMax() * fractionAnchor));
            }
        });
    }

}
