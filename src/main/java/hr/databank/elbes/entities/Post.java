package hr.databank.elbes.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@NoArgsConstructor
@Getter
@Setter
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPost;

    private String textPost;

    private int userId;

    public Post(@JsonProperty("idPost") int idPost,
                @JsonProperty("textPost") String textPost,
                @JsonProperty("userId") int userId) {
        this.idPost=idPost;
        this.textPost = textPost;
        this.userId = userId;

    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
