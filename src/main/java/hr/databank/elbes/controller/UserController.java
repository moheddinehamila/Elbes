package hr.databank.elbes.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import hr.databank.elbes.services.IUserService;
import hr.databank.elbes.entities.*;

@Controller
@RequestMapping(value = "Users")
public class UserController {
	
	
	@Autowired
    private IUserService userService;
    @RequestMapping(value = "/")
    public String getAllUsers(Model model) {
        List<UserEntity> users = userService.getAll();
        model.addAttribute("users", users);
        return "users";
    }
    
    @RequestMapping(value = "/add")
    public String addUserForm(Model model) {
        model.addAttribute("users", new UserEntity());
        return "add_user";
    }
    @RequestMapping(value = "/saveusers",method = RequestMethod.POST)
    public String saveNewUser(@Valid UserEntity u, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "add_user";
        }
        userService.AddUser(u);
        return "redirect:";
    }
    @RequestMapping(value = "/supprimer")
    public String supprimer(int id){
        userService.DeleteUser(id);
        return "redirect:";
    }
    @RequestMapping("/edit")
    public String updateuser(int id,Model model)
    {
        UserEntity u=userService.findById(id);
        if (u!=null){
            model.addAttribute(u);
            return "add_produit";
        }
        else return "redirect:";
    }
}
