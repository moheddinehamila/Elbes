package hr.databank.elbes.controller;


import hr.databank.elbes.entities.Post;
import hr.databank.elbes.services.IPostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("post")
public class PostController {
    @Autowired
    private IPostService service;


    @GetMapping("all")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<Post>> getPosts() {

        List<Post> posts = service.getPosts();
        return new ResponseEntity<List<Post>>(posts, HttpStatus.OK);
    }


    @PutMapping("add/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Post> createPost(@RequestBody Post post, @PathVariable("id") int id) {

        Post p = service.createPost(post);

       // p.setUser(p.getUser());
        return new ResponseEntity<Post>(p, HttpStatus.OK);

    }

    @GetMapping("{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Post getPost(@PathVariable("id") int id) {

        Post post = service.getPost(id);
        return post ;

    }

    @PutMapping("update")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Post> updatePost(@RequestBody Post post) {

        Post a = service.updatePost(post);
        return new ResponseEntity<Post>(a, HttpStatus.OK);
    }


    @DeleteMapping("delete/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<String> deletePost(@PathVariable int id) {
        boolean isDeleted = service.deletePost(id);
        if (isDeleted) {
            String responseContent = "Post has been deleted successfully";
            return new ResponseEntity<String>(responseContent, HttpStatus.OK);
        }
        String error = "Error while deleting post  from database";
        return new ResponseEntity<String>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("like/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public int  getNumLike(@PathVariable int id) {
        Post post = getPost(id);
        return service.getNumLike(post);
    }
    @GetMapping("dislike/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public int  getdisNumLike(@PathVariable int id) {
        Post post = getPost(id);
        return service.getNumDislike(post);
    }

}
