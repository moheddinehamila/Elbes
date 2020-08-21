package hr.databank.elbes.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;

 
import hr.databank.elbes.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}