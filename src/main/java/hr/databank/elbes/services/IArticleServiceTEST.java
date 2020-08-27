package hr.databank.elbes.services;

import hr.databank.elbes.entities.Article;

import java.util.List;
import java.util.Optional;

public interface IArticleServiceTEST {

        List<Article> getArticles();

        Article  gettArticle(int articleId);

        Article createArticle(Article article);

        Article updateArticle(Article article);

        boolean deleteArticle(Article article);
}
