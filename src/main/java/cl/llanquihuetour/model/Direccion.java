package cl.llanquihuetour.model;

/**
 * Clase que representa la dirección de una Persona
 * Contiene direccion, comuna y region
 */
public class Direccion {
    private String direccion;
    private String comuna;
    private String region;

    public Direccion(String direccion, String comuna, String region) {
        this.direccion = direccion;
        this.comuna = comuna;
        this.region = region;
    }

    // GETTERS
    public String getDireccion() { return direccion; }
    public String getComuna() { return comuna; }
    public String getRegion() { return region; }

    // SETTERS
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public void setComuna(String comuna) { this.comuna = comuna; }
    public void setRegion(String region) { this.region = region; }

    @Override
    public String toString() {
        return direccion + ", " + comuna + ", " + region;
    }
}
