package cl.llanquihuetour.app;

import cl.llanquihuetour.data.GestorGuias;
import cl.llanquihuetour.data.GestorTours;
import cl.llanquihuetour.service.GuiaService;
import cl.llanquihuetour.service.TourService;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        GuiaService guiaService = new GuiaService();
        TourService tourService = new TourService();
        // Guias
        try {
            guiaService.agregarTodosGuias(new GestorGuias().cargarGuias(Path.of("src/main/resources", "guias.txt")));
            System.out.println("\n-----Lista de Guias-----");
            for(var guia : guiaService.getListarTodosGuias()) {
                System.out.println(guia);
            }
            System.out.println("\n-----Búsqueda de Guia por Rut-----");
            System.out.println(guiaService.getGuiaPorRut("33333333-3"));
            System.out.println("\n-----Búsqueda de Guias por Agencia 'Turistik'-----");
            for(var guia : guiaService.getGuiasPorAgencia("turistik")) {
                System.out.println(guia);
            }
        } catch (Exception e) {
            System.out.println("ERROR: No se pudieron cargar los guias. " + e.getMessage());
        }

        // Tours
        try {
            tourService.agregarTodosLosTours(new GestorTours().cargarTours(Path.of("src/main/resources", "tours.txt")));
            System.out.println("\n-----Lista de Tours disponibles-----");
            for(var tour : tourService.getListarTodosLosTours()) {
                System.out.println(tour);
            }
            System.out.println("\n-----Lista de Tours baratos por menos de $40.000-----");
            for(var tour : tourService.getToursBaratos(40000)) {
                System.out.println(tour);
            }
        } catch (Exception e) {
            System.out.println("ERROR: No se pudieron cargar los tours. " + e.getMessage());
        }
    }
}
