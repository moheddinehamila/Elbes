package hr.databank.elbes.services;

import java.util.List;

import hr.databank.elbes.entities.UserEntity;

 
public interface IUserService {
    UserEntity ajouterProduit(UserEntity u);
    UserEntity modifierProduit(UserEntity u);
    boolean supprimerProduit(Long id);
    UserEntity findById(Long id);
    List<UserEntity> getAll();
}
