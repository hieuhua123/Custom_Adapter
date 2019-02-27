package com.example.student.custom_adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TenCauThu extends ArrayAdapter {
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getDropDownView(position, convertView, parent);
    }

    public TenCauThu (Context context , ArrayList<HinhAnh> lsthinhanh)
    {
        super (context,0,lsthinhanh);


    }
    private View initview (int position,View converView , ViewGroup parent  )
    {
        if (converView == null)
        {
            converView = LayoutInflater.from(getContext()).inflate(R.layout.cauthu_spinner,parent);

        }
        ImageView imagemessi = converView.findViewById(R.id.img_messi);
        TextView tencauthu = converView.findViewById(R.id.messi);
        
    }
}
