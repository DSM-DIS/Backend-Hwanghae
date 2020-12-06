package com.dsm.hwanghae.utils.form;

import com.dsm.hwanghae.domains.domain.DiaryBook;

import java.util.List;

public class DiaryBookResponseForm {

    private List<DiaryBook> diaryBooks;

    public DiaryBookResponseForm() {}
    public DiaryBookResponseForm(List<DiaryBook> diaryBooks) {
        this.diaryBooks = diaryBooks;
    }

    public List<DiaryBook> getDiaryBooks() {
        return diaryBooks;
    }

    public void setDiaryBooks(List<DiaryBook> diaryBooks) {
        this.diaryBooks = diaryBooks;
    }
}
