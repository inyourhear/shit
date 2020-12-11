package com.ruoyi.web.controller.locker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/locker/receive")
public class WebReceiveController {
    private String prefix = "locker/index";

    @GetMapping()
    public String index()
    {
        return prefix + "/receive";
    }

//    @GetMapping("/{user_id}")
//    public ResponseEntity<?> getReceivebox(@PathVariable("user_id") int user_id){
//
//    }
}
