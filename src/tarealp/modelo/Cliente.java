package tarealp.modelo;

public class Cliente {
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getRut() {
        return rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    // atributos.
    String nombres;
    String apellidos;
    String rut;
    public Direccion direccion;

    public Cliente(String nombres, String apellidos, String rut, Direccion direccion){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rut = rut;
        this.direccion = new Direccion(direccion);
    }

    public Cliente(Cliente c){
        this.rut = c.rut;
        this.nombres = c.nombres;
        this.apellidos = c.apellidos;
        this.direccion = new Direccion(c.direccion);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", rut='" + rut + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}
