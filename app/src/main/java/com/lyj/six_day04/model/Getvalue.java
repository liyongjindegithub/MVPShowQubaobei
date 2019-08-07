package com.lyj.six_day04.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Getvalue  {

    IGetvalue iGetvalue;

    public Getvalue(IGetvalue iGetvalue) {
        this.iGetvalue = iGetvalue;
    }

    public void loading(){
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.addConverterFactory(GsonConverterFactory.create());
        builder.baseUrl("http://www.qubaobei.com");
        Retrofit build = builder.build();
        IBase iBase = build.create(IBase.class);
        Call<Base> data = iBase.getData("1", "25", "10");
        data.enqueue(new Callback<Base>() {
            @Override
            public void onResponse(Call<Base> call, Response<Base> response) {
                List<Base.DataBean> data1 = response.body().getData();
                //接口放值
                iGetvalue.success(data1);
            }

            @Override
            public void onFailure(Call<Base> call, Throwable t) {
                iGetvalue.failure();
            }
        });
    }

}
