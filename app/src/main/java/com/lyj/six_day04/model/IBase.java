package com.lyj.six_day04.model;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface IBase {
    @POST("/ios/cf/dish_list.php")
    Call<Base> getData(@Query("stage_id")String stage_id,@Query("limit")String limit,@Query("page") String page);
}
