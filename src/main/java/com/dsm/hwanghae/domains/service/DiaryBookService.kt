package com.dsm.hwanghae.domains.service

import com.dsm.hwanghae.utils.form.DiaryBookResponseForm
import org.springframework.stereotype.Service
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Service
class DiaryBookService {

    fun getDiaryBooks(id: String): DiaryBookResponseForm {

        val retrofit = Retrofit.Builder()
                .baseUrl("http://localhost:8888")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val service = retrofit.create(DiaryBookRequestConnectionService::class.java)

        var diaryBooks = DiaryBookResponseForm(ArrayList())
        service.addRequest(id)?.enqueue(object: Callback<DiaryBookResponseForm> {
            override fun onFailure(call: Call<DiaryBookResponseForm>, t: Throwable) {
                TODO("실패했을 경우 어떻게 할 거냐")
                print("실패함");
            }

            override fun onResponse(call: Call<DiaryBookResponseForm>, response: Response<DiaryBookResponseForm>) {
                diaryBooks = response.body()!!
            }
        })

        return diaryBooks
    }
}