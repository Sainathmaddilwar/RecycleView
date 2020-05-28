package com.example.recycleview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LAdapter extends RecyclerView.Adapter<LAdapter.ViewHolder> {

    Context mContext;
    private ListData[] listd;
    public LAdapter(ListData[] listd)
    {
        this.listd=listd;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View listview=inflater.inflate(R.layout.recycle_v,parent,false);
        ViewHolder viewHolder=new ViewHolder(listview);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.imageView.setImageResource(listd[position].getImgid());
        holder.textView.setText(listd[position].getName());
        holder.textView1.setText(listd[position].getName2());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(mContext,MainActivity2.class);
                intent.putExtra("name",listd[position].getName());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listd.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textView;
        public TextView textView1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mContext=itemView.getContext();
            this.imageView=(ImageView)itemView.findViewById(R.id.imageView);
            this.textView=(TextView)itemView.findViewById(R.id.textView);
            this.textView1=(TextView)itemView.findViewById(R.id.textView2);
        }
    }
}
