package co.edu.uniquindio.comparendo.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Comparendo implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(length = 15)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date Fecha;

    private String hora;

    private String direccion;

    private String municipio;

    private String localidad;

    private String fuente;

    private Boolean intentoFuga;

    private Boolean comparendoPolca;

    private Boolean accidente;

    @ManyToOne
    private Infractor infractor;

    @ManyToOne
    private Licencia licencia;

    @ManyToOne
    private Vehiculo vehiculo;
}
