package co.edu.uniquindio.comparendo.entidades;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

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
    private Integer numero;

    private String organizacionTransito;
}
