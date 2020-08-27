package hr.databank.elbes.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

@SuppressWarnings("ALL")

@Getter
@Setter
@Entity
public class Orders {

    @EmbeddedId
    public OrderPK orderPK;

    public ArrayList<CartItem> cartItem;
    public boolean status;

    @ManyToOne
    @JoinColumn(name = "idArticle", insertable = false, updatable = false)
    private Article article;
    @ManyToOne
    @JoinColumn(name = "UserId", insertable = false, updatable = false)
    private UserEntity userEntity;

    public Orders(@JsonProperty("Order_pk") OrderPK orderPK,
                  @JsonProperty("status") boolean status) {

        this.orderPK = orderPK;

        this.status = status;

    }

    public Orders() {
    }
}













