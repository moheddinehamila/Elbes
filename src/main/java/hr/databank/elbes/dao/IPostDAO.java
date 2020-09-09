package hr.databank.elbes.dao;


import hr.databank.elbes.entities.Post;


import java.util.List;


public interface IPostDAO {
    List<Post> getPosts ();



    Post createPost(Post post);
    Post getPost(int idPost);

    Post updatePost(Post post);

    boolean deletePost(int idPost);
    int getNumLike (Post post );
    int  getNumDislike (Post post);



}
