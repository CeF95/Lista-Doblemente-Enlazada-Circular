import java.util.Scanner;

public class Main { // Método principal para ejecutar el programa
    public static void main(String[] args) {
        ListaDobleCircular lista = new ListaDobleCircular(); // Instancia de la lista doble circular
        Scanner sc = new Scanner(System.in);
        int opcion, valor;  // Variables para almacenar la opción del menú y el valor a insertar o buscar

        do { // Bucle del menu
            System.out.println("LISTA DOBLEMENTE ENLAZADA CIRCULAR");
            System.out.println("1. Insertar al Inicio");
            System.out.println("2. Insertar al Final");
            System.out.println("3. Eliminar al Inicio");
            System.out.println("4. Eliminar al Final");
            System.out.println("5. Buscar un Elemento");
            System.out.println("6. Imprimir la Lista");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt(); 
            
            switch (opcion) { // Evaluar la opción seleccionada por el usuario
                case 1:
                    System.out.print("Ingrese el dato a insertar al inicio: ");
                    valor = sc.nextInt();
                    lista.insertarAlInicio(valor);
                    break;
                case 2:
                    System.out.print("Ingrese el dato a insertar al final: ");
                    valor = sc.nextInt();
                    lista.insertarAlFinal(valor);
                    break;
                case 3:
                    lista.eliminarAlInicio();
                    lista.imprimir();
                    break;
                case 4:
                    lista.eliminarAlFinal();
                    lista.imprimir(); // Imprimir la lista después de eliminar al final para mostrar el resultado
                    break;
                case 5:
                    System.out.print("Ingrese el dato a buscar: ");
                    valor = sc.nextInt();
                    if (lista.buscarElemento(valor)) { // Si el método buscarElemento retorna true, el dato fue encontrado en la lista
                        System.out.println("El dato fue ENCONTRADO en la lista.");
                    } else {
                        System.out.println("El dato NO FUE ENCONTRADO en la lista.");
                    }
                    break;
                case 6:
                    lista.imprimir();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default: // Opcion por defecto 
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 7.");
            }
            
        } while (opcion != 7); // Creacion de bucle hasta que el usuario decida salir del programa
        sc.close(); // Cerrar
    }
}
