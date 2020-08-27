package hr.databank.elbes.services;

import hr.databank.elbes.entities.OrderPK;
import hr.databank.elbes.entities.Orders;

import java.util.List;
import java.util.Optional;


public interface IOrderService {
    Orders AddOrder(Orders o);
    Orders findById(OrderPK orderPK);
    List<Orders> getAll();
}


