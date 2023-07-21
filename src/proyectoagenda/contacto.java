package proyectoagenda;

public class contacto {

   private String nombre, domicilio, numeroTel;

    public contacto(String nombre, String domicilio, String numeroTel) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.numeroTel = numeroTel;
    }

    public String verNombre() {
        return this.nombre;
    }

    public String verDomicilio() {
        return this.domicilio;
    }

    public String verNumeroTel() {
        return this.numeroTel;
    }

}
