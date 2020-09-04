package hr.databank.elbes.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;



 
@Embeddable
public class CartItemPK implements Serializable {

 public OrderPK orderPK;
 public int idArticle;

 public CartItemPK(@JsonProperty("Order_pk") OrderPK orderPK, @JsonProperty("idAticle") int idArticle) {
  this.orderPK=orderPK;
  this.idArticle=idArticle;
 }

 public CartItemPK() {
 }

 public OrderPK getOrderPK() {
	return orderPK;
}

public void setOrderPK(OrderPK orderPK) {
	this.orderPK = orderPK;
}

public int getIdArticle() {
	return idArticle;
}

public void setIdArticle(int idArticle) {
	this.idArticle = idArticle;
}

@Override
 public String toString() {
  return "CartItemPK{" +
          "orderPK=" + orderPK +
          ", idArticle=" + idArticle +
          '}';
 }
}
