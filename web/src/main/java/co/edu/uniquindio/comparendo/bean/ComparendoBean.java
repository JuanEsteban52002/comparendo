package co.edu.uniquindio.comparendo.bean;

import co.edu.uniquindio.comparendo.entidades.*;
import co.edu.uniquindio.comparendo.servicios.ComparendoServicio;
import co.edu.uniquindio.comparendo.servicios.ComparendoServicioImpl;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import java.io.Serializable;

@Component
@ViewScoped
public class ComparendoBean implements Serializable {

    @Autowired
    private ComparendoServicio comparendoServicio;
    @Getter @Setter
    private Comparendo comparendo;
    @Getter @Setter
    private Vehiculo vehiculo;
    @Getter @Setter
    private Licencia licencia;
    @Getter @Setter
    private Infractor infractor;
    @Getter @Setter
    private AgenteTransito agenteTransito;
    @Getter @Setter
    private Empresa empresa;
    @Getter @Setter
    private Propietario propietario;

    @Getter @Setter
    private Testigo testigo;

    @PostConstruct
    public void inicializar(){
        comparendo = new Comparendo();
        licencia = new Licencia();
        infractor = new Infractor();
        vehiculo = new Vehiculo();
        agenteTransito = new AgenteTransito();
        empresa = new Empresa();
        propietario = new Propietario();
        testigo = new Testigo();
    }

    public String guardarComparendo() {
        try {

            empresa = comparendoServicio.crearEmpresa(empresa);
            infractor = comparendoServicio.crearInfractor(infractor);

            agenteTransito = comparendoServicio.crearAgenteTransito(agenteTransito);
            testigo = comparendoServicio.crearTestigo(testigo);
            licencia = comparendoServicio.crearLicencia(licencia);
            propietario = comparendoServicio.crearPropietario(propietario);
            vehiculo.setPropietario(propietario);
            vehiculo = comparendoServicio.crearVehiculo(vehiculo);
            comparendo.setLicencia(licencia);
            comparendo.setVehiculo(vehiculo);

            comparendo.setTestigo(testigo);
            comparendo.setAgentetransito(agenteTransito);
            comparendo.setEmpresa(empresa);
            comparendo.setInfractor(infractor);

            comparendoServicio.crearComparendo(comparendo);

            FacesMessage msj = new FacesMessage(FacesMessage.SEVERITY_INFO, "Completado", "Registro exitoso");
            FacesContext.getCurrentInstance().addMessage("msj_bean", msj);

        } catch (Exception e) {
            FacesMessage msj = new FacesMessage(FacesMessage.SEVERITY_FATAL, "ERROR", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("msj_bean", msj);

        }
        return null;
    }

    public void imprimirMensajes(){
        System.out.println("COMPARENDO: "+comparendo);
        System.out.println("LICENCIA: "+licencia);
        System.out.println("INFRACTOR: "+infractor);
        System.out.println("VEHICULO: "+vehiculo);
        System.out.println("AGENTE: "+agenteTransito);
        System.out.println("EMPRESA: "+empresa);
        System.out.println("PROPIETARIO: "+propietario);
    }
}
