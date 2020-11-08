package com.dsm.hwanghae.domains.service

import com.dsm.hwanghae.domains.domain.A
import com.dsm.hwanghae.utils.form.DiaryBookResponseForm
import retrofit2.Call
import retrofit2.http.*

interface BRequestConnectionService {
    @Headers("accept: application/json", "content-type: application/json")
    @POST("/aaa")
    fun request(@Body data: String): Call<A>
}