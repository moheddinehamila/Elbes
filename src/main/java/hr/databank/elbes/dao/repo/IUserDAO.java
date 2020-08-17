package hr.databank.elbes.dao.repo;


import java.util.List;  

import hr.databank.elbes.entities.UserEntity;

 
public interface IUserDAO {

    UserEntity AddUser(UserEntity u);
    UserEntity UpdateUser(UserEntity u);
    boolean DeleteUser(Long id);
    UserEntity findById(Long id);
    List<UserEntity> getAll();
}

