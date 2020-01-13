package com.fanslab.githubuser;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    List<UsersModel> listUsers;
    private Context context;

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.users_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return listUsers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView userPhoto;
        TextView userName;
        TextView userEmail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userEmail = itemView.findViewById(R.id.userEmail);
            userName = itemView.findViewById(R.id.userName);
            userPhoto= itemView.findViewById(R.id.userPhoto);
        }
    }
}
