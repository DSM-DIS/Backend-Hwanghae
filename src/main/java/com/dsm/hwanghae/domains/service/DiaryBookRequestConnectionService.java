package com.dsm.hwanghae.domains.service;

import com.dsm.hwanghae.utils.form.DiaryBookResponseForm;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

public interface DiaryBookRequestConnectionService {
    @Headers(value = {"accept: application/json", "content-type: application/json"})
    @GET("/repositories/diary-book")
    Call<DiaryBookResponseForm> addRequest(@Header("id") String id);
}