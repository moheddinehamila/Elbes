package hr.databank.elbes.services;

import hr.databank.elbes.entities.Article;
import net.sf.jasperreports.engine.JRException;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.List;

public interface IArticleService {
    List<Article> getArticles();

    Article getArticle(int articleId);

    Article createArticle(Article article);

    Article updateArticle(Article article);

    boolean deleteArticle(int id);

    Path saveImage(MultipartFile imagefile) throws Exception;
    void  exportfacture () throws FileNotFoundException, JRException;

}
