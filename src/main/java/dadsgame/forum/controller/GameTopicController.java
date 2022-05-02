package dadsgame.forum.controller;

import dadsgame.forum.entity.GameTopic;
import dadsgame.forum.service.GameTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gametopics")
public class GameTopicController {

    @Autowired
    GameTopicService gameTopicService;

    @GetMapping
    public List<GameTopic> getGameTopics() {
        return gameTopicService.getAllGameTopic();
    }

    @GetMapping("/{idGame}")
    public Optional<GameTopic> getGameTopicById(@PathVariable int idGame) { return gameTopicService.getGameTopicById(idGame); }
}
