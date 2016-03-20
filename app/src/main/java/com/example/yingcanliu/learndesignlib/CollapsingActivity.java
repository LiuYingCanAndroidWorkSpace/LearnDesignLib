package com.example.yingcanliu.learndesignlib;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.yingcanliu.learndesignlib.Adapter.CardAdapter;
import com.example.yingcanliu.learndesignlib.Model.CardVM;
import com.example.yingcanliu.learndesignlib.Utils.SetTranslucentStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/20.
 */
public class CollapsingActivity extends AppCompatActivity {

    private CoordinatorLayout mainContent;
    private AppBarLayout appbar;
    private CollapsingToolbarLayout collapsingToolbar;
    private ImageView backdrop;
    private Toolbar toolbar;
    private RecyclerView rv_collapsing;

    private void assignViews() {
        mainContent = (CoordinatorLayout) findViewById(R.id.main_content);
        appbar = (AppBarLayout) findViewById(R.id.appbar);
        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        backdrop = (ImageView) findViewById(R.id.backdrop);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("我就静静地看着你上天");
        toolbar.setCollapsible(false);

        rv_collapsing = (RecyclerView) findViewById(R.id.rv_collapsing);
        List mList = new ArrayList<>();
        mList.add(new CardVM("test", "test1"));
        mList.add(new CardVM("test", "test2"));
        mList.add(new CardVM("test", "test3"));
        mList.add(new CardVM("test", "test4"));
        mList.add(new CardVM("test", "test5"));
        mList.add(new CardVM("test", "我就静静的看着你上天"));
        rv_collapsing.setLayoutManager(new LinearLayoutManager(this));
        rv_collapsing.setAdapter(new CardAdapter(mList));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_collapsingtoobar);
        assignViews();
        SetTranslucentStatus.setTranslucentStatus(this, true);
    }

}
