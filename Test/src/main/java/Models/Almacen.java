package Models;

public class Almacen {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    private String nombreAlmacen;

    public void setNombreAlmacen(String nombreAlmacen) {
        this.nombreAlmacen = nombreAlmacen;
    }

    public String getNombreAlmacen() {
        return nombreAlmacen;
    }

    private int prioridad;

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    private int idRuta;

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public int getIdRuta() {
        return idRuta;
    }

}
