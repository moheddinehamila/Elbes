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


    @OneToMany(targetEntity= Orders.class ,mappedBy = "article")
 public List<Orders> ordes;

    @Override
    public String toString() {
        return "Article{" +
                "idArticle=" + idArticle +
                ", nameArticle='" + nameArticle + '\'' +
                ", couleur='" + couleur + '\'' +
                ", taille=" + taille +
                ", qte=" + qte +
                ", prix=" + prix +
                '}';
    }

    public Article(@JsonProperty("idarticle") int idArticle,
                   @JsonProperty("name") String nameArticle,
                   @JsonProperty("couleur") String couleur,
                   @JsonProperty("taille") int taille,
                   @JsonProperty("qte") int qte,
                   @JsonProperty("prix") float prix) {
        this.idArticle = idArticle;
        this.nameArticle = nameArticle;
        this.couleur = couleur;
        this.taille = taille;
        this.qte = qte;
        this.prix = prix;

    }


}
