package hr.databank.elbes.services.impl;

import hr.databank.elbes.entities.Cart;
import hr.databank.elbes.entities.CartItem;
import hr.databank.elbes.services.ICartService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;


@Service
public class CartServiceImplement implements ICartService {
private CartItem cartItem;
private Cart cart;


    @Override
    public void addItemtocart(int UserId, UUID idArticle) {
        cartItem.setIdArticle(idArticle);
        cartItem.setQte(1);
        cartItem.setTotalPrice();
        cart.getCarttItems().add(cartItem);

    }

    @Override
    public void removeItemFromCart(int UserId, UUID idArticle) {

    }

    @Override
    public void setQuantity(UUID idArticle, int quantity) {

    }

    @Override
    public ArrayList<CartItem> getItems() {
        return cart.getCarttItems();  }
}
