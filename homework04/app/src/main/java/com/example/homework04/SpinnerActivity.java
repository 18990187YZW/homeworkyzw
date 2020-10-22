package com.example.homework04;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class SpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        initSpinner();
//        initSpinnerForSimpleAdapter();
    }
    // 定义下拉列表需要显示的文本数组
    private String[] starArray = {"水星", "金星", "地球", "火星", "木星", "土星"};

    // 初始化下拉框
    private void initSpinner() {
        // 声明一个下拉列表的数组适配器
        ArrayAdapter<String> starAdapter = new ArrayAdapter<String>(this, R.layout.item_select, starArray);
        // 设置数组适配器的布局样式
        starAdapter.setDropDownViewResource(R.layout.item_dropdown);

        // 从布局文件中获取名叫sp_dropdown的下拉框

        Spinner sp_dialog = findViewById(R.id.sp_dialog);

        // 设置下拉框的标题
        sp_dialog.setPrompt("请选择行星");
        // 设置下拉框的数组适配器
        sp_dialog.setAdapter(starAdapter);
        // 设置下拉框默认显示第一项

        sp_dialog.setSelection(2);
        // 给下拉框设置选择监听器，一旦用户选中某一项，就触发监听器的onItemSelected方法
        sp_dialog.setOnItemSelectedListener(new MySelectedListener());
    }
    class MySelectedListener implements OnItemSelectedListener {
        /* 选择事件的处理方法
        adapter:适配器
        view:视图
        position:第几项
        id:id
        */
        public void onItemSelected(AdapterView<?> adapter, View view, int position, long id) {
            //获取选择的项的值
            String sInfo = adapter.getItemAtPosition(position).toString();
            Toast.makeText(SpinnerActivity.this, "您选择的是" + sInfo, Toast.LENGTH_LONG).show();
        }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
}