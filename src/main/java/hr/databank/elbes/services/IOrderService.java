package hr.databank.elbes.services;

import hr.databank.elbes.entities.Orders;

import java.util.Date;
import java.util.List;


public interface IOrderService {
    Orders AddOrder(Orders o);
    Orders findById(int UserId, Long idArticle, Date dateOrder);
    List<Orders> getAll();
}
