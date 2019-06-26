package com.example.day01;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private DrawerLayout mDr;
    private TabLayout mTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initView();
        initData();
    }

    private void initData() {

    }

    private void initView() {
        mDr = (DrawerLayout) findViewById(R.id.Dr);
        mTable = (TabLayout) findViewById(R.id.table);
    }
}
