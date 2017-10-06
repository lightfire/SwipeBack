package com.liuguangqiang.swiplebacksample;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;

import com.liuguangqiang.swipeback.SwipeBackActivity;
import com.liuguangqiang.swipeback.SwipeBackLayout;

/**
 * Edited by Kadir on 07/10/17.
 * Created by Eric on 15/6/1.
 */
@SuppressWarnings("FieldCanBeLocal")
public class WebViewActivity extends SwipeBackActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        setDragEdge(SwipeBackLayout.DragEdge.BOTTOM);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.title_activity_webview);
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);

        initViews();
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void initViews() {
        webView = findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://github.com");
    }

}
