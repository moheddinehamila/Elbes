package hr.databank.elbes.dao;

import hr.databank.elbes.entities.Article;

import java.util.List;
import java.util.Optional;

public interface IArticleDAOTEST {
    List<Article> getArticles();

    Optional<Article> gettArticle(int articleId);

    Article createArticle(Article article);

    Article updateArticle(Article article);

    boolean deleteArticle(Article article);
}
