package co.edu.uniquindio.comparendo.repositorios;

import co.edu.uniquindio.comparendo.entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepo extends JpaRepository<Empresa, String> {


}
