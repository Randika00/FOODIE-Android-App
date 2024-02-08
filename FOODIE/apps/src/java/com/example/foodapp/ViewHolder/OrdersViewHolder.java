package com.example.foodapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.Interface.ItemClickListner;
import com.example.foodapp.R;

public class OrdersViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    private TextView userName, userPhoneNumber, userTotalPrice, userDateTime, userShippingAddress;
    private ItemClickListner itemClickListner;

    public OrdersViewHolder(View itemView)
    {
        super(itemView);

        userName = itemView.findViewById(R.id.order_user_name);
        userPhoneNumber = itemView.findViewById(R.id.order_phone_number);
        userTotalPrice = itemView.findViewById(R.id.order_total_price);
        userDateTime = itemView.findViewById(R.id.order_date_time);
        userShippingAddress = itemView.findViewById(R.id.order_address_city);

    }

    @Override
    public void onClick(View view)
    {
        itemClickListner.onClick(view, getAdapterPosition(), false);

    }
    public void setItemClickListner(ItemClickListner itemClickListner)
    {
        this.itemClickListner = itemClickListner;
    }
}
