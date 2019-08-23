package basic;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "course", schema = "public", catalog = "test-final")
public class CourseEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "level")
    private Long level;

    @ElementCollection
    @Column(name = "subjects")
    private List<Long> subjectList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseEntity that = (CourseEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(level, that.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level, subjectList);
    }
}
