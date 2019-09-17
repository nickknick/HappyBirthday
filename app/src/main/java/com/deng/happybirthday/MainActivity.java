package com.deng.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static String TAG = "weekTwo";
    TextView out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo);//要在查找的前面 且对应


//        edittext-out inp
        out = findViewById(R.id.out);
        out.setText("change me");

        EditText inp = findViewById(R.id.inp);
        String str = inp.getText().toString();
        inp.setText("kkk");



//        button OnclickListener
        Button btn = findViewById(R.id.btn);

        //        两种不同的写法
        //        btn.setOnClickListener(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out.setText("AAA");
            }
        });



        setContentView(R.layout.activity_main);


        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        Log.i(TAG, "onClick:...");
        out.setText("clicked");
    }







}
