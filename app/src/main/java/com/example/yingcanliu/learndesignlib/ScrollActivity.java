package com.example.yingcanliu.learndesignlib;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.yingcanliu.learndesignlib.Behavior.DependentBehavior;

public class ScrollActivity extends AppCompatActivity {

    private TextView depentent;
    private TextView depentent2;

    private void assignViews() {
        depentent = (TextView) findViewById(R.id.depentent);
        depentent2 = (TextView) findViewById(R.id.depentent2);
        depentent2.setTag(DependentBehavior.TAG);
        depentent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewCompat.offsetTopAndBottom(v, 10);
            }
        });
        depentent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewCompat.offsetTopAndBottom(v, 10);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
    }
}
