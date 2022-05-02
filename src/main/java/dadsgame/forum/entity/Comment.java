package dadsgame.forum.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name="comment")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String author;

    @Column
    private String content;

    @JsonIgnore
    @Column(name = "id_post")
    private int postComment;

}
