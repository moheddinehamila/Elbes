package hr.databank.elbes.services.impl;

import hr.databank.elbes.dao.IArticleDAO;
import hr.databank.elbes.dao.impl.ArticleDAOImpl;
import hr.databank.elbes.dao.impl.ArticleDAOTEST;
import hr.databank.elbes.entities.Article;
import hr.databank.elbes.entities.Cart;
import hr.databank.elbes.entities.CartItem;
import hr.databank.elbes.services.ICartService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Configurable
@Service
public class CartServiceImplement implements ICartService {
    private CartItem cartItem = new CartItem();
    private Article article = new Article();
    private ArticleServiceTEST articleDAOImpl = new ArticleServiceTEST();
    ArrayList<Cart> CartList=new ArrayList<>();


    @Override
    public Cart CartByUserId(int UserId) {
      for (int i=0;i<CartList.size() ;i++)
          if (UserId==CartList.get(i).getUserId())
              return null ;
    return null;}

    @Override
    public void addItemtocart(Cart cart, int UserId, int idArticle) {
        cartItem.setIdArticle(idArticle);
        cartItem.setQte(1);
article.setQte(5);
        article = articleDAOImpl.gettArticle(1);
        System.out.println(cartItem);
        System.out.println("****"+articleDAOImpl.gettArticle(1));

        System.out.println("----------------"+article);
        cartItem.setTotalPrice(article.getPrix());
        if (!(cart.getCarttItems().contains(cartItem)))
            cart.getCarttItems().add(cartItem);
    }

    @Override
    public void removeItemFromCart(Cart cart, int UserId, int idArticle) {
        cartItem = new CartItem();
        for (CartItem c : getItems(cart)) {
            if (c.getIdArticle() == idArticle) {
                cartItem = c;
            }

        }
        if (cart.getCarttItems().contains(cartItem))
            cart.getCarttItems().remove(cartItem);
    }

    @Override
    public void IncrementQuantity(Cart cart, int IdItem, int quantity) {
        for (CartItem c : getItems(cart))
            if (c.getIdItem() == IdItem) {
                c.setQte(c.getQte() + 1);
            }

    }

    @Override
    public void DecrementQuantity(Cart cart, int IdItem, int quantity) {
        for (CartItem c : getItems(cart))
            if (c.getIdItem() == IdItem) {
                c.setQte(c.getQte() - 1);
            }

    }

    @Override
    public ArrayList<CartItem> getItems(Cart cart) {
        return cart.getCarttItems();
    }
}

