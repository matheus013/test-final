package relationship;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;


@Getter
@Setter
@Entity
@Table(name = "requirementcredit", schema = "public", catalog = "test-final")
public class RequirementCreditRelationship {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "credit")
    private Long credit;

    @Basic
    @Column(name = "subject")
    private Long subject;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequirementCreditRelationship that = (RequirementCreditRelationship) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(credit, that.credit) &&
                Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, credit, subject);
    }
}
