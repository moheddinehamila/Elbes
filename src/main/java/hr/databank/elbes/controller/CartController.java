package hr.databank.elbes.controller;


import hr.databank.elbes.entities.Cart;
import hr.databank.elbes.entities.CartItem;
import hr.databank.elbes.services.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping("/cart")
public class CartController {
    /*
    @Autowired
    ICartService icartService;



    @PostMapping("/{id}")
    public void addItemtocart(int UserId, int idArticle) {
      Cart cart=new Cart();
        icartService.addItemtocart(cart,UserId,idArticle);

    }

    @Override
    public void removeItemFromCart(int UserId, int idArticle) {

    }



    @Override
    public ArrayList<CartItem> getItems() {
        return null;
    }



    @PostMapping("/{id}")
    public String addItel(@PathVariable("id") String cartId, @RequestBody CartItem cartItem){
        icartService.addProduct();
        return "OK";
    }

    @GetMapping("/{id}")
    public ArrayList<CartItem> getCartItems(){
        return icartService.getItems();
    }

    @DeleteMapping("{id}/{Article_id}")
    public String removeItem(@PathVariable("id") int cartId, @PathVariable("Article_id") String productId){
        icartService.removeProduct(cartId,productId);
        return "OK";
    }

   /* @PostMapping("{id}/quantity")
    public String setProductQuantity(@PathVariable("id") String cartId,@RequestBody CartItem cartItem){

        int ArticleId = cartItem.getIdArticle();
        icartService.setProductQuantity(cartId, ArticleId, cartItem.getQte());
        return "OK";
    }*/


}
