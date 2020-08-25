package hr.databank.elbes.entities;


import lombok.*;

import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class CartItem {

    private double TotalPrice;
    private UUID idArticle;
    private int qte;


    @Override
    public boolean equals(Object CI){
        CartItem item = (CartItem) CI;
        return item!= null && item.idArticle==this.idArticle;
    }
}
