package com.dsm.hwanghae.domains.service;

import com.dsm.hwanghae.domains.form.DiaryBookListResponseForm;
import org.springframework.stereotype.Service;

@Service
public class DiaryBookService {

    public DiaryBookListResponseForm showDiaryBook(String id) {
        // Repository 연결하기 :: MSA
        return new DiaryBookListResponseForm();
    }
}
