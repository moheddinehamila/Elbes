package hr.databank.elbes.dao.impl;

import hr.databank.elbes.dao.repo.IArticleDAO;
import hr.databank.elbes.entities.Article;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class ArticleDAOImpl implements IArticleDAO {


    private final JdbcTemplate jdbcTemplate ;

    public ArticleDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertAricle(UUID id, Article article) {

        return 1;
    }

    @Override
    public List<Article> selectAll() {
       return  Collections.emptyList();
    }

    @Override
    public Optional<Article> selectArticleById(UUID id) {

        return  Optional.empty();
    }


    @Override
    public int deleteArticleById(UUID id) {
        return 1 ;
        }

    @Override
    public int UpdateArticleById(UUID id, Article article) {
            return 1;

            }

}
