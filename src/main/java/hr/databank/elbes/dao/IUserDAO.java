package hr.databank.elbes.dao;


import java.util.List;
import java.util.Optional;

import hr.databank.elbes.entities.UserEntity;

 
public interface IUserDAO {

    UserEntity AddUser(UserEntity u);
    UserEntity UpdateUser(UserEntity u);
    boolean DeleteUser(UserEntity id);
    UserEntity findById(int id);
    List<UserEntity> getAll();
    UserEntity connect(String email, String password) ;
}

