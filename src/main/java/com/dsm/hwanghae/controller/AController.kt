package com.dsm.hwanghae.controller

import com.dsm.hwanghae.domains.domain.A
import com.dsm.hwanghae.domains.domain.B
import com.dsm.hwanghae.domains.service.BService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AController(@Autowired val bService: BService) {

    @GetMapping("/bbb")
    fun bbb(b: B): A {
        val data = b.data
        return bService.bbb(data)
    }

    @PostMapping("/aaa")
    fun aaa(@RequestBody data: String): A {
        return A("성공적")
    }
}