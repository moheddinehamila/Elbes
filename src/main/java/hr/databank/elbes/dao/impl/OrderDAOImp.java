package hr.databank.elbes.dao.impl;

import hr.databank.elbes.dao.IOrderDAO;
import hr.databank.elbes.dao.repo.OrderRepository;
import hr.databank.elbes.entities.Orders;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class OrderDAOImp implements IOrderDAO {
    @Autowired
    private OrderRepository orderRepo;
    @Override
    public Orders AddOrder(Orders o) {
        return orderRepo.save(o);
    }

    @Override
    public Optional<Orders> findById(Long IdOrder) {
       return orderRepo.findById(IdOrder);
    }


    @Override
    public List<Orders> getAll() {
        return null;
    }
}
