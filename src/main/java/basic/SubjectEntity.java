package basic;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "subject", schema = "public", catalog = "test-final")
public class SubjectEntity {
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "responsibleteacher")
    private Long responsibleTeacher;

    @Basic
    @Column(name = "course")
    private Long course;

    @Basic
    @Column(name = "workload")
    private Integer workload;

    @Basic
    @Column(name = "binding")
    private Boolean binding;

    @Basic
    @Column(name = "level")
    private Long level;

    @Basic
    @Column(name = "credit")
    private Long credit;

    @Basic
    @Column(name = "code")
    private String code;

    public SubjectEntity(String description, String name, Long responsibleTeacher, Long course, Integer workload, Boolean binding, Long level, Long credit) {
        this.description = description;
        this.name = name;
        this.responsibleTeacher = responsibleTeacher;
        this.course = course;
        this.workload = workload;
        this.binding = binding;
        this.level = level;
        this.credit = credit;
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectEntity that = (SubjectEntity) o;
        return id == that.id &&
                Objects.equals(description, that.description) &&
                Objects.equals(name, that.name) &&
                Objects.equals(responsibleTeacher, that.responsibleTeacher) &&
                Objects.equals(workload, that.workload) &&
                Objects.equals(binding, that.binding) &&
                Objects.equals(level, that.level) &&
                Objects.equals(credit, that.credit) &&
                Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, name, responsibleTeacher, workload, binding, level, credit, code);
    }
}
