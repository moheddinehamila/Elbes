package hr.databank.elbes.dao;

import hr.databank.elbes.entities.Article;
import hr.databank.elbes.entities.CartItem;
import hr.databank.elbes.entities.OrderPK;
import hr.databank.elbes.entities.Orders;

import java.util.List;
import java.util.Optional;

public interface IOrderDAO {
    Orders AddOrder(Orders o);
    Optional<Orders> findById(OrderPK orderPK);
    List<Orders> getAll();
    List<Orders>getOrdersByUserId(OrderPK orderPK);
  /*CartItem AddItemToCart(int id_user, int idArticle);*/
    Orders getCartByUserID(int id_user );
     Article getArticleByID(int idArticle);
     CartItem addArticleToCartItem(int IdUser,int idArticle);
    public List<CartItem> getCartItemByUserID(int idu);
    public Orders SaveCartToOrder(int userId);
    CartItem incrementQteInCart(int idUser, int idArticle);
    public CartItem decrementQteInCart(int idUser, int idArticle);
    List<CartItem> deleteFromCart(int idUser, int idArticle);
   List<CartItem> showMyOrders(int idUser);
}