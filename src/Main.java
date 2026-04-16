import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDobleCircular lista = new ListaDobleCircular();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("LISTA DOBLEMENTE ENLAZADA CIRCULAR");
            System.out.println("1. Insertar al Inicio");
            System.out.println("2. Insertar al Final");
            System.out.println("3. Eliminar al Inicio");
            System.out.println("4. Eliminar al Final");
            System.out.println("5. Buscar un Elemento");
            System.out.println("6. Imprimir la Lista");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
        } while (opcion != 7);
    }
}
