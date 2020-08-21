package hr.databank.elbes.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
 

import hr.databank.elbes.dao.IUserDAO;
import hr.databank.elbes.dao.repo.UserRepository;
import hr.databank.elbes.entities.UserEntity;

public class UserDAOImpl implements IUserDAO{

    @Autowired
	UserRepository ur;
    
	@Override
	public UserEntity AddUser(UserEntity u) {
		
		return ur.save(u);
	}

	@Override 
	public UserEntity UpdateUser(UserEntity u) {  

		return ur.save(u);
	}

	@Override
	public boolean DeleteUser(int id) {
		   Optional<UserEntity>userOptional = ur.findById(id);
	        if (userOptional.isPresent()) 
	        	ur.delete(userOptional.get());
	        	
	            return true;
	}

	@Override 
	public UserEntity findById(int id) { 
		return null;//ur.findById(id);
	}

	@Override
	public List<UserEntity> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

 

	 
}
