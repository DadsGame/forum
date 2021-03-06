package dadsgame.forum.service;

import dadsgame.forum.entity.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    public List<Post> getAllPost();

    public List<Post> getPostsByGameTopic(int gameTopic);

    public List<Post> getAuthorPosts(String author);

    Post save(Post post);

    Optional<Post> findById(int postId);

    void deleteById(int postId);
}
