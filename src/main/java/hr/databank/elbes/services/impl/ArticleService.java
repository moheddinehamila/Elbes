package hr.databank.elbes.services.impl;

import hr.databank.elbes.dao.IArticleDAO;
import hr.databank.elbes.entities.Article;
import hr.databank.elbes.entities.Post;
import hr.databank.elbes.services.IArticleService;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
@Service
public class ArticleService implements IArticleService {
    @Autowired
    private IArticleDAO dao;

    @Override
    public List<Article> getArticles() {
        return dao.getArticles();
    }

    @Override
    public Article getArticle(int articleId) {
        return dao.getArticle(articleId);
    }

    @Override
    public Article createArticle(Article article) {
        return dao.createArticle(article);
    }

    @Override
    public Article updateArticle(Article article) {
        return dao.updateArticle(article);
    }

    @Override
    public boolean deleteArticle(int id) {
        return dao.deleteArticle(id);
    }

    @Override
    public Path saveImage(MultipartFile imagefile) throws Exception {
        return dao.saveImage(imagefile);
    }

    @Override
    public void exportfacture() throws FileNotFoundException, JRException {
       String path = "C:/files";
        List<Article> articlesInFacture =getArticles();
        File file = ResourceUtils.getFile("classpath:articles.jrxml ");
        JasperReport jasperReport = JasperCompileManager.compileReport((file.getAbsolutePath()));
        JRBeanCollectionDataSource  dataSource= new JRBeanCollectionDataSource(articlesInFacture);
        Map<String, Object> params = new HashMap<>();
        params.put("createdby", "HamdiBhy");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,params, dataSource);
    JasperExportManager.exportReportToPdfFile(jasperPrint, path+"/articles.pdf");

    }

}
