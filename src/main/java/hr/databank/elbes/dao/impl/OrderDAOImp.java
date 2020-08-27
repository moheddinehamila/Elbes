package hr.databank.elbes.dao.impl;

import hr.databank.elbes.dao.IOrderDAO;
import hr.databank.elbes.dao.repo.OrderRepository;
import hr.databank.elbes.entities.OrderPK;
import hr.databank.elbes.entities.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class OrderDAOImp implements IOrderDAO {
    @PersistenceContext
    private EntityManager em;
    @Autowired
    private OrderRepository orderRepo;

    @Override
    public Orders AddOrder(Orders o) {
        return orderRepo.save(o);
    }

    @Override
    public Optional<Orders> findById(OrderPK orderPK) {
        return orderRepo.findById(orderPK);
    }


    @Override
    public List<Orders> getAll() {
        String hql = "select o from Orders o";
        return em.createQuery(hql).getResultList();
    }

    @Override
    public List<Orders> getOrdersByUserId(int userid) {/*
        List<Orders> lo = new ArrayList<>();
        for (Orders o : getAll()) {
            if (o.user_id == userid)
                lo.add(o);
        }

        return lo;*/
        return null;
    }


}
