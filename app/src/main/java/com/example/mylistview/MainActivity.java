package com.example.mylistview;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //private String[] data = {"a","b","c","d","e","f","g","h","i","j","k","l"};
    private List<Fruit> fruitList  = new ArrayList<>();
    private ListView listView;
    //private ArrayAdapter<String> adapter;
    private FruitAdapter fruitAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        listView = findViewById(R.id.list_view);
        fruitAdapter = new FruitAdapter(MainActivity.this,R.layout.item,fruitList);
        listView.setAdapter(fruitAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this,"click" + fruit.toString(),Toast.LENGTH_SHORT).show();
            }
        });

/*        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.hide();
        }*/
/*        listView = findViewById(R.id.list_view);
        adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.item,data);
        listView.setAdapter(adapter);*/
    }

    private void init() {
        for (int i = 0; i < 5; i++) {
            Fruit f = new Fruit(R.drawable.a,"apple");
            fruitList.add(f);
            Log.d("TAG", f.toString());
            Log.d("TAG", fruitList.size()+"");
        }
    }
}