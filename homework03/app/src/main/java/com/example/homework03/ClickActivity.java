package com.example.homework03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ClickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);
        // 从布局文件中获取名叫btn_click的按钮控件
        Button btn_click = findViewById(R.id.btn_click);
        //给btn_click设置点击监听器，一旦用户点击按钮，就触发监听器的onClick方法
        btn_click.setOnClickListener(new MyOnClickListener());
        //给btn_click设置长按监听器，一旦用户长按按钮，就触发监听器的onLongClick方法
        btn_click.setOnLongClickListener(new MyOnLongClickListener());
    }

    //定义一个监听器，它实现了接口View.OnClickListener
    class MyOnClickListener implements  View.OnClickListener{
        @Override
        public void onClick(View v){
            if (v.getId() ==R.id.btn_click){
                Toast.makeText(ClickActivity.this,"您点击了控件" + ((TextView) v).getText(),Toast.LENGTH_SHORT).show();
            }
        }

    }
    // 定义一个长按监听器，它实现了接口View.OnLongClickListener
    class MyOnLongClickListener implements  View.OnLongClickListener{
        @Override
        public boolean onLongClick(View v){
            if(v.getId() ==R.id.btn_click){
                Toast.makeText(ClickActivity.this,"您长按了控件" + ((TextView) v).getText(),Toast.LENGTH_SHORT).show();
            }
            return true;
        }
    }
}