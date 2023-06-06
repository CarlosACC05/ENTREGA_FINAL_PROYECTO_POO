
package proyecto_vehiculo.clases;


public class Administrador extends Usuario{
    private String id;

    public Administrador() {
        super();
        this.id = "";
    }

    public Administrador(String id, String usuario, String pass) {
        super(usuario, pass);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
}
