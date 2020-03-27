package Models;

public class Ruta {

    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    private String codigo;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    private int idRol;

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdRol() {
        return idRol;
    }

    public Ruta(){

    }

    public Ruta(int id, String codigo, int idRol){
        this.id = id;
        this.codigo = codigo;
        this. idRol = idRol;
    }

}
