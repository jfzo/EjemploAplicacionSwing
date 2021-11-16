package tarealp.modelo;

public class Direccion {
    String calle;
    String comuna;
    Integer numero;
    String region;

    public Direccion(String calle, Integer numero, String comuna, String region){
        this.calle = calle;
        this.comuna = comuna;
        this.numero = numero;
        this.region = region;
    }

    public Direccion(Direccion objDireccion){
        this.calle = objDireccion.calle;
        this.comuna = objDireccion.comuna;
        this.numero = objDireccion.numero;
        this.region = objDireccion.region;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", comuna='" + comuna + '\'' +
                ", numero=" + numero +
                ", region='" + region + '\'' +
                '}';
    }
}
