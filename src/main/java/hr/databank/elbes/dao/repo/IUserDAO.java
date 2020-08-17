package hr.databank.elbes.dao.repo;

import java.util.List;
import java.util.Optional;

import hr.databank.elbes.entities.User;

 
public interface IUserDAO {
    User ajouterProduit(User produit);
    User modifierProduit(User produit);
    Boolean supprimerProduit(Long id);
    Optional<User>findById(Long id);
    List<User>getAll ();

}
