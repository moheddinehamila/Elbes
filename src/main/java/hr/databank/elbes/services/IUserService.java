package hr.databank.elbes.services;

import java.util.List;

import hr.databank.elbes.entities.UserEntity;

 
public interface IUserService {
<<<<<<< HEAD
    UserEntity AddUser(UserEntity u);
    UserEntity UpdateUser(UserEntity u);
    boolean DeleteUser(int id);
    UserEntity findById(int id);
=======
    UserEntity ajouterProduit(UserEntity u);
    UserEntity modifierProduit(UserEntity u);
    boolean supprimerProduit(Long id);
    UserEntity findById(Long id);
>>>>>>> cce85eb16808d200b424b07037f4cc9ec2b0391b
    List<UserEntity> getAll();
}
