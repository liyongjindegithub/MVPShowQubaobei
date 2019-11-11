package com.lyj.six_day04.view;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lyj.six_day04.R;
import com.lyj.six_day04.model.Base;
import com.lyj.six_day04.model.Getvalue;
import com.lyj.six_day04.model.IGetvalue;
import com.lyj.six_day04.presenter.IOnClick;
import com.lyj.six_day04.presenter.adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements IGetvalue, IOnClick {

    private RecyclerView recyclerview;
    private adapter adapter;
    private List<Base.DataBean> data=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        Getvalue getvalue = new Getvalue(this);
        //开始下载数据
        getvalue.loading();
        adapter = new adapter(data, this);
        adapter.setiOnClick(this);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(adapter);
        //sssssss

    }

    private void initView() {
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
    }

    @Override
    public void success(List<Base.DataBean> data) {
        this.data.addAll(data);
        adapter.notifyDataSetChanged();

    }

    @Override
    public void failure() {

    }

    @Override
    public void onclick(int postision) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(""+data.get(postision).getTitle());
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle(""+data.get(postision).getFood_str());
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
