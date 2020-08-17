package hr.databank.elbes.dao.repo;

import hr.databank.elbes.entities.Article;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IArticleDAO {
    public  int insertAricle(UUID idArticle ,Article article) ;
    public default int insertAricle( Article article) {
        UUID idArticle = UUID.randomUUID() ;
        return  insertAricle(idArticle , article); }

        List<Article> selectAll() ;




Optional<Article> selectArticleById (UUID id ) ;
    int deleteArticleById (UUID  id );


    int UpdateArticleById (UUID  id ,Article article) ;




}

