package co.edu.uniquindio.comparendo.repositorios;

import co.edu.uniquindio.comparendo.entidades.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropietarioRepo extends JpaRepository<Propietario, String> {

}
