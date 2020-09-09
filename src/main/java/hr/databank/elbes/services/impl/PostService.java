package hr.databank.elbes.services.impl;

import hr.databank.elbes.dao.IPostDAO;
import hr.databank.elbes.entities.Post;
import hr.databank.elbes.services.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class PostService implements IPostService {
    @Autowired
    private IPostDAO dao;

    @Override
    public List<Post> getPosts() {
        return dao.getPosts();
    }

    @Override
    public Post createPost (Post post) {
        return dao.createPost(post);
    }

    @Override
    public Post getPost(int idPost) {
        return dao.getPost(idPost);
    }

    @Override
    public Post updatePost(Post post) {
        return dao.updatePost(post);
    }

    @Override
    public boolean deletePost(int idPost) {
        return dao.deletePost(idPost);
    }
}
