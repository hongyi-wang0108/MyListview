package com.example.mylistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class FruitAdapter extends ArrayAdapter<Fruit> {
    //private List<Fruit> mlist;
    private int id;
    public FruitAdapter(@NonNull Context context, int resource, List<Fruit> list) {
        super(context, resource,list);
       // mlist = list;
        id = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
/*        Fruit fruit = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(id,parent,false);
        ImageView imageView = view.findViewById(R.id.imageview);
        TextView textView = view.findViewById(R.id.textview);
        imageView.setImageResource(fruit.getImageView());
        textView.setText(fruit.getName());
        return view;*/
        MyViewHolder myViewHolder ;
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);
            myViewHolder = new MyViewHolder();
            myViewHolder.imageView = convertView.findViewById(R.id.imageview);
            myViewHolder.textView = convertView.findViewById(R.id.textview);
            convertView.setTag(myViewHolder);
        }else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }
        Fruit fruit = getItem(position);
        myViewHolder.imageView.setImageResource(fruit.getImageView());
        myViewHolder.textView.setText(fruit.getName());
        return convertView;

    }
    static  class MyViewHolder {
        ImageView imageView;
        TextView textView;
    }
}

