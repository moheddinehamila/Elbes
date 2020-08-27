package hr.databank.elbes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity

@Getter
@Setter
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	public int UserId;
	@OneToMany(targetEntity= Orders.class ,mappedBy = "userEntity")
	public List<Orders> ordes;

	private String name;

	private String family_name;

	private String password;

	private String adress;
	private String email;

	public enum Role {

		Admin, Client, Owner

	} 
	public UserEntity() {
		
		
	}

 
	public UserEntity(	@JsonProperty("userId")  int userId,
						@JsonProperty("name") String name,
						@JsonProperty("family_name") String family_name, 
						@JsonProperty("password") String password, 
						@JsonProperty("adress") String adress,
						@JsonProperty("email") String email,
						@JsonProperty("role") Role role) {
		super();
		UserId = userId;
		this.name = name; 
		this.family_name = family_name;
		this.password = password;
		this.adress = adress;
		this.email = email;
		this.role = role;
	}

 
	private Role role;

	// @OneToMany
	// List<Orders> orders;

}
