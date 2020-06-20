package com.nusaeiwyj.springmy.controller;

import com.nusaeiwyj.springmy.Service.ArticleRestService;
import com.nusaeiwyj.springmy.generator.Article;
import com.nusaeiwyj.springmy.model.AjaxResponse;
import com.nusaeiwyj.springmy.model.ArticleVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;


@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleRestController {

    @Resource(name = "articleMybatisRestServiceImpl")
    ArticleRestService articleRestService;
    //增加一篇Article ，使用POST方法
    //@RequestMapping(value = "/article", method = POST, produces = "application/json")
    @PostMapping("/article")
    public AjaxResponse saveArticle(@RequestBody ArticleVO articleVO) {
        //因为使用了lombok的Slf4j注解，这里可以直接使用log变量打印日志
        articleRestService.saveArticle(articleVO);
        log.info("saveArticle：{}", articleVO);
        return  AjaxResponse.success(articleVO);
    }


    //删除一篇Article，使用DELETE方法，参数是id
    //@RequestMapping(value = "/article/{id}", method = DELETE, produces = "application/json")
    @DeleteMapping("/article/{id}")
    public AjaxResponse deleteArticle(@PathVariable Long id) {
        articleRestService.deleteArticle(Math.toIntExact(id));
        log.info("deleteArticle：{}",id);
        return AjaxResponse.success(id);
    }

    //更新一篇Article，使用PUT方法，以id为主键进行更新
    //@RequestMapping(value = "/article/{id}", method = PUT, produces = "application/json")
    @PutMapping("/article/{id}")
    public AjaxResponse updateArticle(@PathVariable Long id, @RequestBody ArticleVO articleVO) {
        articleVO.setId(id);
        articleRestService.updateArticle(articleVO);
        log.info("updateArticle：{}", articleVO);
        return AjaxResponse.success(articleVO);
    }

    //获取一篇Article，使用GET方法
    //@RequestMapping(value = "/article/{id}", method = GET, produces = "application/json")
    @GetMapping("/article/{id}")
    public AjaxResponse getArticle(@PathVariable Long id) {


        return AjaxResponse.success(articleRestService.getArticle(Math.toIntExact(id)));
    }

    //获取一篇Article，使用GET方法
    //@RequestMapping(value = "/article/{id}", method = GET, produces = "application/json")
    @GetMapping("/article/All")
    public AjaxResponse getAll() {

        return AjaxResponse.success(articleRestService.getAll());
    }
}
