package com.nusaeiwyj.springmy.Service;

import com.nusaeiwyj.springmy.generator.Article;
import com.nusaeiwyj.springmy.model.ArticleVO;

import java.util.List;

public interface ArticleRestService {

     Article saveArticle(ArticleVO article);

     void deleteArticle(int id);

     void updateArticle(ArticleVO article);

     ArticleVO getArticle(int id);

     List<ArticleVO> getAll();
}