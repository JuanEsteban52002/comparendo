package co.edu.uniquindio.comparendo.servicios;

import co.edu.uniquindio.comparendo.entidades.Comparendo;
import co.edu.uniquindio.comparendo.repositorios.ComparendoRepo;

public class ComparendoServicioImpl implements ComparendoServicio{

    private ComparendoRepo comparendoRepo;

    public ComparendoServicioImpl(ComparendoRepo comparendoRepo) {
        this.comparendoRepo = comparendoRepo;
    }

    public Comparendo guardarComparendo(Comparendo comparendo) throws Exception {

        Comparendo comparendoBuscado = obtenerComparendo(comparendo.getId());

        if(comparendoBuscado != null) {
            throw new Exception("El comparendo ya existe");
        }

        return comparendoRepo.save(comparendo);
    }

    @Override
    public Comparendo obtenerComparendo(Integer id) throws Exception {
        return comparendoRepo.obtenerComparendo(id);
    }
}
