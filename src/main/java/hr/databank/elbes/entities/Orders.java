package hr.databank.elbes.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@SuppressWarnings("ALL")

@Entity
public class Orders implements Serializable {

    @EmbeddedId
    public OrderPK orderPK;
    public boolean status;
    @Transient
   // @OneToMany(mappedBy = "orders")
    private List<CartItem>cartItems;

    @ManyToOne
   // @Transient
   // @MapsId("UserId")
    @JoinColumn(name = "UserId", insertable = false, updatable = false)
    private UserEntity userEntity;

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }



    public Orders(@JsonProperty("Order_pk") OrderPK orderPK,
                  @JsonProperty("status") boolean status) {

        this.orderPK = orderPK;

        this.status = status;

    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderPK=" + orderPK +
                ", status=" + status +
                ", cartItems=" + cartItems +
                ", userEntity=" + userEntity +
                '}';
    }

    public Orders() {
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return orderPK.equals(orders.orderPK);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderPK);
    }

    public OrderPK getOrderPK() {
        return orderPK;
    }

    public void setOrderPK(OrderPK orderPK) {
        this.orderPK = orderPK;
    }



    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}













