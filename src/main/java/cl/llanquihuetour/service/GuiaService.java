package cl.llanquihuetour.service;

import cl.llanquihuetour.model.Guia;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa el Servicio de la clase Guia
 * Expone las funcionalidades de la data Guia.
 */
public class GuiaService {
    private final List<Guia> guias = new ArrayList<>();

    public void agregarTodosGuias(List<Guia> nuevos) {
        guias.addAll(nuevos);
    }

    public List<Guia> getListarTodosGuias() {
        return new ArrayList<>(guias);
    }

    public Guia getGuiaPorRut(String rut) {
        for (Guia guia : guias) {
            if (guia.getRut().equalsIgnoreCase(rut)) {
                return guia;
            }
        }
        return null;
    }

    public List<Guia> getGuiasPorAgencia(String agencia) {
        List<Guia> resultado = new ArrayList<>();
        for (Guia guia : guias) {
            if (guia.getAgencia().equalsIgnoreCase(agencia)) {
                resultado.add(guia);
            }
        }
        return resultado;
    }
}
