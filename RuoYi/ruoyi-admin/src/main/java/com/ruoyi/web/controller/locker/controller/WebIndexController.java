package com.ruoyi.web.controller.locker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/locker/all")
public class WebIndexController {
    private String prefix = "locker/index";

    @GetMapping()
    public String index()
    {
        return prefix + "/index";
    }

//    @PostMapping()
//    public ResponseEntity<?> domain(){
//
//    }

}
