package hr.databank.elbes.dao.impl;

import hr.databank.elbes.dao.IPostDAO;

import hr.databank.elbes.entities.Post;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository

public class PostDAOImpl implements IPostDAO {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Post> getPosts() {
        String hql = "select p from Post p ORDER BY p.idPost";
        return (List<Post>) entityManager.createQuery(hql).getResultList();


    }
    @Override
    public Post createPost(Post post) {
        entityManager.persist(post);
        return post;
    }

    @Override
    public Post getPost(int idPost) {
        return entityManager.find(Post.class, idPost);
    }



    @Override
    public Post updatePost(Post post) {

        entityManager.merge(post);
        return post;
    }

    @Override
    public boolean deletePost(int idPost) {

        Post post = getPost(idPost);
        entityManager.remove(post);
        return !(entityManager.contains(post));
    }
}
