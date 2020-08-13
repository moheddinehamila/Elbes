package HR.Databank.Elbes.Entities;

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

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Long getIdArticle() {
        return idArticle;
    }

    public String getRefArticle() {
        return refArticle;
    }

    public String getNameArticle() {
        return nameArticle;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getTaille() {
        return taille;
    }

    public float getQte() {
        return qte;
    }




    public Article(String refArticle, String nameArticle, String couleur, int taille, int qte, int prix) {
        this.refArticle = refArticle;
        this.nameArticle = nameArticle;
        this.couleur = couleur;
        this.taille = taille;
        this.qte = qte;
        this.prix= prix;
    }

    public Article() {
    }

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    public void setRefArticle(String refArticle) {
        this.refArticle = refArticle;
    }

    public void setNameArticle(String nameArticle) {
        this.nameArticle = nameArticle;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }



}
