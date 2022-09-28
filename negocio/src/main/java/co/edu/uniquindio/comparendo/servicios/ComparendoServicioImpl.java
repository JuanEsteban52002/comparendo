package co.edu.uniquindio.comparendo.servicios;

import co.edu.uniquindio.comparendo.entidades.*;
import co.edu.uniquindio.comparendo.repositorios.*;
import org.springframework.stereotype.Service;


@Service
public class ComparendoServicioImpl implements ComparendoServicio{

    private PropietarioRepo propietarioRepo;
    private EmpresaRepo empresaRepo;
    private AgenteRepo agenteRepo;
    private ComparendoRepo comparendoRepo;
    private InfractorRepo infractorRepo;
    private LicenciaRepo licenciaRepo;
    private VehiculoRepo vehiculoRepo;

    public ComparendoServicioImpl(ComparendoRepo comparendoRepo,
                                  InfractorRepo infractorRepo,
                                  LicenciaRepo licenciaRepo,
                                  VehiculoRepo vehiculoRepo,
                                  AgenteRepo agenteRepo,
                                  PropietarioRepo propietarioRepo,
                                  EmpresaRepo empresaRepo) {
        this.comparendoRepo = comparendoRepo;
        this.infractorRepo = infractorRepo;
        this.licenciaRepo = licenciaRepo;
        this.vehiculoRepo = vehiculoRepo;
        this.agenteRepo = agenteRepo;
        this.propietarioRepo = propietarioRepo;
        this.empresaRepo = empresaRepo;
    }

    public Comparendo crearComparendo(Comparendo comparendo) throws Exception {

        Comparendo comparendoBuscado = obtenerComparendo(comparendo.getId());

        if(comparendoBuscado != null) {
            throw new Exception("El comparendo ya existe");
        }

        return comparendoRepo.save(comparendo);
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

    @Override
    public Propietario crearPropietario(Propietario propietario) {

        Propietario propietarioBuscado = obtenerPropietario(propietario.getNumeroDocumento());

        if(propietarioBuscado != null){
            return propietarioBuscado;
        }
        return propietarioRepo.save(propietario);
    }

    @Override
    public AgenteTransito crearAgenteTransito(AgenteTransito agenteTransito) {

        AgenteTransito agenteTransitoBuscado = obtenerAgenteTransito(agenteTransito.getNumeroIdentificacion());

        if(agenteTransitoBuscado != null){
            return agenteTransitoBuscado;
        }
        return agenteRepo.save(agenteTransito);
    }

    @Override
    public Empresa crearEmpresa(Empresa empresa) {

        Empresa empresaBuscada = obtenerEmpresa(empresa.getNit());

        if(empresaBuscada != null){
            return empresaBuscada;
        }
        return empresaRepo.save(empresa);
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
    public AgenteTransito obtenerAgenteTransito(String numeroIdentificacion) {
        return agenteRepo.findById(numeroIdentificacion).orElse(null);
    }

    @Override
    public Empresa obtenerEmpresa(String nit) {
        return empresaRepo.findById(nit).orElse(null);
    }

    @Override
    public Propietario obtenerPropietario(String numeroIdentificacion) {
        return propietarioRepo.findById(numeroIdentificacion).orElse(null);
    }


    @Override
    public Licencia obtenerLicencia(String numero) {
        return licenciaRepo.findById(numero).orElse(null);
    }
}
