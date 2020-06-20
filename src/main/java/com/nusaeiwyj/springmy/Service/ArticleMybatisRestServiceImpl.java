package com.nusaeiwyj.springmy.Service;

import com.nusaeiwyj.springmy.generator.Article;
import com.nusaeiwyj.springmy.generator.ArticleMapper;
import com.nusaeiwyj.springmy.model.ArticleVO;
import com.nusaeiwyj.springmy.utils.DozerUtils;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleMybatisRestServiceImpl implements ArticleRestService{
    @Resource
    protected Mapper dozerMapper;

    @Resource
    private ArticleMapper articleMapper;


    //新增
    @Override
    public Article saveArticle(ArticleVO article) {
        Article articlePO = dozerMapper.map(article,Article.class);
        articleMapper.insert(articlePO);
        return null;
    }

    //删除
    @Override
    public void deleteArticle(int id) {
        articleMapper.deleteByPrimaryKey(id);
    }

    //更新
    @Override
    public void updateArticle(ArticleVO article) {
        Article articlePO = dozerMapper.map(article, Article.class);
        articleMapper.updateByPrimaryKeySelective(articlePO);
    }

    //查询
    @Override
    public ArticleVO getArticle(int id) {
        return dozerMapper.map(articleMapper.selectByPrimaryKey(id),ArticleVO.class);
    }
    //查询所有
    @Override
    public List<ArticleVO> getAll() {
        List<Article> articles = articleMapper.selectByExample(null);
        return DozerUtils.mapList(articles,ArticleVO.class);
    }
}
