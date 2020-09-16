package com.dsm.hwanghae.controller;

import com.dsm.hwanghae.domains.form.DiaryBookListResponseForm;
import com.dsm.hwanghae.domains.service.DiaryBookService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/diary-book")
@Api(value = "DiaryBook Controller")
public class DiaryBookController {

    private DiaryBookService diaryBookService;

    @Autowired
    public DiaryBookController(DiaryBookService diaryBookService) {
        this.diaryBookService = diaryBookService;
    }

    @ApiOperation(value = "일기장 보기", notes = "유저 아이디에 맞는 일기장 리턴")
    @ApiResponses({
            @ApiResponse(code = 200, message = "정상적인 응답"),
            @ApiResponse(code = 404, message = "유저 아이디에 맞는 일기장이 존재하지 않음"),
            @ApiResponse(code = 500, message = "500")
    })
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "header", name = "token", dataType = "string", required = true, value = "Access Token")
    })
    @PostMapping("/diary-participation")
    public DiaryBookListResponseForm viewDiaryBook(HttpServletRequest request) {
        String accessToken = request.getHeader("accessToken");
        // accessToken 인증하기 :: MSA
        // 유저 아이디 추출하기 :: MSA
        String id = "";

        return diaryBookService.showDiaryBook(id);
    }
}
