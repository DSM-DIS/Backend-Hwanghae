package com.dsm.hwanghae.controller

import com.dsm.hwanghae.domains.service.DiaryBookService
import com.dsm.hwanghae.utils.form.DiaryBookResponseForm
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
class DiaryBookController(@Autowired val diaryBookService: DiaryBookService) {

    @GetMapping("/user/diary-books")
    fun getDiaryBook(request: HttpServletRequest): DiaryBookResponseForm {
        val userId: String = request.getHeader("userId")
        return diaryBookService.getDiaryBooks(id = userId) 
    }
}