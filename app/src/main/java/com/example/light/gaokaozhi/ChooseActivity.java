package com.example.light.gaokaozhi;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null ){
            actionBar.hide();
        }

        ImageView choose_major = (ImageView)findViewById(R.id.choose_major);
        choose_major.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseActivity.this,Subjectmain.class);
                startActivity(intent);
            }
        });

        ImageView choose_kemu = (ImageView)findViewById(R.id.choose_kemu);
        choose_kemu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseActivity.this,MajormainActivity.class);
                startActivity(intent);
            }
        });
    }
}
