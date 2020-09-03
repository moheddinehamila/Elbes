package hr.databank.elbes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


@SpringBootApplication
@Component
public class ElbesApplication {



	public static void main(String[] args) {

		SpringApplication.run(ElbesApplication.class, args);

		/*
		Article article=new Article();

		Cart cart=new Cart();
		CartItem cartItem=new CartItem();
		cartItem.setQte(50);
		cartItem.setIdArticle(2);
		cart.setCartId(1);
		cartItem.setIdItem(5);
		ArrayList<CartItem> cartItems=new ArrayList<>();
		cartItems.add(cartItem);
		cart.setCarttItems(cartItems);
		System.out.println(cart);

		cs.addItemtocart(cart,1,1);

		cs.addItemtocart(cart,1,1);
		cs.addItemtocart(cart,1,1);
		System.out.println(cart);
		cs.removeItemFromCart(cart,1,4);
		cs.DecrementQuantity(cart,5,5);
		cs.getItems(cart);
		System.out.println(cart);







*/



	}


}
