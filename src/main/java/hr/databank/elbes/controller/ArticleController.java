package hr.databank.elbes.controller;


import hr.databank.elbes.entities.Article;
import hr.databank.elbes.services.impl.ArticleServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@RequestMapping("articles")
@RestController
public class ArticleController {
    private final ArticleServiceImplement articleServiceImplement ;
    @Autowired
    public ArticleController(ArticleServiceImplement articleServiceImplement){
        this.articleServiceImplement= articleServiceImplement ;
    }
    @PostMapping
    public  void addAricle (Article article ){

        articleServiceImplement.addArticle(article);
    }


    @GetMapping
   public List<Article> getAll() {
       return articleServiceImplement.getAll();
   }



   @GetMapping(path = "{id}")
   public Article getAricleById(UUID id )
   {
        return articleServiceImplement.GetAritcleById(id).orElse(null );
   }
   @DeleteMapping(path = "{id}")
   public void  deleteAticleById (UUID id ){
        articleServiceImplement.deleteAritcle(id );
   }
   @PutMapping
    public void updateArticle(UUID id ,  Article a ) {
       articleServiceImplement.updateArticle(id , a);
   }
}
