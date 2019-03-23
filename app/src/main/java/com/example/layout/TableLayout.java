package com.example.layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class TableLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);

        Button btn3=(Button)findViewById(R.id.btn3);

        //给btn1绑定监听事件
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // 给bnt1添加点击响应事件
                Intent intent =new Intent(TableLayout.this,Linearlayout.class);
                //启动
                startActivity(intent);
            }
        });

    }

}
