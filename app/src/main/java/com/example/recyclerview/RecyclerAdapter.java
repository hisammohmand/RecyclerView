package com.example.recyclerview;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.programmingViewhodler> {


    @NonNull
    @Override
    public programmingViewhodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull programmingViewhodler holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class programmingViewhodler extends RecyclerView.ViewHolder {
        public programmingViewhodler(@NonNull View itemView) {
            super(itemView);
        }
    }


}
