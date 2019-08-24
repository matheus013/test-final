package relationship;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;


@Getter
@Setter
@Entity
@Table(name = "requirementsubject", schema = "public", catalog = "test-final")
public class RequirementSubjectRelationship {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "parent")
    private Long parent;

    @Basic
    @Column(name = "subject")
    private Long subject;


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
