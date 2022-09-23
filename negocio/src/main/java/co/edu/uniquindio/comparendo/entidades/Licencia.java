package co.edu.uniquindio.comparendo.entidades;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Licencia implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(length = 15)
    private String numero;

    private String organizacionTransito;

    @OneToMany(mappedBy = "licencia")
    private List<Comparendo> comparendos;
}
