package hr.databank.elbes.dao.repo;

import hr.databank.elbes.entities.OrderPK;
import hr.databank.elbes.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Orders, OrderPK>{


}
