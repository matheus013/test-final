package basic;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Setter
@Getter
@RequiredArgsConstructor
@Entity
@Table(name = "student", schema = "public", catalog = "test-final")
public class StudentEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Basic
    @Column(name = "name", nullable = false)
    private String name;

    @Basic
    @Column(name = "registration", nullable = false)
    private String registration;

    @Basic
    @Column(name = "course", nullable = false)
    private Long course;

    @Basic
    @Column(name = "level", nullable = false)
    private Long level;

    public StudentEntity(String name, String registration, Long course, Long level, String code) {
        this.name = name;
        this.registration = registration;
        this.course = course;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(registration, that.registration) &&
                Objects.equals(course, that.course) &&
                Objects.equals(level, that.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, registration, level, course);
    }

    public boolean validation() {
        return  name != null && level != null && registration != null && course != null;
    }
}
