package co.edu.uniquindio.comparendo.repositorios;

import co.edu.uniquindio.comparendo.entidades.Testigo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestigoRepo extends JpaRepository<Testigo, String> {
}
