package hr.databank.elbes.dao.impl;

import hr.databank.elbes.dao.IArticleDAO;
import hr.databank.elbes.entities.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.transaction.Transactional;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

@Transactional
@Repository

public class ArticleDAOImpl implements IArticleDAO {
    @PersistenceContext
    private EntityManager entityManager;


    @SuppressWarnings("unchecked")


    @Override
    public List<Article> getArticles() {
        String hql = "select a from Article a ORDER BY a.idArticle";
        return (List<Article>) entityManager.createQuery(hql).getResultList();


    }

    @Override
    public Article getArticle(int articleId) {

        return entityManager.find(Article.class, articleId);
    }

    @Override
    public Article createArticle(Article article) {
        entityManager.persist(article);
        return article;
    }


    @Override
    public Article updateArticle(Article article) {
        entityManager.merge(article);
        return article;
    }

    @Override
    public boolean deleteArticle(int id) {
        Article article = getArticle(id);
        entityManager.remove(article);

        boolean status = entityManager.contains(article);
        if (status) {
            return false;
        }
        return true;
    }

    @Override
    public Path saveImage(MultipartFile imagefile) throws Exception {
        String path = "C:/files/";
        byte[] bytes = imagefile.getBytes();
        Path url = Paths.get(path + imagefile.getOriginalFilename());
        Files.write(url, bytes);
        return url;
    }

}
