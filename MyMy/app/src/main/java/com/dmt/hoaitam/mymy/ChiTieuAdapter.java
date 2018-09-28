package com.dmt.hoaitam.mymy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ChiTieuAdapter extends BaseAdapter{

    Context myContext;
    int myLayout;
    List<ChiTieu> arrayChiTieu;
    public ChiTieuAdapter(Context context, int layout, List<ChiTieu> chiTieuList){
     myContext=context;
     myLayout=layout;
     arrayChiTieu=chiTieuList;
    }

    @Override
    public int getCount() {
        return arrayChiTieu.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(myLayout,null);
       // anh xa và gan gtri
        TextView txtTen=(TextView) convertView.findViewById(R.id.textViewTen);
        txtTen.setText(arrayChiTieu.get(position).Ten);
        ImageView imgHinh=(ImageView) convertView.findViewById(R.id.imageViewHinh);
        imgHinh.setImageResource(arrayChiTieu.get(position).Hinh);
        return convertView;
    }
}
