package hr.databank.elbes.services.impl;

import hr.databank.elbes.dao.IOrderDAO;
import hr.databank.elbes.entities.Cart;
import hr.databank.elbes.entities.OrderPK;
import hr.databank.elbes.entities.Orders;
import hr.databank.elbes.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OrderServiceImplements implements IOrderService {

    @Autowired
    IOrderDAO iOrderDAO;
    @Override
    public Orders AddOrder(Orders o) {
        return iOrderDAO.AddOrder(o);
    }

    @Override
    public Orders findById(OrderPK orderPK) {
        return iOrderDAO.findById(orderPK).get();
    }


    @Override
    public List<Orders> getAll() {
        return iOrderDAO.getAll();
    }

    @Override
    public List<Orders> getordersbyuserid(int userid) {
        return iOrderDAO.getOrdersByUserId(userid);
    }
    @Override
    public void addItemtocart(Cart cart, int UserId, int idArticle) {
       /* cartItem.setIdArticle(idArticle);
        cartItem.setQte(1);
        article.setQte(5);
        article = articleDAOImpl.gettArticle(1);
        System.out.println(cartItem);
        System.out.println("****"+articleDAOImpl.gettArticle(1));

        System.out.println("----------------"+article);
        cartItem.setTotalPrice(article.getPrix());
        if (!(cart.getCarttItems().contains(cartItem)))
            cart.getCarttItems().add(cartItem);*/
    }

}
