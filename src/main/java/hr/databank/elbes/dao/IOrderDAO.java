package hr.databank.elbes.dao;

import hr.databank.elbes.entities.OrderPK;
import hr.databank.elbes.entities.Orders;

import java.util.List;
import java.util.Optional;

public interface IOrderDAO {
    Orders AddOrder(Orders o);
    Optional<Orders> findById(OrderPK orderPK);
    List<Orders> getAll();
    List<Orders>getOrdersByUserId(int userid);
}
