package hr.databank.elbes.dao;

import hr.databank.elbes.entities.Orders;

import java.util.List;
import java.util.Optional;

public interface IOrderDAO {
    Orders AddOrder(Orders o);
    Optional<Orders> findById(Long IdOrder);
    List<Orders> getAll();
}
