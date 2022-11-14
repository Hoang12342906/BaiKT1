package com.example.baikt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Objects;

public class List_casi extends AppCompatActivity {

    ListView lvCasi;

    ArrayList<casi> arrayCasi;
    CasiAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        Objects.requireNonNull(getSupportActionBar()).hide();

        AnhXa();
        adapter = new CasiAdapter(this,R.layout.dong_casi,arrayCasi);
        lvCasi.setAdapter(adapter);

    }



    private void AnhXa() {
        lvCasi = findViewById(R.id.listviewCasi);
        arrayCasi = new ArrayList<>();



        arrayCasi.add(new casi("Nguyễn Thanh Tùng","MTP",R.drawable.sontung,R.drawable.vietnam));
        arrayCasi.add(new casi("Trần Văn Phúc","Đức Phúc",R.drawable.ducphuc,R.drawable.vietnam));
        arrayCasi.add(new casi("Phạm Tùng Hùy","Isaac",R.drawable.isaac,R.drawable.vietnam));
        arrayCasi.add(new casi("Trân Văn Thịnh","Noo Phước Thịnh",R.drawable.noophuocthinh,R.drawable.vietnam));
        arrayCasi.add(new casi("Nguyễn Đen","Đen Vâu",R.drawable.denvau,R.drawable.vietnam));
        arrayCasi.add(new casi("Phạm Đạt","Đạt G",R.drawable.datg,R.drawable.vietnam));

    }
}