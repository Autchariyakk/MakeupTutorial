package com.example.sitthiphong.trainig;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    private TextView textView,tv2;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btnnext;
    private EditText edt1,edt2;
    private boolean isFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        btnnext = findViewById(R.id.btnnext);



        //textView.setText("55555");
        textView.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));




        edt1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP){
                    isFirst = true;
                    Log.e("TAG","First: "+isFirst);
                    return true;
                }
                return false;
            }
        });
        edt2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP){
                    isFirst = false;
                    Log.e("TAG","First: "+isFirst);
                    return true;
                }
                return false;
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                tv2.setText("+");

//                int i = Integer.parseInt(textView.getText().toString());
//                i = i + 1;
//                //textView.setText(R.string.app_name);
//                //textView.setText(i);
//                textView.setText(String.valueOf(i));

                //String s = edt.getText().toString();
                //textView.setText(s);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String r = btn2.getText().toString();
                tv2.setText(r);


            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String r = btn3.getText().toString();
                tv2.setText(r);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String r = btn4.getText().toString();
                tv2.setText(r);


            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirst){
                    edt1.setText("7");
                }else{
                    edt2.setText("7");
                }

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirst){
                    edt1.setText("8");
                }else{
                    edt2.setText("8");
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirst){
                    edt1.setText("9");
                }else{
                    edt2.setText("9");
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirst){
                    edt1.setText("4");
                }else{
                    edt2.setText("4");
                }
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirst){
                    edt1.setText("5");
                }else{
                    edt2.setText("5");
                }
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirst){
                    edt1.setText("6");
                }else{
                    edt2.setText("6");
                }
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirst){
                    edt1.setText("1");
                }else{
                    edt2.setText("1");
                }
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirst){
                    edt1.setText("2");
                }else{
                    edt2.setText("2");
                }
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirst){
                    edt1.setText("3");
                }else{
                    edt2.setText("3");
                }
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirst){
                    edt1.setText("0");
                }else{
                    edt2.setText("0");
                }
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirst){
                    edt1.setText(".");
                }else{
                    edt2.setText(".");
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(edt1.getText().toString());
                int j = Integer.parseInt(edt2.getText().toString());
                int k=0;
                String r = (tv2.getText().toString());
                Log.d("TAG","R: "+r);

                if(r.equals("+")){//AG: R: +
                    k = i+j;
                }
                if(r.equals("-")){
                    k =i-j;
                }
                if(r.equals("*")){
                    k = i*j;
                }
                if(r.equals("/")){
                    k = i/j;
                };

                textView.setText(String.valueOf(k));

            }
        });
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),SumActivity.class);
                String s = textView.getText().toString();
                i.putExtra("value1",s);

                startActivity(i);
            }
        });
    }

}
