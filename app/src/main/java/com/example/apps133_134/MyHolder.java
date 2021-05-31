package com.example.apps133_134;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    TextView titile,description,study;
    ImageView imageView;
    Button calDemoButton;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        titile=itemView.findViewById(R.id.textTitile_Id);
        description=itemView.findViewById(R.id.descripiton_Id);
        study=itemView.findViewById(R.id.study_Id);
        imageView=itemView.findViewById(R.id.imageView_carD_Id);
        calDemoButton=itemView.findViewById(R.id.call_button_Id);

    }
}
