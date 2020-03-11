package com.nusaeiwyj.springmy.controller;


import com.nusaeiwyj.springmy.model.Article;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String Hello()
    {

        Article aa = new Article();
        aa.setId(1L);
        return "hello";
    }
}
