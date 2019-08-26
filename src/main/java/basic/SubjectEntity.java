package basic;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;


@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "subject", schema = "public", catalog = "test-final")
public class SubjectEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Basic
    @Column(name = "description", nullable = false)
    private String description;

    @Basic
    @Column(name = "name", nullable = false)
    private String name;

    @Basic
    @Column(name = "responsibleteacher", nullable = false)
    private Long responsibleTeacher;

    @Basic
    @Column(name = "course", nullable = false)
    private Long course;

    @Basic
    @Column(name = "workload", nullable = false)
    private Integer workload;

    @Basic
    @Column(name = "binding", nullable = false)
    private Boolean binding;

    @Basic
    @Column(name = "level", nullable = false)
    private Long level;

    @Basic
    @Column(name = "credit", nullable = false)
    private Long credit;

    @Basic
    @Column(name = "code", nullable = false)
    private String code;

    public SubjectEntity(String description, String name, Long responsibleTeacher, Long course, Integer workload, Boolean binding, Long level, Long credit, String code) {
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
        return Objects.equals(id, that.id) &&
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

    public boolean isNull() {
        return responsibleTeacher == null || course == null || workload == null || level == null || credit == null;
    }

    public boolean validation() {
        return name != null && level != null && code != null && course != null && description != null &&
                responsibleTeacher != null && workload != null && binding != null;
    }
}
