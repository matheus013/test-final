package relationship;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "matriculate", schema = "public", catalog = "test-final")
@NoArgsConstructor
public class MatriculateRelationship {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "parent")
    private Long student;

    @Basic
    @Column(name = "subject")
    private Long subject;

    public MatriculateRelationship(Long student, Long subject) {
        this.student = student;
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatriculateRelationship that = (MatriculateRelationship) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(student, that.student) &&
                Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, student, subject);
    }
}
