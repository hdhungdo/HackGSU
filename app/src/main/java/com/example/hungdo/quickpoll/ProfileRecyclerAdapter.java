package com.example.hungdo.quickpoll;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.example.hungdo.quickpoll.R.id.card_view;

/**
 * Created by Bang on 10/22/16.
 */

public class ProfileRecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {



    String [] name={"Androidwarriorssssssssssssssssssssssssssssssss","Stackoverflow","Developer Android","AndroidHive",
            "Slidenerd","TheNewBoston","Truiton","HmkCode","JavaTpoint","Javapeper"};

    Context context;
    LayoutInflater inflater;

    public ProfileRecyclerAdapter(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_list, parent, false);
        RecyclerViewHolder viewHolder = new RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.textview.setText(name[position]);
        holder.cardView.setOnClickListener(clickListener);
        holder.cardView.setTag(holder);
    }

    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            RecyclerViewHolder vholder = (RecyclerViewHolder) view.getTag();
            int position = vholder.getLayoutPosition();
            System.out.println(position);
            context.startActivity(new Intent(context, MainScreenActivity.class));
        }
    };


    @Override
    public int getItemCount() {
        return name.length;
    }
}