package com.thaieasyelec.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt_id,txt_province,txt_position_car,txt_position_user;
    Button btn_search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindWidget();
        initEvents();


    }

    private void bindWidget() {
        txt_id = (TextView)findViewById(R.id.txt_id);
        txt_province = (TextView)findViewById(R.id.txt_province);
        txt_position_car = (TextView)findViewById(R.id.txt_position_car);
        txt_position_user = (TextView)findViewById(R.id.txt_position_user);
        btn_search = (Button)findViewById(R.id.btn_search);

        if (getIntent().getExtras()!=null) {
            txt_id.setText(getIntent().getExtras().getString("id"));
            txt_province.setText(getIntent().getExtras().getString("province"));
        }

//        Font.setFontFace(txt_id,0);
//        Font.setFontFace(txt_province,0);
//        Font.setFontFace(txt_position_car,0);
//        Font.setFontFace(txt_position_user,0);
//        Font.setFontFace(btn_search,0);

    }


    private void initEvents() {
        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showLocation();
            }
        });
    }


    public void showLocation(){
        if (getIntent().getExtras()!=null) {
            if (getIntent().getExtras().getBoolean("status")) {
                txt_position_car.setText("รถของคุณจอดอยู่ที่ " + getIntent().getExtras().getString("position_car"));
                txt_position_user.setText("คุณอยู่ที่ " + getIntent().getExtras().getString("position_user"));
            }else{
                txt_position_car.setText("ไม่พบข้อมูล");
            }
        }

    }


}
