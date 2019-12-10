package proyectotienda.controlador;

import proyectotienda.modelo.ModeloPantallaPrincipal;
import proyectotienda.vista.VistaPantallaPrincipal;

public class ControladorPantallaPrincipal {
  
    private VistaPantallaPrincipal vistaPantallaPrincipal;
    private ModeloPantallaPrincipal modeloPantallaPrincipal;

    public ControladorPantallaPrincipal() {
        this.vistaPantallaPrincipal = new VistaPantallaPrincipal();
        this.modeloPantallaPrincipal = new ModeloPantallaPrincipal();
    }
    
    
    
}
