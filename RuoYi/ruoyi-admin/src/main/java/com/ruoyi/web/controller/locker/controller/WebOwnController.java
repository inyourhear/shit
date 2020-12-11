package com.ruoyi.web.controller.locker.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/locker/boxbelong")
public class WebOwnController {
    private String prefix = "locker/index";

    @GetMapping()
    public String index()
    {
        return prefix + "/own";
    }

//    @GetMapping("/{user_id}")
//    public ResponseEntity<?> getBlongbox(@PathVariable("user_id") int user_id){
//
//    }

}
