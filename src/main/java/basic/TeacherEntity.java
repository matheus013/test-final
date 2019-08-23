package basic;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;


@Getter
@Setter
@Entity
@Table(name = "teacher", schema = "public", catalog = "test-final")
public class TeacherEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "department")
    private Long department;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherEntity that = (TeacherEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(department, that.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department);
    }
}
