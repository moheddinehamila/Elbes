package hr.databank.elbes.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor

@Entity

@Table (name="Article")

public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idArticle")
    private int  idArticle;



    @Column(name = "nameArticle")
    private String nameArticle;

    @Column(name = "couleur")
    private String couleur;

    @Column(name = "taille")
    private int taille ;

    @Column(name = "qte")
    private int qte;

    @Column(name = "prix")
    private float prix;



    public float getPrix() {
        return prix;
    }

    public int getIdArticle() {
        return idArticle;
    }

    public int getQte() {
        return qte;
    }

    public int getTaille() {
        return taille;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getNameArticle() {
        return nameArticle;
    }

    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }

    public void setNameArticle(String nameArticle) {
        this.nameArticle = nameArticle;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
