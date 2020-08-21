package hr.databank.elbes.services.impl;

import hr.databank.elbes.dao.IArticleDAO;
import hr.databank.elbes.entities.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ArticleServiceImplement {
    private final IArticleDAO articleDAO  ;
    @Autowired
    public  ArticleServiceImplement(@Qualifier("postgres") IArticleDAO articleDAO ){

        this.articleDAO= articleDAO ;
    }
    public int addArticle (Article article){

        return articleDAO.insertAricle(article);
    }
    public List <Article> getAll(){
     return articleDAO.selectAll() ;
    }
    public Optional<Article> GetAritcleById(UUID id ){
        return articleDAO.selectArticleById(id );
    }
    public  int deleteAritcle(UUID id )
    {
        return  articleDAO.deleteArticleById(id );
    }

    public  int updateArticle(UUID id , Article a ){

        return articleDAO.UpdateArticleById(id , a );
    }
}
