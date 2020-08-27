package hr.databank.elbes.services;

import hr.databank.elbes.entities.Article;
import hr.databank.elbes.entities.Cart;
import hr.databank.elbes.entities.CartItem;
import hr.databank.elbes.entities.Orders;

import java.util.ArrayList;


public interface ICartService {

        public Cart CartByUserId(int UserId);
        public void addItemtocart(Cart cart, int UserId, int idArticle);
        public void removeItemFromCart(Cart cart,int UserId,int idArticle);
        public void IncrementQuantity( Cart cart,int IdItem, int quantity);
        public void DecrementQuantity(Cart cart, int IdItem, int quantity);
        public ArrayList<CartItem> getItems(Cart cart);
        //public Orders createOrder(String cartId, Orders order);

}
