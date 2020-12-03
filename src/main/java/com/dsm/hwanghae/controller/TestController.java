package com.dsm.hwanghae.controller;

import com.dsm.hwanghae.domains.domain.Student;
import com.dsm.hwanghae.domains.service.DiaryBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private DiaryBookService diaryBookService;

    @Autowired
    public TestController(DiaryBookService diaryBookService) {
        this.diaryBookService = diaryBookService;
    }

    @GetMapping("/testtesttest")
    public Student getMapping() {
        System.out.println("들어옴");
        return new Student("2417", "이진혁");
    }

    @PostMapping("/testtesttest")
    public Student postMapping(Student student) {
        System.out.println("들어옴");
        student.setName("name change");
        return student;
    }
}