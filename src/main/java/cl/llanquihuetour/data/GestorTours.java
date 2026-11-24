package cl.llanquihuetour.data;

import cl.llanquihuetour.model.Tour;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class GestorTours {
    public List<Tour> cargarTours(Path rutaArchivo) throws IOException {
        List<Tour> listaDeTours = new ArrayList<>();
        List<String> filas = Files.readAllLines(rutaArchivo, StandardCharsets.UTF_8);
        for (int i = 1; i < filas.size(); i++) {
            String[] datos = filas.get(i).split(";", -1);
            try {
                if(datos.length != 3) throw new IllegalArgumentException("Cantidad de columnas no corresponde.");
                listaDeTours.add(new Tour(datos[0].trim(), datos[1].trim(), Integer.parseInt(datos[2].trim()) ));
            } catch (IllegalArgumentException error) {
                System.out.println("\nFila " + (i + 1) + " de tours ignorada: " + error.getMessage());
            }
        }
        return listaDeTours;
    }
}
