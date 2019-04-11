package com.example.owner.ekremadonate2;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.owner.ekremadonate2.data.TabKha;

import java.util.ArrayList;
import java.util.List;




public class CartListAdapter extends AppCompatActivity implements CartListAdapter1 {
    private List callListResponses = new ArrayList<>();
     List templist=new ArrayList<>();
    private Activity context;
    int lastPosition=0;

    public CartListAdapter(Activity context, List callListResponses)
    {
        super();
        this.context = context;
        this.callListResponses=callListResponses;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.activity_categories, parent, false);

        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final TabKha call = (TabKha) callListResponses.get(position);

        holder.itemname.setText(call.getLiquids());
        holder.itemprice.setText(call.getOil()+" Rs");
        holder.itemsize.setText(call.getPrice());
        holder.tv_quantity.setText(call.getName());
        holder.tv_quantity.setText(call.getImage());
        holder.tv_quantity.setText(call.getSpices());
        holder.tv_quantity.setText(call.getVegetables());




        holder.cart_minus_img.setOnClickListener(new QuantityListener(context, holder.tv_quantity,call,false));
        holder.cart_plus_img.setOnClickListener(new QuantityListener(context, holder.tv_quantity,call,true));

    }

    //Animating single element
    private void setAnimation(View viewToAnimate, int position)
    {
        if (position > lastPosition) {
            Animation animation;
            animation = AnimationUtils.loadAnimation(context, );
            viewToAnimate.startAnimation(animation);
            lastPosition=position;
        }
        position++;
    }

    @Override
    public int getItemCount() {
        //Log.d("Size List:",String.valueOf(callListResponses.size()));
        if(callListResponses!=null){
            return callListResponses.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView itemprice,itemname, itemsize,tv_quantity;
        ImageView cart_minus_img, cart_plus_img,img_deleteitem;


        public ViewHolder(View itemView) {
            super(itemView);
            

        }
    }



}


