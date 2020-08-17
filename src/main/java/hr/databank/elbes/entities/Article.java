package hr.databank.elbes.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;
import java.util.UUID;
@AllArgsConstructor
@Getter
@Entity
@Table (name="Article")

public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idArticle;

    private String refArticle;
    private String nameArticle;
    private String couleur;
    private int taille ;
    private int qte;
    private float prix;





}
