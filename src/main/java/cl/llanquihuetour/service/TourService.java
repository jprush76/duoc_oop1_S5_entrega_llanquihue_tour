package cl.llanquihuetour.service;

import cl.llanquihuetour.model.Tour;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa el Servicio de la clase Tour
 * Expone las funcionalidades de la data Tour.
 */
public class TourService {
    private final List<Tour> tours = new ArrayList<>();

    public void agregarTodosLosTours(List<Tour> nuevos) {
        tours.addAll(nuevos);
    }

    public List<Tour> getListarTodosLosTours() {
        return new ArrayList<>(tours);
    }

    public List<Tour> getToursBaratos(int precio) {
        List<Tour> resultado = new ArrayList<>();
        for (Tour tour : tours) {
            if (tour.getPrecio() <= precio) {
                resultado.add(tour);
            }
        }
        return resultado;
    }
}
