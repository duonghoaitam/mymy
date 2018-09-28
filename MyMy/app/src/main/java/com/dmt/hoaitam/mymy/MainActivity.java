package com.dmt.hoaitam.mymy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvChiTieu;
    ArrayList<ChiTieu> mangChiTieu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvChiTieu=(ListView) findViewById(R.id.listViewChiTieu) ;
        mangChiTieu=new ArrayList<ChiTieu>();
        mangChiTieu.add(new ChiTieu("Mua sắm",R.drawable.buy));
        mangChiTieu.add(new ChiTieu("Ăn uống",R.drawable.food));
        mangChiTieu.add(new ChiTieu("Cà phê",R.drawable.caphe));
        mangChiTieu.add(new ChiTieu("Hóa đơn",R.drawable.hoadon));
        mangChiTieu.add(new ChiTieu("Di chuyển",R.drawable.dichuyen));

        mangChiTieu.add(new ChiTieu("Quà",R.drawable.qua));
        mangChiTieu.add(new ChiTieu("Bạn bè",R.drawable.banbe));

        mangChiTieu.add(new ChiTieu("Khoản chi khác",R.drawable.khoankhac));

       ChiTieuAdapter anAdapter = new ChiTieuAdapter(
               MainActivity.this,
               R.layout.dong_chitieu,
               mangChiTieu
       );
       lvChiTieu.setAdapter(anAdapter);


    };

    }


