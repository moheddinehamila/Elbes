package hr.databank.elbes.entities;


import lombok.*;

import javax.persistence.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Basket {

    public int UserId;
    private Long idArticle;
    private int qte;
    private float prixtotal;

    private int IdBasket;



}
