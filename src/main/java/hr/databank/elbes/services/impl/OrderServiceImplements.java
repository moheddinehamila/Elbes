package hr.databank.elbes.services.impl;

import hr.databank.elbes.dao.IOrderDAO;
import hr.databank.elbes.entities.*;
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
    public List<Orders> getordersbyuserid(OrderPK orderPK) {
        return iOrderDAO.getOrdersByUserId(orderPK);
    }




    @Override
    public Orders getCartByUserID(int id_user) {
        return iOrderDAO.getCartByUserID(id_user);
    }

    @Override
    public Article getCartByArticleID(int idArticle) {
        return iOrderDAO.getArticleByID(idArticle);
    }

    @Override
    public CartItem addArticleToCartItem(int IdUser, int idArticle) {
        return iOrderDAO.addArticleToCartItem(IdUser, idArticle);
    }
    @Override
    public List<CartItem> getCartItemByUserID(int idu) {
        return iOrderDAO.getCartItemByUserID(idu);
    }
    @Override
    public Orders SaveCartToOrder(int userId) {
        return iOrderDAO.SaveCartToOrder(userId);
    }
    @Override
    public CartItem incrementQteInCart(int idUser, int idArticle) {
        return iOrderDAO.incrementQteInCart(idUser,idArticle);

    }
    @Override
    public CartItem decrementQteInCart(int idUser, int idArticle) {
        return iOrderDAO.decrementQteInCart(idUser,idArticle);

    }
    @Override
    public List<CartItem> deleteFromCart(int idUser, int idArticle){
        return iOrderDAO.deleteFromCart( idUser, idArticle);
    }
    @Override
    public List<CartItem> showMyOrders(int idUser){
        return iOrderDAO.showMyOrders(idUser);
    }
}
