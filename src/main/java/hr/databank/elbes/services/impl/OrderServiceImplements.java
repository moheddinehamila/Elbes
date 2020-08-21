package hr.databank.elbes.services.impl;

import hr.databank.elbes.dao.IOrderDAO;
import hr.databank.elbes.entities.Orders;
import hr.databank.elbes.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class OrderServiceImplements implements IOrderService {

    @Autowired
    IOrderDAO iOrderDAO;
    @Override
    public Orders AddOrder(Orders o) {
        return iOrderDAO.AddOrder(o);
    }

    @Override
    public Optional<Orders> findById(Long IdOrder) {
        return iOrderDAO.findById(IdOrder);
    }


    @Override
    public List<Orders> getAll() {
        return iOrderDAO.getAll();
    }
}
