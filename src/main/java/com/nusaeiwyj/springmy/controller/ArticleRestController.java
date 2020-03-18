package com.nusaeiwyj.springmy.controller;

import com.nusaeiwyj.springmy.dao.Article;
import com.nusaeiwyj.springmy.model.AjaxResponse;
import com.nusaeiwyj.springmy.model.ArticleVO;
import com.nusaeiwyj.springmy.services.ArticleRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleRestController {

    @Resource(name = "articleJPARestServiceImpl")
    ArticleRestService articleRestService;
    //增加一篇Article ，使用POST方法
    //@RequestMapping(value = "/article", method = POST, produces = "application/json")
    @PostMapping("/article")
    public AjaxResponse saveArticle(@RequestBody ArticleVO article) {
        //因为使用了lombok的Slf4j注解，这里可以直接使用log变量打印日志
        articleRestService.saveArticle(article);
        log.info("saveArticle：{}",article);
        return  AjaxResponse.success(article);
    }


    //删除一篇Article，使用DELETE方法，参数是id
    //@RequestMapping(value = "/article/{id}", method = DELETE, produces = "application/json")
    @DeleteMapping("/article/{id}")
    public AjaxResponse deleteArticle(@PathVariable Long id) {
        articleRestService.deleteArticle(id);
        log.info("deleteArticle：{}",id);
        return AjaxResponse.success(id);
    }

    //更新一篇Article，使用PUT方法，以id为主键进行更新
    //@RequestMapping(value = "/article/{id}", method = PUT, produces = "application/json")
    @PutMapping("/article/{id}")
    public AjaxResponse updateArticle(@PathVariable Long id, @RequestBody ArticleVO article) {
        article.setId(id);
        articleRestService.updateArticle(article);
        log.info("updateArticle：{}",article);
        return AjaxResponse.success(article);
    }

    //获取一篇Article，使用GET方法
    //@RequestMapping(value = "/article/{id}", method = GET, produces = "application/json")
    @GetMapping("/article/{id}")
    public AjaxResponse getArticle(@PathVariable Long id) {

        ArticleVO aa = articleRestService.getArticle(id);

        return AjaxResponse.success(aa);
    }

    @GetMapping("/article/All")
    public AjaxResponse getArticleAll() {

        List<ArticleVO> aa = articleRestService.getAll();

        return AjaxResponse.success(aa);
    }
}
