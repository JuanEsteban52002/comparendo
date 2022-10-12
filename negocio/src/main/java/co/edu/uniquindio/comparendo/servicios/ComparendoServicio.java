package co.edu.uniquindio.comparendo.servicios;

import co.edu.uniquindio.comparendo.entidades.*;

public interface ComparendoServicio {

    Testigo obtenerTestigo(String numeroDocumento);
    AgenteTransito obtenerAgenteTransito(String numeroIdentificacion);
    AgenteTransito crearAgenteTransito(AgenteTransito agenteTransito);
    Empresa obtenerEmpresa(String nit);
    Empresa crearEmpresa(Empresa empresa);
    Propietario obtenerPropietario(String numeroIdentificacion);
    Propietario crearPropietario(Propietario propietario);
    Licencia obtenerLicencia(String numero);
    Licencia crearLicencia(Licencia licencia);

    Infractor obtenerInfractor(String numeroDocumento);
    Infractor crearInfractor(Infractor infractor) throws Exception;

    Vehiculo crearVehiculo(Vehiculo vehiculo) throws Exception;

    Testigo crearTestigo(Testigo testigo) throws Exception;

    Vehiculo obtenerVehiculo(String placa) throws Exception;

    Comparendo crearComparendo(Comparendo comparendo) throws Exception;

    Comparendo obtenerComparendo(Integer id) throws Exception;
}
