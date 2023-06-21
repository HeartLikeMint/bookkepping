package com.ebookkeeping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookDetail")
public class BookKeepingController {
    @GetMapping("/test")
    public Object searchBookDetailByPage(){
        System.out.println("test");
        return "Hello word!";
    }
}
