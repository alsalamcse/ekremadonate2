package com.example.owner.ekremadonate2;

import android.view.ViewGroup;

interface CartListAdapter1 {
    CartListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType);

    void onBindViewHolder(CartListAdapter.ViewHolder holder, int position);

    int getItemCount();
}
