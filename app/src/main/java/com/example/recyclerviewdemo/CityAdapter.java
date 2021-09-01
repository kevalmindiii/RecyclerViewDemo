package com.example.recyclerviewdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.CityViewHolder> {
    private String[] data;

    public CityAdapter(String[] data)
    {
        this.data= data;
    }
    @NonNull
    @Override
    //first this function call
    //For creating view
    //view and view holder are created here
    public CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout,parent,false);

        return new CityViewHolder(view);
    }

    @Override
    // for binding data to view
    public void onBindViewHolder(@NonNull CityViewHolder holder, int position) {
        String title = data[position];
        holder.txtList.setText(title);

    }

    @Override
    //for determining lenght of item
    public int getItemCount() {
        return data.length;
    }

     // here use findbybiew id only once here for the views
    public class CityViewHolder extends RecyclerView.ViewHolder{
        ImageView imgIcon;
        TextView txtList;
        public CityViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = (ImageView) itemView.findViewById(R.id.icon);
            txtList = (TextView) itemView.findViewById(R.id.cityname);
        }
    }
}
