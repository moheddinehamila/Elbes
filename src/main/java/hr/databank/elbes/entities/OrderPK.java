package hr.databank.elbes.entities;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.util.Date;
@Getter
@Setter

@Embeddable
public class OrderPK implements Serializable {
    public int UserId;
    private Long idArticle;
    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
    private Date dateOrder;

}
