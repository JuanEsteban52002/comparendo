package co.edu.uniquindio.comparendo.bean;

import co.edu.uniquindio.comparendo.servicios.ComparendoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import java.io.Serializable;

@Component
@ViewScoped
public class ComparendoBean implements Serializable {

    @Autowired
    private ComparendoServicio comparendoServicio;

    @PostConstruct
    public void inicializar(){

    }
}
