package com.dsm.hwanghae.domains.service

import com.dsm.hwanghae.utils.form.DiaryBookResponseForm
import retrofit2.Call
import retrofit2.http.*

interface DiaryBookRequestConnectionService {
    @Headers("accept: application/json", "content-type: application/json")
    @GET("/repositories/diary-book")
    fun addRequest(@Header("id") id: String): Call<DiaryBookResponseForm>
}