package relationship;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "requirementsubject", schema = "public", catalog = "test-final")
public class RequirementSubjectRelationship {
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Basic
    @Column(name = "parent")
    private Long parent;

    @Basic
    @Column(name = "subject")
    private Long subject;

    public RequirementSubjectRelationship(Long parent, Long subject) {
        this.parent = parent;
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequirementSubjectRelationship that = (RequirementSubjectRelationship) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(parent, that.parent) &&
                Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parent, subject);
    }
}
