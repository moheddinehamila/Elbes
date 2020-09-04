package hr.databank.elbes.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import hr.databank.elbes.services.impl.OrderServiceImplements;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor

public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idArticle;

    private String nameArticle;

    private String couleur;

    private int taille;

    private int qte;

    private float prix;
    private float prixT;
    private String urlimage;


    @OneToMany(targetEntity = Orders.class, mappedBy = "article")
    public List<Orders> ordes;


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
        this.prixT =prixT;
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

    public float getPrix() {
        return prix;
    }
}



