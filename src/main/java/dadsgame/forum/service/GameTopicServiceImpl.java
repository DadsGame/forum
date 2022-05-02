package dadsgame.forum.service;

import dadsgame.forum.entity.GameTopic;
import dadsgame.forum.repository.GameTopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameTopicServiceImpl implements GameTopicService {

    @Autowired
    GameTopicRepository gameTopicRepository;

    @Override
    public List<GameTopic> getAllGameTopic() {
        return gameTopicRepository.findAll();
    }

    @Override
    public Optional<GameTopic> getGameTopicById(int idGame) {
        return gameTopicRepository.findById(idGame);
    }
}
