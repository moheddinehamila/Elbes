package hr.databank.elbes.controller;

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

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Transactional
@RequestMapping(value = "Order")
public class OrderController {

    @Autowired
    private IOrderService iOrderService;

    /* @RequestMapping(value = "/")
     public String getAllOrders(Model model) {
         List<Orders> orders= iOrderService.getAll();
         model.addAttribute("orders", orders);
         return "orders";
     }*/



    @GetMapping("/all")
    public ResponseEntity<List<Orders>> getOrders() {
        List<Orders> orders = iOrderService.getAll();
        return new ResponseEntity<List<Orders>>(orders, HttpStatus.OK);
    }
    @GetMapping("cart/{id}")
    public ResponseEntity<List<Orders>> getcartByUserID(@PathVariable("id") int id) {

        List<Orders> listc = new ArrayList<>();
        for (Orders o : iOrderService.getordersbyuserid(id)) {
            if (!(o.status))
                listc.add(o);
        }

        return new ResponseEntity<List<Orders>>(listc, HttpStatus.OK);

    }

    @GetMapping("order/{id}")
    public ResponseEntity<List<Orders>> getOrderByUserID(@PathVariable("id") int id) {
        List<Orders> listo = new ArrayList<>();
        for (Orders o : iOrderService.getordersbyuserid(id)) {
            if  (o.status)
                listo.add(o);
        }


    @RequestMapping(value = "/add")
    public String addOrdersForm(Model model) {
        model.addAttribute("order", new Orders());
        return "AddOrder";
    }*/

    @RequestMapping(value = "/saveOrders", method = RequestMethod.POST)
    public String saveNewOrder(@Valid Orders ord, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add_order";
        }
        iOrderService.AddOrder(ord);
        return "redirect:";
    }

    @GetMapping("/{id}")
    public Orders getOrderByID(@PathVariable("id") OrderPK orderPK) {

        return iOrderService.findById(orderPK);
    }

}
