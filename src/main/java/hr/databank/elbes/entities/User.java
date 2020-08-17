package hr.databank.elbes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Getter
@Setter
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int UserId;
    
	@Column(nullable = false,length=50)
	private String name;

	@Column(nullable = false,length=50)
	private String familyName;

	@Column(nullable = false,length=50)
	private String email;
	
	@Column(nullable = false,length=50)
	private String password;	
	
	@Column(nullable = false,length=100)
	private String adress;
	public enum Role {

		Admin,Client,Owner
		
	}

	@Column(nullable = false,length=50)
	private Role role;

 
	
	
}
