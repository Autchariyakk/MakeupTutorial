package com.example.sitthiphong.trainig;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SumActivity extends AppCompatActivity {

    private TextView tv1;
    private String res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
           res = bundle.getString("value1");
        }
        tv1 = findViewById(R.id.tv1);
        tv1.setText(res);
    }

}
