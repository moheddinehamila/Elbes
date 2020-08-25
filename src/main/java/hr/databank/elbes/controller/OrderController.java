package hr.databank.elbes.controller;

import hr.databank.elbes.entities.Orders;
import hr.databank.elbes.services.IOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import javax.validation.Valid;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Orders")
public class OrderController {

@Autowired

private IOrderService iOrderService;



    @RequestMapping(value = "/")
    public String getAllOrders(Model model) {
        List<Orders> orders= iOrderService.getAll();
        model.addAttribute("orders", orders);
        return "orders";
    }

    @RequestMapping(value = "/add")
    public String addOrdersForm(Model model) {
        model.addAttribute("order", new Orders());
        return "AddOrder";
    }

  @RequestMapping(value = "/saveOrders",method = RequestMethod.POST)
    public String saveNewOrder(@Valid Orders ord, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "add_order";
        }
        iOrderService.AddOrder(ord);
        return "redirect:";
    }

}
