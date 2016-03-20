package com.example.yingcanliu.learndesignlib;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016/3/20.
 */
public class CollapsingActivity extends AppCompatActivity {

    private CoordinatorLayout mainContent;
    private AppBarLayout appbar;
    private CollapsingToolbarLayout collapsingToolbar;
    private ImageView backdrop;
    private Toolbar toolbar;

    private void assignViews() {
        mainContent = (CoordinatorLayout) findViewById(R.id.main_content);
        appbar = (AppBarLayout) findViewById(R.id.appbar);
        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        backdrop = (ImageView) findViewById(R.id.backdrop);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("我就静静地看着你上天");
        toolbar.setCollapsible(false);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_collapsingtoobar);
        assignViews();
    }
}
