package hr.databank.elbes.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor


@Entity

public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY , generator = "articleSeq")
    @SequenceGenerator(name="articleSeq" , sequenceName = "article_idarticle_seq")

    private int idArticle;

    private String nameArticle;
    private String couleur;
    private int taille;
    private int qte;
    private float prix;
    private float prixT;
    private String urlimage;


    public Article(@JsonProperty("idArticle") int idArticle,
                   @JsonProperty("nameArticle") String nameArticle,
                   @JsonProperty("couleur") String couleur,
                   @JsonProperty("taille") int taille,
                   @JsonProperty("qte") int qte,
                   @JsonProperty("prix") float prix,
                   @JsonProperty("prixT") float prixT,
                   String urlimage) {
        this.idArticle = idArticle;
        this.nameArticle = nameArticle;
        this.couleur = couleur;
        this.taille = taille;
        this.qte = qte;
        this.prix = prix;
        this.prixT = prixT;
        this.urlimage = urlimage;

    }



    public String getUrlimage() {
        return urlimage;
    }

    public void setUrlimage(String urlimage) {
        this.urlimage = urlimage;
    }

    public void setPrixT(float prixT) {
        this.prixT = prixT;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
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

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getIdArticle() {
        return idArticle;
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

    public float getPrixT() {
        return prixT;
    }

    public float getPrix() {
        return prix;
    }
}
