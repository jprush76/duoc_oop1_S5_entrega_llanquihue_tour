package cl.llanquihuetour.model;

import java.util.ArrayList;

/**
 * Clase que representa a un Guía de Turismo
 * Extiende de la clase Persona y agrega 'agencia' e 'idiomas'
 */
public class Guia extends Persona {
    private String agencia;
    private String idioma;

    public Guia(String rut, String nombre, String email, String telefono, Direccion direccion, String agencia, String idioma) {
        super(rut, nombre, email, telefono, direccion);
        this.agencia = agencia;
        this.idioma = idioma;
    }

    // GETTERS
    public String getAgencia() { return agencia; }
    public String getIdioma() { return idioma; }

    // SETTERS
    public void setAgencia(String agencia) { this.agencia = agencia; }
    public void setIdiomas(String idioma) { this.idioma = idioma; }


    @Override
    public String toString() {
        String resultado = "\nGuía\n" + "====\n" +
                "{ rut='" + this.getRut() + "', "  +
                "nombre='" + this.getNombre() + "', " +
                "email='" + this.getEmail() + "', " +
                "telefono='" + this.getTelefono() + "', " +
                "agencia='" + agencia + "', " +
                "idioma='" + idioma + "', " +
                "direccion='" + this.getDireccion() + "'}";
        return resultado;
    }

}
