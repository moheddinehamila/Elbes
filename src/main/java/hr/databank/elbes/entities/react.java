package hr.databank.elbes.entities;

import javax.persistence.*;

@Entity
public class react {
    @EmbeddedId
    key id;
    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    user_test user;


    @ManyToOne
    @MapsId("postId")
    @JoinColumn(name = "post_id")
    Post post ;

    public react(key id, user_test user, Post post) {
        this.id = id;
        this.user = user;
        this.post = post;
    }

    public key getId() {
        return id;
    }

    public void setId(key id) {
        this.id = id;
    }

    public user_test getUser() {
        return user;
    }

    public void setUser(user_test user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

}
