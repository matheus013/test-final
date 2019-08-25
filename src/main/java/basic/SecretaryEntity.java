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
@Table(name = "secretary", schema = "public", catalog = "test-final")
public class SecretaryEntity {
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Basic
    @Column(name = "department")
    private Long department;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "level")
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
}
