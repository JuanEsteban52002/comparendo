package co.edu.uniquindio.comparendo.bean;

import co.edu.uniquindio.comparendo.entidades.Comparendo;
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

    @Getter @Setter
    private Comparendo comparendo;


    private ComparendoServicio comparendoServicio;

    @PostConstruct
    public void inicializar() throws Exception {
        comparendo = new Comparendo();

    }

    public String guardarComparendo(){
        try{

            comparendoServicio.guardarComparendo(comparendo);

        }catch(Exception e){
            FacesMessage msj = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("msj_bean", msj);
            System.out.println("ERROR: " + e.getMessage());
        }
        return null;
    }
}
