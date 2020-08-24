package hr.databank.elbes.dao;

import hr.databank.elbes.entities.Article;

import java.util.List;


public interface IArticleDAO {

    List<Article> getArticles();

    Article getArticle(int articleId);

    Article createArticle(Article article);

    Article updateArticle(Article article);

    boolean deleteArticle(Article article);


}


