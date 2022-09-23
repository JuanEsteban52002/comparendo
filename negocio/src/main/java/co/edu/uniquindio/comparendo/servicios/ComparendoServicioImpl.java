package co.edu.uniquindio.comparendo.servicios;

import co.edu.uniquindio.comparendo.entidades.Comparendo;
import co.edu.uniquindio.comparendo.entidades.Infractor;
import co.edu.uniquindio.comparendo.entidades.Licencia;
import co.edu.uniquindio.comparendo.entidades.Vehiculo;
import co.edu.uniquindio.comparendo.repositorios.ComparendoRepo;
import co.edu.uniquindio.comparendo.repositorios.InfractorRepo;
import co.edu.uniquindio.comparendo.repositorios.LicenciaRepo;
import co.edu.uniquindio.comparendo.repositorios.VehiculoRepo;

public class ComparendoServicioImpl implements ComparendoServicio{

    private ComparendoRepo comparendoRepo;
    private InfractorRepo infractorRepo;
    private LicenciaRepo licenciaRepo;
    private VehiculoRepo vehiculoRepo;

    public ComparendoServicioImpl(ComparendoRepo comparendoRepo, InfractorRepo infractorRepo, LicenciaRepo licenciaRepo, VehiculoRepo vehiculoRepo) {
        this.comparendoRepo = comparendoRepo;
        this.infractorRepo = infractorRepo;
        this.licenciaRepo = licenciaRepo;
        this.vehiculoRepo = vehiculoRepo;
    }

    @Override
    public Licencia crearLicencia(Licencia licencia) {

        Licencia licenciaEncontrada = obtenerLicencia(licencia.getNumero());

        if(licenciaEncontrada != null){
            return licenciaEncontrada;
        }

        return licenciaRepo.save(licencia);
    }

    @Override
    public Infractor crearInfractor(Infractor infractor) throws Exception {

        Infractor infractorEncontrado = obtenerInfractor(infractor.getNumeroDocumento());

        if(infractorEncontrado != null){
            return infractorEncontrado;
        }

        return infractorRepo.save(infractor);
    }

    @Override
    public Vehiculo crearVehiculo(Vehiculo vehiculo) throws Exception {

        Vehiculo vehiculoBuscado = obtenerVehiculo(vehiculo.getPlaca());

        if(vehiculoBuscado != null){
            return vehiculoBuscado;
        }

        return vehiculoRepo.save(vehiculo);
    }

    public Comparendo crearComparendo(Comparendo comparendo) throws Exception {

        Comparendo comparendoBuscado = obtenerComparendo(comparendo.getId());

        if(comparendoBuscado != null) {
            throw new Exception("El comparendo ya existe");
        }

        return comparendoRepo.save(comparendo);
    }

    @Override
    public Infractor obtenerInfractor(String numeroDocumento) {
        return infractorRepo.findById(numeroDocumento).orElse(null);
    }
    @Override
    public Vehiculo obtenerVehiculo(String placa) throws Exception {
        return vehiculoRepo.findById(placa).orElse(null);
    }
    @Override
    public Comparendo obtenerComparendo(Integer id) throws Exception {
        return comparendoRepo.findById(id).orElse(null);
    }

    @Override
    public Licencia obtenerLicencia(String numero) {
        return licenciaRepo.findById(numero).orElse(null);
    }
}
