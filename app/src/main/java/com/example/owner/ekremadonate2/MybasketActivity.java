package com.example.owner.ekremadonate2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MybasketActivity extends AppCompatActivity {
    private ArrayList arrayList;
    private List list;
    //    private ListView listView;
    private RecyclerView recycler_itemlist;
    private TextView tv_total;
    private CartListAdapter1 cartListAdapter;

    String jsonCartList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_mybasket );
        int total = 0;


        //Set back button to activity
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled( true );
            actionBar.setTitle( "Cart" );
            getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        }

        tv_total = (TextView) findViewById( R.id.tv_total );

//            recycler_itemlist =(RecyclerView) findViewById(R.id.recycler_cart);
        recycler_itemlist.setHasFixedSize( true );
        recycler_itemlist.setRecycledViewPool( new RecyclerView.RecycledViewPool() );
        recycler_itemlist.setLayoutManager( new LinearLayoutManager( this, LinearLayoutManager.VERTICAL, false ) );
        recycler_itemlist.getRecycledViewPool().setMaxRecycledViews( 0, 0 );

        cartListAdapter = new CartListAdapter( MybasketActivity.this, list );

    }

    }