package com.hicc.cloud.teacher.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.hicc.cloud.R;

/**
 * Created by Administrator on 2016/11/4/004.
 */
public class StationActivity extends AppCompatActivity {
    private ImageView iv_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station);

        initUI();
    }

    private void initUI() {
        iv_back =(ImageView) findViewById(R.id.iv_back);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
