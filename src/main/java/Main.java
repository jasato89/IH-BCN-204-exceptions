import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Account account =
                new Account("Nil", "Barcelona", 2000.0, "SAVINGS-0011");

        String a = "Jaume";
        String b = "jaume";
        String c = "jaume";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());





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

        System.out.println(concat("Jaume", "Sánchez"));
        Scanner input2 = new Scanner(System.in);
        String firstname = "Jaume";
        String lastName = input2.nextLine();
        String fullName = null;

        try {
         fullName = concat(firstname, lastName);
        } catch (TextTooLongException e) {
            e.printStackTrace();
        }

        System.out.println(fullName);



        System.out.println(Integer.MAX_VALUE);
        System.out.println(Utilidades.multiply(2000000, 3000000));



    }

    public static String concat(String firstname, String lastName) {
        if (firstname == null || firstname.isEmpty() || lastName == null || lastName.isEmpty()) {

            throw new TextTooLongException("Mucho texto");
        }
        return firstname.concat(" ").concat(lastName);
    }
}
