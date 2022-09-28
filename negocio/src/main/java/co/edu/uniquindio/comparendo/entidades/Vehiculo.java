package co.edu.uniquindio.comparendo.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Vehiculo implements Serializable{

    @Id
    @EqualsAndHashCode.Include
    private String placa;

    private String lugarMatricula;

    private String tipoVehiculo;

    private String claseServicio;

    private String modalidadTransporte;

    private String nivelServicio;

    @ManyToOne
    private Propietario propietario;

    @OneToMany(mappedBy = "vehiculo")
    private List<Comparendo> comparendos;
}
