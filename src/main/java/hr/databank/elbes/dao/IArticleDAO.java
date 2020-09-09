package hr.databank.elbes.dao;

import hr.databank.elbes.entities.Article;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.List;


public interface IArticleDAO {

    List<Article> getArticles();

    Article getArticle(int articleId);

    Article createArticle(Article article);

    Article updateArticle(Article article);

    boolean deleteArticle(int id);

    Path saveImage(MultipartFile imagefile) throws Exception;



}


