package co.edu.uniquindio.comparendo.bean;

import co.edu.uniquindio.comparendo.entidades.Comparendo;
import co.edu.uniquindio.comparendo.entidades.Infractor;
import co.edu.uniquindio.comparendo.entidades.Licencia;
import co.edu.uniquindio.comparendo.entidades.Vehiculo;
import co.edu.uniquindio.comparendo.servicios.ComparendoServicio;
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

    @Getter
    @Setter
    private Comparendo comparendo;

    @Getter
    @Setter
    private Vehiculo vehiculo;

    @Getter
    @Setter
    private Licencia licencia;

    @Getter
    @Setter
    private Infractor infractor;
    private ComparendoServicio comparendoServicio;

    @PostConstruct
    public void inicializar() throws Exception {
        comparendo = new Comparendo();
        licencia = new Licencia();
        infractor = new Infractor();
        vehiculo = new Vehiculo();
    }

    public String guardarComparendo() {
        try {


            licencia = comparendoServicio.crearLicencia(licencia);
            infractor = comparendoServicio.crearInfractor(infractor);
            vehiculo = comparendoServicio.crearVehiculo(vehiculo);

            comparendo.setInfractor(infractor);
            comparendo.setLicencia(licencia);
            comparendo.setVehiculo(vehiculo);

            comparendoServicio.crearComparendo(comparendo);


        } catch (Exception e) {
            FacesMessage msj = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("msj_bean", msj);

        }
        return null;
    }
}
