import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        try {
        Utilidades.añadirDireccion("SDF");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        //Utilidades.stringToInt("abc");

        System.out.println("Introduce la ruta del archivo que quieres leer:");
        String ruta;

        boolean canBeRead = false;

        while (!canBeRead) {
            try {
                ruta = input.nextLine();
                Utilidades.leerArchivo(ruta);
                canBeRead = true;
            } catch (Exception fileNotFoundException) {
                System.err.println("Ruta no válida. Introduce una ruta válida: ");
            }
        }

    }
}
