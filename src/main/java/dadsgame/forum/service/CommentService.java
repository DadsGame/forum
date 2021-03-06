package dadsgame.forum.service;

import dadsgame.forum.entity.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    public List<Comment> getAllComment();

    Comment save(Comment comment);

    Optional<Comment> findById(int commentId);

    void deleteById(int commentId);
}
