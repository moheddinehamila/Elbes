package hr.databank.elbes.dao.impl;

import java.util.List; 

import hr.databank.elbes.dao.repo.IUserDAO;
import hr.databank.elbes.entities.UserEntity;

public class UserDAOImpl implements IUserDAO{

	@Override
<<<<<<< HEAD
	public UserEntity AddUser(UserEntity u) {
		// TODO Auto-generated method stub
=======
	public UserEntity ajouterProduit(UserEntity produit) {
>>>>>>> cce85eb16808d200b424b07037f4cc9ec2b0391b
		return null;
	}

	@Override
<<<<<<< HEAD
	public UserEntity UpdateUser(UserEntity u) {
=======
	public UserEntity modifierProduit(UserEntity produit) {
>>>>>>> cce85eb16808d200b424b07037f4cc9ec2b0391b
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean DeleteUser(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
<<<<<<< HEAD
	public UserEntity findById(Long id) {
=======
	public Optional<UserEntity> findById(Long id) {
>>>>>>> cce85eb16808d200b424b07037f4cc9ec2b0391b
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserEntity> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

 

	 
}
