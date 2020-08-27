package hr.databank.elbes.services.impl;

import hr.databank.elbes.dao.IArticleDAO;
import hr.databank.elbes.dao.IArticleDAOTEST;
import hr.databank.elbes.dao.impl.ArticleDAOTEST;
import hr.databank.elbes.entities.Article;
import hr.databank.elbes.services.IArticleServiceTEST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Configurable
@Service
public class ArticleServiceTEST implements IArticleServiceTEST {
    @Autowired
    private ArticleDAOTEST dao ;


    @Override
    public List<Article> getArticles() {
        return dao.getArticles();
    }

    @Override
    public Article gettArticle(int articleId) {

        Optional<Article> ArticleOptional = dao.gettArticle(articleId);
        if (ArticleOptional.isPresent())
            return ArticleOptional.get();
        else return new Article();


    }

    @Override
    public Article createArticle(Article article) {
        return dao.createArticle(article);
    }

    @Override
    public Article updateArticle(Article article) {
        return dao.updateArticle(article);
    }

    @Override
    public boolean deleteArticle(Article article) {
        return dao.deleteArticle(article);
    }
}
