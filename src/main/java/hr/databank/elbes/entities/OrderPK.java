package hr.databank.elbes.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.util.Date;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

 

@Embeddable
public class OrderPK implements Serializable {
    // @Column(name = "UserId", nullable = false)
    public int userId;

    //@DateTimeFormat(pattern ="dd-MM-yyyy hh:mm:ss")
    //  @Column(name = "dateOrder", nullable = false)
    private Date dateOrder;

    @Override
    public String toString() {
        return "OrderPK{" +
                "UserId=" + userId +
                ", dateOrder=" + dateOrder +
                '}';
    }

    public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}

	public OrderPK(@JsonProperty("UserId") int UserId,
                   @JsonProperty("date") Date dateOrder) {
        this.dateOrder = dateOrder;
        this.userId = UserId;

    }
    public OrderPK(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderPK orderPK = (OrderPK) o;
        return userId == orderPK.userId &&

                dateOrder.equals(orderPK.dateOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId,  dateOrder);
    }
}

