package hr.databank.elbes.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;



@Getter
@Setter
@Embeddable
public class CartItemPK implements Serializable {

 public OrderPK orderPK;
 private int idArticle;

 public CartItemPK(@JsonProperty("Order_pk") OrderPK orderPK, @JsonProperty("idAticle") int idArticle) {
  this.orderPK=orderPK;
  this.idArticle=idArticle;
 }

 public CartItemPK() {
 }

 @Override
 public String toString() {
  return "CartItemPK{" +
          "orderPK=" + orderPK +
          ", idArticle=" + idArticle +
          '}';
 }
}
