package HR.Databank.Elbes.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int UserId;

	private String name;

	private String email;
	
	private String password;
	
	private String role;

	public int getUserId() {
		return UserId;
	}

	public User() {}
	public User(int userId, String name, String email, String password, String role) {
		super();
		UserId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
