package hr.databank.elbes.services.impl;

import hr.databank.elbes.dao.IArticleDAO;
import hr.databank.elbes.entities.Article;
import hr.databank.elbes.services.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class ArticleService implements IArticleService {
    @Autowired
    private IArticleDAO dao ;

    @Override
    public List<Article> getArticles() {
        return dao .getArticles();
    }

    @Override
    public Article getArticle(int articleId) {
        return dao.getArticle(articleId);
    }

    @Override
    public Article createArticle(Article article) {
        return dao.createArticle( article);
    }

    @Override
    public Article updateArticle( Article article) {
        return dao.updateArticle(article);
    }

    @Override
    public boolean deleteArticle(int id) {
        return dao.deleteArticle(id);
    }
}
