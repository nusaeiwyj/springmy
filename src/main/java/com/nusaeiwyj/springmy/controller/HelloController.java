package com.nusaeiwyj.springmy.controller;


import com.nusaeiwyj.springmy.model.ArticleVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String Hello()
    {

        ArticleVO aa = new ArticleVO();
        aa.setId(1L);
        return "hello";
    }
}
