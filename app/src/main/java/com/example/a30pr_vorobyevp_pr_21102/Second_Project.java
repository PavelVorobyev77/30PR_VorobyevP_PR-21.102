package com.example.a30pr_vorobyevp_pr_21102;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Second_Project extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_project);
    }
    public void onClickStart(View v) {
        startService(new Intent(this, MyService3.class).putExtra("time", 7));
        startService(new Intent(this, MyService3.class).putExtra("time", 2));
        startService(new Intent(this, MyService3.class).putExtra("time", 4));
    }
}