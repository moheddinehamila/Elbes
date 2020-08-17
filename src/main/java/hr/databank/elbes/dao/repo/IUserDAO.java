package hr.databank.elbes.dao.repo;

<<<<<<< HEAD
import java.util.List; 
=======

import java.util.List;
import java.util.Optional;
>>>>>>> cce85eb16808d200b424b07037f4cc9ec2b0391b

import hr.databank.elbes.entities.UserEntity;

 
public interface IUserDAO {
<<<<<<< HEAD
    UserEntity AddUser(UserEntity u);
    UserEntity UpdateUser(UserEntity u);
    boolean DeleteUser(Long id);
    UserEntity findById(Long id);
    List<UserEntity> getAll();
}
=======
    UserEntity ajouterProduit(UserEntity produit);
    UserEntity modifierProduit(UserEntity produit);
    Boolean supprimerProduit(Long id);
    Optional<UserEntity>findById(Long id);
    List<UserEntity>getAll ();


}
>>>>>>> cce85eb16808d200b424b07037f4cc9ec2b0391b
