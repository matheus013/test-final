package basic;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "department", schema = "public", catalog = "test-final")
public class DepartmentEntity {
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "responsible")
    private Long responsible;

    public DepartmentEntity(String name, Long responsible) {
        this.name = name;
        this.responsible = responsible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentEntity that = (DepartmentEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(responsible, that.responsible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, responsible);
    }
}
