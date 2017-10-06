package com.liuguangqiang.swiplebacksample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCommon;
    private Button btnListView;
    private Button btnDemo;
    private Button btnViewPager;
    private Button btnWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_common:
                skipActivity(CommonActivity.class);
                break;
            case R.id.btn_ListView:
                skipActivity(ListViewActivity.class);
                break;
            case R.id.btn_demo:
                skipActivity(DemoActivity.class);
                break;
            case R.id.btn_viewpager:
                skipActivity(ViewPagerActivity.class);
                break;
            case R.id.btn_webview:
                skipActivity(WebViewActivity.class);
                break;
        }
    }

    private void initViews() {
        btnCommon = findViewById(R.id.btn_common);
        btnCommon.setOnClickListener(this);

        btnListView = findViewById(R.id.btn_ListView);
        btnListView.setOnClickListener(this);

        btnDemo = findViewById(R.id.btn_demo);
        btnDemo.setOnClickListener(this);

        btnViewPager = findViewById(R.id.btn_viewpager);
        btnViewPager.setOnClickListener(this);

        btnWebView = findViewById(R.id.btn_webview);
        btnWebView.setOnClickListener(this);
    }

    private void skipActivity(Class<?> classOf) {
        Intent intent = new Intent(getApplicationContext(), classOf);
        startActivity(intent);
    }

}
