package com.example.homework03;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class iconActivity extends AppCompatActivity implements View.OnClickListener{

      private Button btn_icon;
      private Drawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon);


        btn_icon = findViewById(R.id.btn_icon);

        drawable = getResources().getDrawable(R.mipmap.ic_launcher);

        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getIntrinsicHeight());

        findViewById(R.id.btn_left).setOnClickListener(this);
        findViewById(R.id.btn_top).setOnClickListener(this);
        findViewById(R.id.btn_right).setOnClickListener(this);
        findViewById(R.id.btn_bottom).setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {  // 一旦监听到点击动作，就触发监听器的onClick方法
        if (v.getId() == R.id.btn_left) {
            // 设置按钮控件btn_icon内部文字左边的图标
            btn_icon.setCompoundDrawables(drawable, null, null, null);
        } else if (v.getId() == R.id.btn_top) {
            // 设置按钮控件btn_icon内部文字上方的图标
            btn_icon.setCompoundDrawables(null, drawable, null, null);
        } else if (v.getId() == R.id.btn_right) {
            // 设置按钮控件btn_icon内部文字右边的图标
            btn_icon.setCompoundDrawables(null, null, drawable, null);
        } else if (v.getId() == R.id.btn_bottom) {
            // 设置按钮控件btn_icon内部文字下方的图标
            btn_icon.setCompoundDrawables(null, null, null, drawable);

        }

    }
}