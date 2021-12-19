package com.geektech.dz34;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewHolder extends RecyclerView.ViewHolder {

    private ImageView image;
    private TextView name;
    private TextView phone;

    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.iv_image);
        name = itemView.findViewById(R.id.tv_name);
        phone = itemView.findViewById(R.id.tv_phone);
    }

    public void onBind(PersonModel model){
        image.setImageResource(model.getImage());
        name.setText(model.getName());
        phone.setText(String.valueOf(model.getPhone()));
    }
}
