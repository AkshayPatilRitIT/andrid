package com.ANTS.netlab.healthcare;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Netlab on 03/01/2018.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<String> android;
    private Context context;

    public DataAdapter(Context context,ArrayList<String> android) {
        this.android = android;
        this.context = context;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.tv_android.setText(android.get(i));
        //Picasso.with(context).load(android.get(i).getAndroid_image_url()).resize(240, 120).into(viewHolder.img_android);
    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_android;
        private ImageView img_android;
        public ViewHolder(View view) {
            super(view);

            tv_android = (TextView)view.findViewById(R.id.tv_android);
            //img_android = (ImageView) view.findViewById(R.id.img_android);

            tv_android.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  switch(tv_android.getText().toString())
                  {
                      case "Donut":{
                          Toast.makeText(context,"ghe maza Donut",Toast.LENGTH_SHORT).show();
                      }break;
                      case "Lollipop":
                      {
                          Toast.makeText(context,"ghe maza lollipop",Toast.LENGTH_SHORT).show();

                      }break;
                      default:{}



                  }

                }
            });
        }
    }

}