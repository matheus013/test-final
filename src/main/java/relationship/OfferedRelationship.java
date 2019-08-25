package relationship;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

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

    public OfferedRelationship(Long course, Long subject) {
        this.course = course;
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfferedRelationship that = (OfferedRelationship) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(course, that.course) &&
                Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, course, subject);
    }
}
