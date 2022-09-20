package co.edu.uniquindio.comparendo.entidades;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
}
