package hr.databank.elbes.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hr.databank.elbes.dao.IUserDAO;
import hr.databank.elbes.entities.UserEntity;
import hr.databank.elbes.services.IUserService;

public class UserServiceImplement implements IUserService {

    @Autowired
    IUserDAO iudao;
	
	@Override 
	public UserEntity AddUser(UserEntity u) { 
		return iudao.AddUser(u);
	}

	@Override 
	public UserEntity UpdateUser(UserEntity u) {  
		return iudao.UpdateUser(u);
	}

	@Override
	public boolean DeleteUser(int id) {
		return iudao.DeleteUser(id);
	}

	@Override 
	public UserEntity findById(int id) { 
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserEntity> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

 

	 
}
