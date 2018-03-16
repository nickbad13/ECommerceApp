package com.oum.e_commerceapp.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.oum.e_commerceapp.R;

/**
 * Created by seqato on 15/03/18.
 */

public class ProductAdapter extends BaseAdapter {
    String[] Title;
    int[] imge;
    String[] price;
    LayoutInflater layoutInflater;
    Context context;

    ProductAdapter() {
        Title = null;
        imge=null;
        price=null;
    }

    public ProductAdapter(String[] text,int[] text3,String[] text2,Context context) {
        Title = text;
        price = text2;
        imge = text3;
        this.context=context;

    }

    public int getCount() {
        // TODO Auto-generated method stub
        return Title.length;
    }

    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {



        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.product_list, null);
        }

        TextView title = (TextView) convertView.findViewById(R.id.category_name);
        TextView pricetxt = (TextView) convertView.findViewById(R.id.price);
        ImageView img=(ImageView)convertView.findViewById(R.id.flag);


        // setting the image resource and title
        title.setText(Title[position]);
        pricetxt.setText(price[position]);
        img.setImageResource(imge[position]);

        return convertView;


    }
}


