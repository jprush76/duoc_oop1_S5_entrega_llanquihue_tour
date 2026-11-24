package cl.llanquihuetour.data;

import cl.llanquihuetour.model.Direccion;
import cl.llanquihuetour.model.Guia;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class GestorGuias {
    public List<Guia> cargarGuias(Path rutaArchivo) throws IOException {
        List<Guia> listaDeGuias = new ArrayList<>();
        List<String> filas = Files.readAllLines(rutaArchivo, StandardCharsets.UTF_8 );
        for (int i = 1; i< filas.size();i++) {
            String[] datos = filas.get(i).split(";", -1);
            try {
                if(datos.length != 10) throw new IllegalArgumentException("Cantidad de columnas no corresponde.");
                listaDeGuias.add(new Guia(datos[0].trim(), datos[1].trim(), datos[2].trim(), datos[3].trim(), new Direccion(datos[6].trim(), datos[7].trim(), datos[8].trim()), datos[4].trim(), datos[5].trim()));
            } catch (IllegalArgumentException error) {
                System.out.println("Fila " + (i + 1) + "ignorada: " + error.getMessage());
            }
        }
        return listaDeGuias;
    }
}
