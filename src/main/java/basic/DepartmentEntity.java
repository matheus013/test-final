package basic;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

//import javax.persistence.*;

@Setter
@Getter
@RequiredArgsConstructor
@Entity
@Table(name = "department", schema = "public", catalog = "test-final")
public class DepartmentEntity implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Basic
    @Column(name = "name", nullable = false)
    private String name;

    @Basic
    @Column(name = "responsible", nullable = false)
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

    public boolean validation() {
        return  name != null && responsible != null;
    }
}
