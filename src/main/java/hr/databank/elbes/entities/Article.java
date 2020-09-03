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

@Entity

public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idArticle;

	private String nameArticle;

	private String couleur;

	private int taille;

	private int qte;

	private float prix;
	private String urlimage;

	public Article() {
		super();
	}


	public Article(@JsonProperty("idarticle") int idArticle, @JsonProperty("name") String nameArticle,
			@JsonProperty("couleur") String couleur, @JsonProperty("taille") int taille, @JsonProperty("qte") int qte,
			@JsonProperty("prix") float prix, String urlimage) {
		this.idArticle = idArticle;
		this.nameArticle = nameArticle;
		this.couleur = couleur;
		this.taille = taille;
		this.qte = qte;
		this.prix = prix;
		this.urlimage = urlimage;

	}

	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public String getNameArticle() {
		return nameArticle;
	}

	public void setNameArticle(String nameArticle) {
		this.nameArticle = nameArticle;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getUrlimage() {
		return urlimage;
	}

	public void setUrlimage(String urlimage) {
		this.urlimage = urlimage;
	}

}
