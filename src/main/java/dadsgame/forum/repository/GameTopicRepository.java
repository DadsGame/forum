package dadsgame.forum.repository;

import dadsgame.forum.entity.GameTopic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameTopicRepository extends JpaRepository<GameTopic, Integer> {
}
