package hr.databank.elbes.services;

import java.util.List;

import hr.databank.elbes.entities.User;

 
public interface IUserService {
    User ajouterProduit(User u);
    User modifierProduit(User u);
    boolean supprimerProduit(Long id);
    User findById(Long id);
    List<User> getAll();
}
