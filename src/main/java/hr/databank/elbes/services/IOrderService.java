package hr.databank.elbes.services;

import hr.databank.elbes.entities.*;

import java.util.List;
import java.util.Optional;


public interface IOrderService {
    Orders AddOrder(Orders o);
    Orders findById(OrderPK orderPK);

    List<Orders> getAll();

    List<Orders> getordersbyuserid(OrderPK orderPK);

    Orders getCartByUserID(int id_user );
    Article getCartByArticleID(int idArticle);
    CartItem addArticleToCartItem(int IdUser,int idArticle);
     List<CartItem> getCartItemByUserID(int idu);
     Orders SaveCartToOrder(int userId);
   CartItem incrementQteInCart(int idUser, int idArticle);
  CartItem decrementQteInCart(int idUser, int idArticle);
    List<CartItem> deleteFromCart(int idUser, int idArticle);
   List<CartItem> showMyOrders(int idUser);



}


