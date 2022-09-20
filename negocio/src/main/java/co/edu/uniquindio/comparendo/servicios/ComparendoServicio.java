package co.edu.uniquindio.comparendo.servicios;

import co.edu.uniquindio.comparendo.entidades.Comparendo;

public interface ComparendoServicio {

    Comparendo guardarComparendo(Comparendo comparendo) throws Exception;

    Comparendo obtenerComparendo(Integer id) throws Exception;
}
