package hr.databank.elbes.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true,nullable = false)
    private String refArticle;
    private String nameArticle;
    private String couleur;
    private int taille ;
    private float qte;
    private double amount;

    public Long getId() {
        return id;
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

    public double getAmount() {
        return amount;
    }


    public Article(String refArticle, String nameArticle, String couleur, int taille, float qte, double amount) {
        this.refArticle = refArticle;
        this.nameArticle = nameArticle;
        this.couleur = couleur;
        this.taille = taille;
        this.qte = qte;
        this.amount = amount;
    }

    public Article() {
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setQte(float qte) {
        this.qte = qte;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
