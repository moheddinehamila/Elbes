package hr.databank.elbes.services;

import hr.databank.elbes.entities.Orders;

import java.util.Date;
import java.util.List;
import java.util.Optional;


public interface IOrderService {
    Orders AddOrder(Orders o);
    Optional<Orders> findById(Long IdOrder);
    List<Orders> getAll();
}


