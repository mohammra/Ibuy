package com.example.mamun.ibuy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView=(ListView) findViewById(R.id.list);

        ProductList listPresident=ProductList.getProductList();
        listProduct.addProduct("Sheik Muzibur Rahman",1920,1975,"Bangladesh");
        listProduct.addProduct("Ziaur Rahman",1936,1981,"Bangladesh");


        Log.d("here", "I am here");

        ArrayList<String> a=ProductList.getProductList().getAllPresident();

        ArrayAdapter arrayAdapter=new ArrayAdapter(list.this,android.R.layout.simple_list_item_1,a);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(list.this,Productcategory.class);
                intent.putExtra("index",position);
                startActivity(intent);
            }
        });