package hr.databank.elbes.dao.impl;

import hr.databank.elbes.dao.IArticleDAO;
import hr.databank.elbes.entities.Article;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.*;

@Transactional
@Repository
public class ArticleDAOImpl implements IArticleDAO {
@PersistenceContext
private EntityManager entityManager ;


    @SuppressWarnings("unchecked")


    @Override
    public List<Article> getArticles() {
        String hql = "FROM Article as a ORDER BY a.idArticle";
        return (List<Article>) entityManager.createQuery(hql).getResultList();

    }

    @Override
    public Article getArticle(int articleId) {

    return entityManager.find(Article.class, articleId);
    }

    @Override
    public Article createArticle(Article article) {
        entityManager.persist(article);
        Article b =getLastInsertedArticle();
        return b;
    }

    private Article getLastInsertedArticle() {

        String hql = "from  Article order by  idArticle  DESC ";
        Query query = entityManager.createQuery(hql);
        query.setMaxResults(1);
       Article article= (Article) query.getSingleResult();
        return article;


    }

    @Override
    public Article updateArticle(int articleId, Article article) {
        Article articleFromDB = getArticle(articleId);
        articleFromDB.setIdArticle(article.getIdArticle());
        articleFromDB.setNameArticle(article.getNameArticle());
        articleFromDB.setCouleur(article.getCouleur());
        articleFromDB.setTaille(article.getTaille());
        articleFromDB.setPrix(article.getPrix());
        articleFromDB.setQte(article.getQte());
        entityManager.flush();


        Article updatedArticel  = getArticle(articleId);

        return updatedArticel;
}

    @Override
    public boolean deleteArticle(int articleId) {
        Article article = getArticle(articleId);
        entityManager.remove(article);

        boolean status = entityManager.contains(article);
        if(status){
            return false;
        }
        return true;}

}
