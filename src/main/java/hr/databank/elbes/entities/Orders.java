package hr.databank.elbes.entities;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Orders implements Serializable {
    @EmbeddedId
    @Column(nullable = false, length = 50)
    private OrderPK orderPK;

    @Column(nullable = false, length = 50)
    private Long IdOrder;

}













