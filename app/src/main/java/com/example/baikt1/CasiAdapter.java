package com.example.baikt1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class CasiAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<casi> casiList;


    public CasiAdapter(Context context, int layout, List<casi> casiList) {
        this.context = context;
        this.layout = layout;
        this.casiList = casiList;
    }



    @Override
    public int getCount() {
        return casiList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout,null);
        //anh xa view
        TextView txtTen  = (TextView) view.findViewById(R.id.testviewTen);
        TextView txtNghedanh  = (TextView) view.findViewById(R.id.testviewNghedanh);
        ImageView imgHinh = (ImageView) view.findViewById(R.id.imgviewHinh);
        ImageView imgquocgia = (ImageView) view.findViewById(R.id.imgviewQuocgia);

        //gan gia tri
        casi Casi = casiList.get(i);

        txtTen.setText(Casi.getTen());
        txtNghedanh.setText(Casi.getNghedanh());
        imgHinh.setImageResource(Casi.getHinh());
        imgquocgia.setImageResource(Casi.getQuocgia());



        return view;
    }
}
