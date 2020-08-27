package hr.databank.elbes.dao.impl;

import hr.databank.elbes.dao.IArticleDAO;
import hr.databank.elbes.dao.IArticleDAOTEST;
import hr.databank.elbes.dao.repo.ArticleRepoTEST;
import hr.databank.elbes.entities.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Configurable
@Service

public class ArticleDAOTEST implements IArticleDAOTEST {
    @Autowired
    private ArticleRepoTEST articleRepoTEST;

    @Override
    public List<Article> getArticles() {
        return (List<Article>) articleRepoTEST.findAll();
    }

    @Override
    public Optional <Article> gettArticle(int articleId) {
        return articleRepoTEST.findById(articleId);
    }

    @Override
    public Article createArticle(Article article) {
        return null;
    }

    @Override
    public Article updateArticle(Article article) {
        return null;
    }

    @Override
    public boolean deleteArticle(Article article) {
        return false;
    }
}
