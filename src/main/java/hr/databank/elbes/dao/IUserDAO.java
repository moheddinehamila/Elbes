package hr.databank.elbes.dao;


import java.util.List;  

import hr.databank.elbes.entities.UserEntity;

 
public interface IUserDAO {

    UserEntity AddUser(UserEntity u);
    UserEntity UpdateUser(UserEntity u);
    boolean DeleteUser(int id);
    UserEntity findById(int id);
    List<UserEntity> getAll();
}

