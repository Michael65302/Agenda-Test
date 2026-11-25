import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Escribe el numero de lo que desees realizar:");
            System.out.println("1) Añadir contacto");
            System.out.println("2) Mostrar contactos");
            System.out.println("3) Buscar contacto");
            System.out.println("4) Salir");

            String opcion = sc.nextLine();

            if (opcion.equals("1")) {
                System.out.println("Añadir contacto:");
            } else if (opcion.equals("2")) {
                System.out.println("Mostrar contactos");
            } else if (opcion.equals("3")) {
                System.out.println("Buscar contacto");
            } else if (opcion.equals("4")) {
                System.out.println("Salir");
                break;
            } else {
                System.out.println("Opción no válida");
            }
        }

        sc.close();
    }
}