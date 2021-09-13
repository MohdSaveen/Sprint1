package com.example.sprint1;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderClass extends RecyclerView.ViewHolder {

    private OnItemClicked onItemClicked;
    private ImageView movieImage;

    public ViewHolderClass(@NonNull View itemView,OnItemClicked onItemClicked) {

        super(itemView);
        this.onItemClicked=onItemClicked;
        movieImage=itemView.findViewById(R.id.itemImage);
    }

    public void setData(NowShowingDTO nowShowingDTO){

        movieImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClicked.itemClicked(getAdapterPosition());
            }
        });

    }
}
