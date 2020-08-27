package hr.databank.elbes.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

@SuppressWarnings("ALL")

@Getter
@Setter
@Entity
public class Orders implements Serializable {
    @EmbeddedId
    @Column(nullable = false, length = 50)
    private OrderPK orderPK;
   // @Column(columnDefinition = "default(false)")
    private boolean status;
     public ArrayList<CartItem> cartItem;
public Orders(){

}
   public Orders(@JsonProperty("orderPK")OrderPK orderPK, @JsonProperty("Status")Boolean status){
      this.orderPK=orderPK;
      this.status=status;
   }


}













