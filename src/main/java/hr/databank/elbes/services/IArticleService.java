package hr.databank.elbes.services;

import hr.databank.elbes.entities.Article;

import java.util.List;

public interface IArticleService {
    List<Article> getArticles();

    Article getArticle(int articleId);

    Article createArticle(Article article);

    Article updateArticle(Article article);

    boolean deleteArticle(int id );


}
