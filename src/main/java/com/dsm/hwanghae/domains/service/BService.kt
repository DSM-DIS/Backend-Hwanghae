package com.dsm.hwanghae.domains.service

import com.dsm.hwanghae.domains.domain.A
import com.dsm.hwanghae.utils.form.DiaryBookResponseForm
import org.apache.coyote.http11.Constants.a
import org.springframework.stereotype.Service
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Service
class BService {
    fun bbb(data: String): A {

        val retrofit = Retrofit.Builder()
                .baseUrl("http://localhost:8888")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val service = retrofit.create(BRequestConnectionService::class.java)

        var aaaa: A = A("default")
        service.request(data).enqueue(object : Callback<A> {

            override fun onFailure(call: Call<A>, t: Throwable) {
                aaaa.message = "fail message"
            }

            override fun onResponse(call: Call<A>, response: Response<A>) {
                aaaa = response.body()!!
            }
        })
        Thread.sleep(500)

        return aaaa
    }
}