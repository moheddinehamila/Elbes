package hr.databank.elbes.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class user_test {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "userSeq")
    @SequenceGenerator(name = "userSeq", sequenceName = "user_test_userid_seq")
    private int userId;
    private String name;
    private String mail;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    @OneToMany(mappedBy = "user")
    Set<react> reacts;

    public user_test(@JsonProperty("userId") int userId,
                     @JsonProperty("name") String name,
                     @JsonProperty("email") String mail,
                     @JsonProperty("password") String password) {
        this.userId = userId;
        this.name = name;
        this.mail = mail;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}


