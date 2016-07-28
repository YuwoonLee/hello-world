package com.example.lovo.sample3;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Lovo on 2016-07-28.
 */
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    List<String> list = new listArray<>();

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent, getConxtext()).inflate(R.layout.list, null, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;

    }

    @Override
    public void onBindViewHolder(ListAdapter.ViewHolder holder, int position) {

        String msg = list.get(position);


    }

    @Override
    public int getItemCount() {

        if(list == null){
            return 0;
        }else{
            return list.size();
        }
    }

    public void addItems(String[] items) {
        list.addAll(Arrays.asList(items));
        notifyDataSetChanged();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
