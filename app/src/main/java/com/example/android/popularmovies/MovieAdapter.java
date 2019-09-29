package com.example.android.popularmovies;

import android.content.Context;
import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private String[] mDataset;

    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public MovieViewHolder(View view){
            super(view);
            textView = (TextView) view.findViewById(R.id.movie_title_textview);
        }
    }

    public MovieAdapter (String[] dataset) {
        mDataset = dataset;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        int layoutId = R.layout.movie_view;
        boolean attachToParent = false;

        View view = inflater.inflate(layoutId, viewGroup, attachToParent);

        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        holder.textView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }



}
