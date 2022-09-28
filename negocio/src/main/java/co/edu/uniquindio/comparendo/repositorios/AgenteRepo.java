package co.edu.uniquindio.comparendo.repositorios;

import co.edu.uniquindio.comparendo.entidades.AgenteTransito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenteRepo extends JpaRepository<AgenteTransito, String> {


}
