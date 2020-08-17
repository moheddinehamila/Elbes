package hr.databank.elbes.entities;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long idArticle;

    @Column(unique = true,nullable = false)
    private String refArticle;
    private String nameArticle;
    private String couleur;
    private int taille ;

    private int qte;

    private float prix; 

 
 
}
