package com.dsm.hwanghae.domains.service;

import com.dsm.hwanghae.domains.domain.DiaryBook;
import com.dsm.hwanghae.utils.form.DiaryBookResponseForm;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import org.springframework.stereotype.Service;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import java.io.IOException;

@Service
public class DiaryBookService {

    public DiaryBookResponseForm getDiaryBooks(String id) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gyeongsang:8893")
                .client(new OkHttpClient().newBuilder().build())
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create()))
                .build();

        DiaryBookRequestConnectionService service = retrofit.create(DiaryBookRequestConnectionService.class);

        Response<DiaryBookResponseForm> response = null;
        try {
            response = service.addRequest(id).execute();
        } catch(IOException e) {
            e.printStackTrace();
        }

        return response.body();
    }
}
