package Models;

enum DescripcionRol
{
    Administrador, Proveedor, Revisor;
}

public class Rol {
    private int id;

    private void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    private String descripcion;

    private void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public Rol(int id, String descripcion){
        this.id = id;
        this.descripcion = descripcion;
    }

}
