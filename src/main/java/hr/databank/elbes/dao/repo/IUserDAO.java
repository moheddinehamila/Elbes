package hr.databank.elbes.dao.repo;


import java.util.List;
import java.util.Optional;

import hr.databank.elbes.entities.UserEntity;

 
public interface IUserDAO {
    UserEntity ajouterProduit(UserEntity produit);
    UserEntity modifierProduit(UserEntity produit);
    Boolean supprimerProduit(Long id);
    Optional<UserEntity>findById(Long id);
    List<UserEntity>getAll ();


}
