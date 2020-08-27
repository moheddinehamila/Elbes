package hr.databank.elbes.dao.repo;

import hr.databank.elbes.entities.OrderPK;
import hr.databank.elbes.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository <Orders, OrderPK>{


}
