package hr.databank.elbes.controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hr.databank.elbes.services.IUserService;
import hr.databank.elbes.entities.*;

@RestController
@Transactional
@RequestMapping(value = "UserEntity")
public class UserController {

	@Autowired
	private IUserService userService;

	@GetMapping("users")
	public ResponseEntity<List<UserEntity>> getusers() {

		List<UserEntity> users = userService.getAll();
		return new ResponseEntity<List<UserEntity>>(users, HttpStatus.OK);

	}

	@GetMapping("user/{id}")
	public UserEntity getUser(@PathVariable("id") int id) {
		UserEntity user = userService.findById(id);
		return user;
	}

	 @RequestMapping(value = "user/delete", method = RequestMethod.DELETE)
	    public ResponseEntity<String> deleteUser(@RequestBody UserEntity u) {
	        boolean isDeleted = userService.DeleteUser(u);
	        if (isDeleted) {
	            String responseContent = "User has been deleted successfully";
	            return new ResponseEntity<String>(responseContent, HttpStatus.OK);
	        }
	        String error = "Error while deleting User from database";
	        return new ResponseEntity<String>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	    }


	@PutMapping("add")
	public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user) {
		UserEntity u = userService.AddUser(user);
	 
		return new ResponseEntity<UserEntity>(u, HttpStatus.OK);
	}
 
    @PutMapping("user/update")
    public ResponseEntity<UserEntity> updateArticle(@RequestBody UserEntity u) {

        UserEntity user = userService.UpdateUser(u);
        return new ResponseEntity<UserEntity>(user, HttpStatus.OK);
    }

 

}
