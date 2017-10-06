package com.liuguangqiang.swiplebacksample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.liuguangqiang.swipeback.SwipeBackActivity;
import com.liuguangqiang.swipeback.SwipeBackLayout;
import com.liuguangqiang.swiplebacksample.adapter.TestAdapter;

/**
 * Edited by Kadir on 07/10/17.
 * Created by Eric on 15/2/27.
 */
public class ViewPagerActivity extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);
        initViews();
        setDragEdge(SwipeBackLayout.DragEdge.LEFT);
    }

    private void initViews() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.title_activity_viewpager);
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);

        ViewPager viewPager = findViewById(R.id.viewpager_demo);
        TestAdapter adapter = new TestAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

    }

}
