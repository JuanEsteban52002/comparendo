package co.edu.uniquindio.comparendo.servicios;

import co.edu.uniquindio.comparendo.entidades.Comparendo;
import co.edu.uniquindio.comparendo.entidades.Infractor;
import co.edu.uniquindio.comparendo.entidades.Licencia;
import co.edu.uniquindio.comparendo.entidades.Vehiculo;

public interface ComparendoServicio {

    Licencia obtenerLicencia(String numero);
    Licencia crearLicencia(Licencia licencia);

    Infractor obtenerInfractor(String numeroDocumento);
    Infractor crearInfractor(Infractor infractor) throws Exception;

    Vehiculo crearVehiculo(Vehiculo vehiculo) throws Exception;

    Vehiculo obtenerVehiculo(String placa) throws Exception;

    Comparendo crearComparendo(Comparendo comparendo) throws Exception;

    Comparendo obtenerComparendo(Integer id) throws Exception;
}
