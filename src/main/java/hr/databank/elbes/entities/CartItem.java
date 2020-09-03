package hr.databank.elbes.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;




@Entity
public class CartItem implements Serializable {
    public void setArticle(Article article) {
        this.article = article;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    @EmbeddedId
    public CartItemPK cartItemPK;
    private int qte;
    @Transient
    @ManyToOne
    @JoinColumn(name = "idArticle", insertable = false, updatable = false)
    public Article article;

    @MapsId("Order_pk")
    @Transient
    @ManyToOne(fetch = FetchType.LAZY)
    public Orders orders;


    public CartItemPK getCartItemPK() {
        return cartItemPK;
    }

    public void setCartItemPK(CartItemPK cartItemPK) {
        this.cartItemPK = cartItemPK;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public CartItem(@JsonProperty("CartItem_PK") CartItemPK cartItemPK,
                    @JsonProperty("qte") int qte)
    {
        this.cartItemPK=cartItemPK;
        this.qte=qte;
    }

    public CartItem( ) {
        this.cartItemPK=new CartItemPK();
        this.cartItemPK.orderPK=new OrderPK();
        this.cartItemPK.orderPK.setDateOrder(new Date());

    }

    @Override
    public String toString() {
        return "CartItem{" +
                "cartItemPK=" + cartItemPK +
                ", qte=" + qte +
                ", article=" + article +
                ", orders=" + orders +
                '}';
    }
}
