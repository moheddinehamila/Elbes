package hr.databank.elbes.services;

import java.util.List;
import java.util.Optional;

import hr.databank.elbes.entities.UserEntity;

public interface IUserService {

    UserEntity AddUser(UserEntity u);
    UserEntity UpdateUser(UserEntity u);
    boolean DeleteUser(int id);
    Optional<UserEntity> findById(int id);
     List<UserEntity> getAll();
}
