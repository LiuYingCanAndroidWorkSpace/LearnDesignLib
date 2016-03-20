package com.example.yingcanliu.learndesignlib;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.yingcanliu.learndesignlib.Adapter.CardAdapter;
import com.example.yingcanliu.learndesignlib.Model.CardVM;
import com.example.yingcanliu.learndesignlib.Utils.SetTranslucentStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yingcan.liu on 2016/3/18.
 */
public class AppBarLayoutActivity extends AppCompatActivity {

    private CoordinatorLayout mainContent;
    private AppBarLayout appbar;
    private Toolbar toolbar;
    private TabLayout tabs;
    private RecyclerView rv_main;
    private FloatingActionButton fab;
    private List<CardVM> mList;

    private void assignViews() {
        mainContent = (CoordinatorLayout) findViewById(R.id.main_content);
        appbar = (AppBarLayout) findViewById(R.id.appbar);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabs = (TabLayout) findViewById(R.id.tabs);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        rv_main = (RecyclerView) findViewById(R.id.rv_main);
    }

    private void assignData(){
        mList = new ArrayList<>();
        mList.add(new CardVM("test", "test1"));
        mList.add(new CardVM("test", "test2"));
        mList.add(new CardVM("test", "test3"));
        mList.add(new CardVM("test", "test4"));
        mList.add(new CardVM("test", "test5"));
        mList.add(new CardVM("test", "我就静静的看着你上天"));
        rv_main.setLayoutManager(new LinearLayoutManager(this));
        rv_main.setAdapter(new CardAdapter(mList));
        setSupportActionBar(toolbar);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(fab, "Hi~This is Snackbar", Snackbar.LENGTH_LONG).setAction("cancel", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(AppBarLayoutActivity.this, "Hello~", Toast.LENGTH_SHORT).show();
                    }
                }).show();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_appbar);
        assignViews();
        assignData();
        SetTranslucentStatus.setTranslucentStatus(this, true);
    }
}
