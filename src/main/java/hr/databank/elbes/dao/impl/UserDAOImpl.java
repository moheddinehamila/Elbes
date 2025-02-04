package hr.databank.elbes.dao.impl;

import java.util.List;

import hr.databank.elbes.dao.IUserDAO;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import hr.databank.elbes.entities.UserEntity;

@Transactional
@Repository
public class UserDAOImpl implements IUserDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<UserEntity> getAll() {
		String hql = "select u from UserEntity u";
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

	}
	@Override
	public UserEntity connect(String email, String password) {
		 
		
		Query q = entityManager.createQuery("select u from UserEntity u where u.email=:email and u.password=:password");
		q.setParameter("email", email);
		q.setParameter("password", password);
		
		try {
		return (UserEntity)q.getSingleResult(); 
		} catch (NoResultException e) {
		    
		}
		 return null; 
	} 
 
	@Override
	public UserEntity findById(int id) {
		return entityManager.find(UserEntity.class, id);
	}

	@Override
	public boolean DeleteUser(UserEntity u) {

		entityManager.remove(entityManager.merge(u));

		boolean status = entityManager.contains(u);
		if (status) {
			return false;
		}
		return true;
	}

}
