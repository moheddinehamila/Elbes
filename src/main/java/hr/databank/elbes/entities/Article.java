package hr.databank.elbes.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import javax.persistence.*;



@Entity
@NoArgsConstructor

public class Article  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  idArticle;

    private String nameArticle;

    private String couleur;

    private int taille ;

    private int qte;

    private float prix;

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

    public  Article (@JsonProperty("idarticle") int idArticle ,
                     @JsonProperty("name") String nameArticle,
                     @JsonProperty("couleur")  String couleur,
                     @JsonProperty("taille") int taille ,
                     @JsonProperty("qte") int qte ,
                     @JsonProperty("prix") float prix  ){
    this.idArticle= idArticle;
    this.nameArticle= nameArticle;
    this.couleur= couleur;
    this.taille= taille ;
    this.qte= qte ;
    this.prix= prix;

}

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
