package com.oceans.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.FruitHolder>{

    private Context context;
    private List<FruitModel> fruitModelList;

    public FruitAdapter(Context context,List<FruitModel> fruitModelList){
        this.context = context;
        this.fruitModelList = fruitModelList;
    }

    @NonNull
    @Override
    public FruitHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FruitHolder(LayoutInflater.from(context).inflate(R.layout.fruit_card,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FruitHolder holder, int position) {
        FruitModel fruitModel = fruitModelList.get(position);
        holder.name.setText(fruitModel.getName());
        holder.cost.setText(fruitModel.getCost()+"");

    }

    @Override
    public int getItemCount() {
        return fruitModelList.size();
    }

    class FruitHolder extends RecyclerView.ViewHolder{
        TextView name, cost;
        public FruitHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            cost = itemView.findViewById(R.id.cost);
        }
    }
}
