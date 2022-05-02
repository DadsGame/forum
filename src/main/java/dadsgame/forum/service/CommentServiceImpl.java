package dadsgame.forum.service;

import dadsgame.forum.entity.Comment;
import dadsgame.forum.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepository commentRepository;


    @Override
    public List<Comment> getAllComment() {
        return commentRepository.findAll();
    }
}
