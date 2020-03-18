package com.nusaeiwyj.springmy.services;

import com.nusaeiwyj.springmy.model.ArticleVO;

import java.util.List;

public interface ArticleRestService {

    public ArticleVO saveArticle(ArticleVO article);

    public void deleteArticle(Long id);

    public void updateArticle(ArticleVO article);

    public ArticleVO getArticle(Long id);

    public List<ArticleVO> getAll();
}