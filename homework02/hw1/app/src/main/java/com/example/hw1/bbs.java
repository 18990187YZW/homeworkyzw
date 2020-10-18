package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;



import com.example.hw1.R;

import java.text.SimpleDateFormat;
import java.util.Date;

public class bbs extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener {
    private TextView tv_bbs;
    private  TextView tv_control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbs);
        tv_control=findViewById(R.id.tv_control);
        tv_control.setOnClickListener(this);
        tv_control.setOnLongClickListener(this);
        tv_bbs=findViewById(R.id.tv_bbs);
        tv_bbs.setOnLongClickListener(this);
        tv_bbs.setOnLongClickListener(this);
        tv_bbs.setMovementMethod(new ScrollingMovementMethod());
    }
    private String[] mChatStr={"你今天还好吗？","我今天挺好的,你呢。","我们去吃饭把","我晚上有事，不去了","去嘛去嘛",};

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.tv_control||v.getId()==R.id.tv_bbs){
            int random=(int)(Math.random()*10)%5;
            String newStr=String.format("%s\n%s %s",tv_bbs.getText().toString(),DateUtil.getNowTime(),mChatStr[random]);

            tv_bbs.setText(newStr);
        }
    }

    @Override
    public boolean onLongClick(View v) {
        if(v.getId()==R.id.tv_control||v.getId()==R.id.tv_bbs){
            tv_bbs.setText("");
        }
        return true;
    }

    private static class DateUtil {
        public  static String getNowTime() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
            Date date = new Date();
            String s = simpleDateFormat.format(date);
            return s;
        }


    }
}
