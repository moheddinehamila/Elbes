package hr.databank.elbes.dao.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import hr.databank.elbes.dao.IUserDAO;
import hr.databank.elbes.dao.repo.UserRepository;
import hr.databank.elbes.entities.UserEntity;

@Transactional
@Repository
public class UserDAOImpl implements IUserDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<UserEntity> getAll() {
		String hql="select u from UserEntity u";
		return (List<UserEntity>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public UserEntity AddUser(UserEntity u) {
		entityManager.persist(u);
        return u;
	}

	@Override
	public UserEntity UpdateUser(UserEntity u) {
		entityManager.merge(u);
        return u; 
		// TODO Auto-generated method stub

	}

  
	@Override
	public UserEntity findById(int id) {

        return entityManager.find(UserEntity.class, id);
	}

	@Override
	public boolean DeleteUser(UserEntity u) 
	{
		
		entityManager.remove(entityManager.merge(u));

    boolean status = entityManager.contains(u);
    if (status) {
        return false;
    }
    return true;
	}

}
