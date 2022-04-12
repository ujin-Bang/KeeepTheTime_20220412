package com.time.keeepthetime_20220412.api

import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface APIList {

//    BASE_URL에 대당하는 서버에서 어떤 기능들을 사용할건지 명시

    @FormUrlEncoded // 파라미터중에 , Field(formData)에 담아야 하는파라미터가 있다
    @POST("/user")
   fun postRequestLogin(
        @Field("email") email: String,
        @Field("password" ) pw: String
    ):Call<JSONObject>
}