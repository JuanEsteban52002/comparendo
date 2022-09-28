package co.edu.uniquindio.comparendo.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
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
    private String numero;

    private String organizacionTransito;

    private Date expedicion;

    private Date vencimiento;

    @ManyToOne
    private Infractor infractor;

    @OneToMany(mappedBy = "licencia")
    private List<Comparendo> comparendos;


}
