package co.edu.uniquindio.comparendo.entidades;

import lombok.*;

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
public class Testigo implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String numeroDocumento;

    private String nombreCompleto;

    private String direccion;

    private String telefono;

    @OneToMany(mappedBy = "testigo")
    private List<Comparendo> comparendos;
}
