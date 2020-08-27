package hr.databank.elbes.entities;


import lombok.*;

import javax.persistence.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Cart {
    public int cartId;
    public int UserId;
    public double FinalPrice;
    private ArrayList<CartItem> carttItems;

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", UserId=" + UserId +
                ", FinalPrice=" + FinalPrice +
                ", carttItems=" + carttItems +
                '}';
    }
}
