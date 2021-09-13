package com.example.sprint1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<ViewHolderClass> {

    private ArrayList<NowShowingDTO> moviesShowing=new ArrayList<>();
    private OnItemClicked onItemClicked;

    public AdapterClass(ArrayList<NowShowingDTO> moviesShowing, OnItemClicked onItemClicked) {
        this.moviesShowing = moviesShowing;
        this.onItemClicked = onItemClicked;
    }

    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlayout,parent,false);
        return new ViewHolderClass(view,onItemClicked);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass holder, int position) {
        NowShowingDTO nowShowingDTO=moviesShowing.get(position);
        holder.setData(nowShowingDTO);
    }

    @Override
    public int getItemCount() {
        return moviesShowing.size();
    }
}
