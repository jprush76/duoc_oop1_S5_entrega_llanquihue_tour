package cl.llanquihuetour.model;

/**
 * Clase que estructura los Tours
 * Contiene nombre, duración del tour y precio.
 */
public class Tour {
    private String nombre;
    private String duracion;
    private int precio;

    public Tour(String nombre, String duracion, int precio) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
    }

    // GETTERS
    public String getNombre() { return nombre; }
    public String getDuracion() { return duracion; }
    public int getPrecio() { return precio; }

    // SETTERS
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDuracion(String duracion) { this.duracion = duracion; }
    public void setPrecio(int precio) { this.precio = precio; }

    @Override
    public String toString() {
        return "Tour{" +
                "nombre='" + nombre + '\'' +
                ", duracion='" + duracion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
