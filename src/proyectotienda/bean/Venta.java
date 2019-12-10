package proyectotienda.bean;

import java.util.Date;

public class Venta {

    private int idClave;
    private Date fecha;
    private double total;

    public int getIdClave() {
        return idClave;
    }

    public void setIdClave(int idClave) {
        this.idClave = idClave;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
