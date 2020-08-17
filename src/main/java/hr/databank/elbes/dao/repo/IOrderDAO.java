package hr.databank.elbes.dao.repo;

import hr.databank.elbes.entities.Orders;

import java.util.Date;
import java.util.List;

public interface IOrderDAO {
    Orders AddOrder(Orders o);
    Orders findById(int UserId, Long idArticle, Date dateOrder);
    List<Orders> getAll();
}
