package hr.databank.elbes.services;

import hr.databank.elbes.entities.Article;
import hr.databank.elbes.entities.CartItem;
import hr.databank.elbes.entities.Orders;

import java.util.ArrayList;
import java.util.UUID;

public interface ICartService {


        public void addItemtocart(int UserId, UUID idArticle);
        public void removeItemFromCart(int UserId,UUID idArticle);
        public void setQuantity( UUID idArticle, int quantity);
        public ArrayList<CartItem> getItems();
        //public Orders createOrder(String cartId, Orders order);

}
