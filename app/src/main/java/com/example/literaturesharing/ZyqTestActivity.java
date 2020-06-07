package com.example.literaturesharing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ZyqTestActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zyq_activity_test);

        TextView textView = findViewById(R.id.logintest);

        Bundle bundle = this.getIntent().getExtras();
        String userid = bundle.getString("userid");

        textView.setText(userid);
    }
}
