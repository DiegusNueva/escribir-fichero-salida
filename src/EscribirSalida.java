import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class EscribirSalida {

    public static void main(String[] args) {
        try (
                Scanner s = new Scanner(new File("entrada.txt"));
                FileWriter fw = new FileWriter("salida.txt")

        ) {
            List<Dato> leidos = LeerEntrada.leerDatos(s);
            for (Dato dato : leidos) {
                String linea = dato.getFechaNacimiento() + ";" + dato.getNombre() + ";" + dato.getSueldo() + "\n";
                fw.write(linea);
            }
            System.out.println("Ya está, mira el fichero de salida...");
        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
        }
    }
}
