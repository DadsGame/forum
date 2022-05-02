package dadsgame.forum.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "post")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column
    private String author;

    @Column
    private String title;

    @Column
    private String content;

    @OneToMany(mappedBy = "postComment")
    private List<Comment> comments;

    @Column(name = "id_gametopic")
    private int gameTopic;
}
