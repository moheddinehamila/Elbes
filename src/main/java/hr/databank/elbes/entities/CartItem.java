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
    private int idArticle;
    private int qte;
   private int IdItem;

    @Override
    public String toString() {
        return "CartItem{" +
                "TotalPrice=" + TotalPrice +
                ", idArticle=" + idArticle +
                ", qte=" + qte +
                ", IdItem=" + IdItem +
                '}';
    }

    @Override
    public boolean equals(Object CI){
        CartItem item = (CartItem) CI;
        return item!= null && item.idArticle==this.idArticle;
    }
}
