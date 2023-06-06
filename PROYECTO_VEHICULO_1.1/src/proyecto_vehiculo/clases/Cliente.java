
package proyecto_vehiculo.clases;


public class Cliente extends Usuario {
    private String nombre;

    public Cliente() {
        super("","");
        this.nombre = "";
    }

    public Cliente(String nombre, String usuario, String pass) {
        super(usuario, pass);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
