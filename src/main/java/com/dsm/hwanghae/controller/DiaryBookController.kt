package com.dsm.hwanghae.controller

import com.dsm.hwanghae.domains.domain.Student
import com.dsm.hwanghae.domains.service.DiaryBookService
import com.dsm.hwanghae.utils.form.DiaryBookResponseForm
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
class DiaryBookController(@Autowired val diaryBookService: DiaryBookService) {

    @GetMapping("/user/diary-books")
    fun getDiaryBook(request: HttpServletRequest): DiaryBookResponseForm {
        println("여따 들어옴")
        val userId: String = request.getHeader("userId")
        return diaryBookService.getDiaryBooks(id = userId)
    }

//    @GetMapping("/testtesttest")
//    fun getMapping() : Student {
//        println("들어옴")
//        return Student("2417", "이진혁")
//    }
//
//    @PostMapping("/testtesttest")
//    fun postMapping(student: Student): Student {
//        println("들어옴")
//        student.name = "name change"
//        return student
//    }
}