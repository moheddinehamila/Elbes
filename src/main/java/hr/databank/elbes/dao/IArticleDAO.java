package hr.databank.elbes.dao;

import hr.databank.elbes.entities.Article;

import java.util.List;


public interface IArticleDAO {

    List<Article> getArticles ();
    Article getArticle (int articleId);
    Article createArticle (Article article);
    Article updateArticle  (int articleId , Article article);
    boolean deleteArticle(int articleId);



}

