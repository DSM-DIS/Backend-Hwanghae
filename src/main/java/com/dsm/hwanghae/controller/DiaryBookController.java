package com.dsm.hwanghae.controller;

import com.dsm.hwanghae.domains.service.DiaryBookService;
import com.dsm.hwanghae.utils.form.DiaryBookResponseForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DiaryBookController {

    private DiaryBookService diaryBookService;

    @Autowired
    public DiaryBookController(DiaryBookService diaryBookService) {
        this.diaryBookService = diaryBookService;
    }

    @GetMapping("/user/diary-books")
    public DiaryBookResponseForm getDiaryBook(HttpServletRequest request) {
        String userId = request.getHeader("userId");
        return diaryBookService.getDiaryBooks(userId);
    }
}
