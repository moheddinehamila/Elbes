package hr.databank.elbes.controller;

import hr.databank.elbes.entities.CartItem;
import hr.databank.elbes.entities.OrderPK;
import hr.databank.elbes.entities.Orders;
import hr.databank.elbes.entities.UserEntity;
import hr.databank.elbes.services.IOrderService;

import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import javax.persistence.PostUpdate;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@Transactional
@RequestMapping(value = "Order")
public class OrderController {

    @Autowired
    private IOrderService iOrderService;



    @GetMapping("/all")
    public ResponseEntity<List<Orders>> getOrders() {
        List<Orders> orders = iOrderService.getAll();
        return new ResponseEntity<List<Orders>>(orders, HttpStatus.OK);
    }



    @GetMapping("/getmycart/{uid}")
    public ResponseEntity<List<CartItem>> getCartItemByUserID(@PathVariable("uid") int id_user) {
        List<CartItem> cartItem = iOrderService.getCartItemByUserID(id_user);
        return new ResponseEntity<List<CartItem>>(cartItem, HttpStatus.OK);

    }

    @PutMapping("/saveorder/{uid}")
    public ResponseEntity<Orders> SaveCartToOrder(@PathVariable("uid") int id_user) {
        Orders orders = iOrderService.SaveCartToOrder(id_user);
        Orders o= new Orders();
        o.orderPK=new OrderPK();
        o.setStatus(false);
        o.orderPK.setUserId(id_user);
        o.orderPK.setDateOrder(new Date());
        createOrder(o);
        return new ResponseEntity<Orders>(orders, HttpStatus.OK);
    }


    @PutMapping("/incrementQte/{uid}/{aid}")
    public ResponseEntity<CartItem>  incrementQteInCart(@PathVariable("uid") int id_user, @PathVariable("aid") int idArticle) {
        CartItem cartItem = iOrderService.incrementQteInCart(id_user, idArticle);
        return new ResponseEntity<CartItem>(cartItem, HttpStatus.OK);

    }
    @PutMapping("/decrementQte/{uid}/{aid}")
    public ResponseEntity<CartItem>  decrementQteInCart(@PathVariable("uid") int id_user, @PathVariable("aid") int idArticle) {
        CartItem cartItem = iOrderService.decrementQteInCart(id_user, idArticle);
        return new ResponseEntity<CartItem>(cartItem, HttpStatus.OK);

    }


    @PutMapping("/addtocart/{uid}/{aid}")
    public ResponseEntity<CartItem> getOrderByUserID(@PathVariable("uid") int id_user, @PathVariable("aid") int idArticle) {
        CartItem cartItem = iOrderService.addArticleToCartItem(id_user, idArticle);
        return new ResponseEntity<CartItem>(cartItem, HttpStatus.OK);

    }


    @GetMapping("orderhistory/{id}")
    public ResponseEntity<List<Orders>> getOrderByUserID(@PathVariable("id") OrderPK orderPK) {
        List<Orders> listo = new ArrayList<>();
        for (Orders o : iOrderService.getordersbyuserid(orderPK)) {
            if (o.status)
                listo.add(o);
        }

        return new ResponseEntity<List<Orders>>(listo, HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public Orders getOrderByID(@PathVariable("id") OrderPK orderPK) {

        return iOrderService.findById(orderPK);
    }


    @PutMapping("/add")
    public ResponseEntity<Orders> createOrder(@RequestBody Orders orders) {
        Orders o = iOrderService.AddOrder(orders);

        return new ResponseEntity<Orders>(o, HttpStatus.OK);
    }
    @PutMapping("/deletearticlecart/{uid}/{aid}")
    public ResponseEntity<List<CartItem>> deleteFromCart(@PathVariable("uid") int id_user, @PathVariable("aid") int idArticle) {
        List<CartItem> cartItemList = iOrderService.deleteFromCart(id_user,idArticle);

        return new ResponseEntity<List<CartItem>>(cartItemList, HttpStatus.OK);
    }
    @GetMapping("/showmyorders/{uid}")
    public ResponseEntity<List<CartItem>> showMyOrders(@PathVariable("uid") int id_user) {
        List<CartItem> cartItemList  = iOrderService.showMyOrders(id_user);

        return new ResponseEntity<List<CartItem>>(cartItemList, HttpStatus.OK);
    }



}
