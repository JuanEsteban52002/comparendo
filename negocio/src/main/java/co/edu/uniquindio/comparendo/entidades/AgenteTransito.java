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
public class AgenteTransito implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String numeroIdentificacion;

    private String nombre;

    private String entidad;

    @OneToMany(mappedBy = "agentetransito")
    private List<Comparendo> comparendos;
}
