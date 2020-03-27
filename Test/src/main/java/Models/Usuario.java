package Models;

enum Nombres
{
    Ruben, Daniel, Fernando
}

enum Apellidos
{
    Hernandez, Lopez, Perez
}

public class Usuario {

    private int id;

    private void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    private String nombre;

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    private String apellidos;

    private void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    private int rolId;

    private void setRolId(int rolId) {
        this.rolId = rolId;
    }

    private int getRolId() {
        return rolId;
    }

    public Rol getRol(){
        return new Rol(this.rolId + 1, String.valueOf(DescripcionRol.values()[this.rolId]));
    }

    public Usuario(int id){
        this.id = id;
        this.nombre = String.valueOf(Nombres.values()[id - 1]);
        this.apellidos = String.valueOf(Apellidos.values()[id - 1]);
        if(DescripcionRol.values().length == id){
            this.rolId = 0;
        }else {
            this.rolId = id;
        }
    }
}
