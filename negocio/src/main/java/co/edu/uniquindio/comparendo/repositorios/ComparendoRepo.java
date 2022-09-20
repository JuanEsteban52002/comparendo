package co.edu.uniquindio.comparendo.repositorios;

import co.edu.uniquindio.comparendo.entidades.Comparendo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ComparendoRepo extends JpaRepository<Comparendo, Integer> {

    @Query("select c from Comparendo c where c.id = :id")
    Comparendo obtenerComparendo(Integer id);
}
