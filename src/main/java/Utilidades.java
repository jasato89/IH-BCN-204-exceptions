import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Utilidades {

    public static int stringToInt(String number)  {
        try {
            return Integer.parseInt(number);
        } catch (Exception e) {
            throw new NumberFormatException("El contenido no se puede convertir a int");
        }
    }

    public static void leerArchivo(String ruta) throws FileNotFoundException {
        File file = new File(ruta);

        Scanner reader = new Scanner(file);

        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
    }

    public static void añadirDireccion(String direccion) {
        if (direccion.length()  > 2) {
            throw new IllegalArgumentException("La direccion no puede ser de más de 200 caracteres");
        }
        else {
            System.out.println(direccion);
        }
    }
}
