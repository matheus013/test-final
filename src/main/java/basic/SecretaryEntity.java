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
@Table(name = "secretary", schema = "public", catalog = "test-final")
public class SecretaryEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Basic
    @Column(name = "department", nullable = false)
    private Long department;

    @Basic
    @Column(name = "name", nullable = false)
    private String name;

    @Basic
    @Column(name = "level", nullable = false)
    private Long level;


    public SecretaryEntity(Long department, String name, Long level) {
        this.department = department;
        this.name = name;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecretaryEntity that = (SecretaryEntity) o;
        return id == that.id &&
                Objects.equals(department, that.department) &&
                Objects.equals(name, that.name) &&
                Objects.equals(level, that.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, department, name, level);
    }

    public boolean validation() {
        return name != null && level != null && department != null;
    }
}
