package hr.databank.elbes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import hr.databank.elbes.entities.UserEntity;
@Service
public interface IUserService {

	UserEntity AddUser(UserEntity u);

	UserEntity UpdateUser(UserEntity u);

	boolean DeleteUser(UserEntity id);

	UserEntity findById(int id);

	List<UserEntity> getAll();
}
