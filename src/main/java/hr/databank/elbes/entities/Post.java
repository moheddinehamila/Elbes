package hr.databank.elbes.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.NoRepositoryBean;


import javax.persistence.*;
import java.util.Set;


@NoArgsConstructor
@Getter
@Setter
@Entity

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "postSeq")
    @SequenceGenerator(name = "postSeq", sequenceName = "post_idpost_seq")
    private int idPost;
    private String textPost;
    private int likee;
    private int dislikee;

    @ManyToOne()
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private user_test user;

    @OneToMany(mappedBy = "post")
    Set<react> reacts;


    public Post(@JsonProperty("idPost") int idPost,
                @JsonProperty("textPost") String textPost,
                @JsonProperty("user") int userId,
                @JsonProperty("like") int likee,
                @JsonProperty("dislike") int dislikee

    ) {
        this.idPost = idPost;
        this.textPost = textPost;
        this.likee = likee;
        this.dislikee = dislikee;
    }

    public int getDislikee() {
        return dislikee;
    }

    public int getLikee() {
        return likee;
    }

    public void setDislikee(int dislikee) {
        this.dislikee = dislikee;
    }

    public void setLikee(int likee) {
        this.likee = likee;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

    public user_test getUser() {
        return user;
    }

    public void setUser(user_test user) {
        this.user = user;
    }


}
