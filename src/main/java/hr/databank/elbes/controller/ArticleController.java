package hr.databank.elbes.controller;

import hr.databank.elbes.entities.Article;
import hr.databank.elbes.services.IArticleService;
import hr.databank.elbes.services.IArticleServiceTEST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@RestController
@RequestMapping("hamdi")
public class ArticleController {
    @Autowired
    private IArticleService service;

    @Autowired
    private IArticleServiceTEST la;
    @GetMapping("artic/{id}")
    public Article gettArticle(@PathVariable("id") int id) {
        Article article = la.gettArticle(id);
        return article;
    }

    @GetMapping("article")
    public ResponseEntity<List<Article>> getArticles() {

        List<Article> articles = service.getArticles();
        return new ResponseEntity<List<Article>>(articles, HttpStatus.OK);

    }

    @GetMapping("article/{id}")
    public Article getArticle(@PathVariable("id") int id) {
        Article article = service.getArticle(id);
        return article;
    }


    @PutMapping("article")
    public ResponseEntity<Article> createArticle(@RequestBody Article article) {
        Article a = service.createArticle(article);
        return new ResponseEntity<Article>(a, HttpStatus.OK);
    }

    @RequestMapping(value = "article/delete", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteArticle(@RequestBody Article article) {
        boolean isDeleted = service.deleteArticle(article);
        if (isDeleted) {
            String responseContent = "Article has been deleted successfully";
            return new ResponseEntity<String>(responseContent, HttpStatus.OK);
        }
        String error = "Error while deleting article  from database";
        return new ResponseEntity<String>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PutMapping("article/update")
    public ResponseEntity<Article> updateArticle(@RequestBody Article article) {

        Article a = service.updateArticle(article);
        return new ResponseEntity<Article>(a, HttpStatus.OK);
    }


}
