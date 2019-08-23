package basic;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "student", schema = "public", catalog = "test-final")
public class StudentEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "registration")
    private String registration;

    @Basic
    @Column(name = "course")
    private Long course;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(registration, that.registration) &&
                Objects.equals(course, that.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, registration, course);
    }
}
