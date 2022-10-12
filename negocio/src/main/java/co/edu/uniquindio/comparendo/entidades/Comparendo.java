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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date Fecha;

    private String hora;

    private String direccion;

    private String municipio;

    private String localidad;

    @Lob
    private String infraccion;

    private String fuente;

    private String radioAccion;

    private String observacionesAgente;

    private Boolean inmovilizacion;

    private Boolean intentoFuga;

    private Boolean comparendoPolca;

    private Boolean accidente;

    @ManyToOne
    private AgenteTransito agentetransito;
    @ManyToOne
    private Infractor infractor;

    @ManyToOne
    private Licencia licencia;

    @ManyToOne
    private Vehiculo vehiculo;

    @ManyToOne
    private Empresa empresa;

    @ManyToOne
    private Testigo testigo;
}
