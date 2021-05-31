package com.example.apps133_134;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.example.apps133_134.R.drawable.*;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    private  Context context;
    private  ArrayList<DatasetGet> arrayList;

    public MyAdapter(Context context, ArrayList<DatasetGet> arrayList) {
        this.context = context;
        this.arrayList = arrayList;

    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.carview_layout,null);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder holder, final int position) {

        holder.titile.setText((CharSequence) arrayList.get(position).getTitile());
        holder.description.setText((CharSequence) arrayList.get(position).getDescripiton());
        holder.study.setText(arrayList.get(position).getStudy());
        holder.imageView.setImageResource(arrayList.get(position).getImg());
        holder.calDemoButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                String mobile=arrayList.get(position).getMoblileNumber();

                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:"+mobile));
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
