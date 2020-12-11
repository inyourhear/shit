package com.ruoyi.web.controller.locker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/locker/allbox")
public class WebBorrowController {
    private String prefix = "locker/index";

    @GetMapping()
    public String index()
    {
        return prefix + "/borrow";
    }

//    @GetMapping("/freebox")
//    public ResponseEntity<?> getFreebox(){
//
//    }
//
//    @GetMapping("/equbox")
//    public ResponseEntity<?> getEqubox(){
//
//    }
}
