package relationship;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "offered", schema = "public", catalog = "test-final")
public class OfferedRelationship {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "course")
    private Long course;

    @Basic
    @Column(name = "subject")
    private Long subject;
}
