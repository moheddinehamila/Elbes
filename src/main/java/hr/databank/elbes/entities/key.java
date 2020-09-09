package hr.databank.elbes.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class key implements Serializable {
@Column(name="user_id")
    int userId ;
@Column(name="post_id")
    int postId ;

    public key(int userId, int postId) {
        this.userId = userId;
        this.postId = postId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        key key = (key) o;
        return userId == key.userId &&
                postId == key.postId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, postId);
    }
}
