package hr.databank.elbes.controller;

import hr.databank.elbes.entities.Orders;
import hr.databank.elbes.services.IOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
    IOrderService iOrderService;



    @RequestMapping(value = "/add")
    public String addProductForm(Model model) {
        model.addAttribute("order", new Orders());
        return "AddOrder";
    }



}
