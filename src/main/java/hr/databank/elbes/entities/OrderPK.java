package hr.databank.elbes.entities;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class OrderPK implements Serializable {
   // @Column(name = "UserId", nullable = false)
    public int UserId=1;
   // @Column(name = "idArticle", nullable = false)
    private int idArticle=1;
    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
  //  @Column(name = "dateOrder", nullable = false)
    private Date dateOrder;


}
