public class ListaDobleCircular {
    private Nodo head = null; // Atributo para almacenar el nodo head de la lista, inicialmente es null indicando que la lista está vacía

    // Insertar al Inicio 
    public void insertarAlInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);  // Crear un nuevo nodo con el dato proporcionado
        if (head == null) { // Si la lista está vacía, el nuevo nodo será el head
            nuevoNodo.siguiente = nuevoNodo; //Nuevo nodo apunta a sí mismo como siguiente
            nuevoNodo.anterior = nuevoNodo; //Nuevo nodo apunta a sí mismo como anterior
            head = nuevoNodo; // El head de la lista ahora es el nuevo nodo
        } else { // Si la lista NO está vacía, se inserta el nuevo nodo al inicio
            Nodo ultimo = head.anterior; // Obtener el último nodo de la lista (el nodo headanterior)
            nuevoNodo.siguiente = head; // El nuevo nodo apunta al head actual como siguiente
            nuevoNodo.anterior = ultimo; // El nuevo nodo apunta al último nodo como anterior
            ultimo.siguiente = nuevoNodo; // El último nodo apunta al nuevo nodo como siguiente
            head.anterior = nuevoNodo; // El head actual apunta al nuevo nodo como anterior
            head = nuevoNodo;  // El head de la lista ahora es el nuevo nodo     
        }
    }

    // Insertar al Final 
    public void insertarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato); // Crear un nuevo nodo con el dato proporcionado
        if (head == null) { // Si la lista está vacía, el nuevo nodo será el head
            nuevoNodo.siguiente = nuevoNodo; //Nuevo nodo apunta a sí mismo como siguiente
            nuevoNodo.anterior = nuevoNodo; //Nuevo nodo apunta a sí mismo como anterior
            head = nuevoNodo; // El head de la lista ahora es el nuevo nodo
        } else { // Si la lista NO está vacía, se inserta el nuevo nodo al final
            Nodo ultimo = head.anterior; // Obtener el último nodo de la lista (el nodo head anterior)
            ultimo.siguiente = nuevoNodo; // El último nodo apunta al nuevo nodo como siguiente
            nuevoNodo.anterior = ultimo; // El  nuevo nodo apunta al último nodo como anterior
            nuevoNodo.siguiente = head; // El nuevo nodo apunta al head actual como siguiente
            head.anterior = nuevoNodo; // El head actual apunta al nuevo nodo como anterior
        } //OJO aca no se actualiza el head porque el nuevo nodo se inserta al final, no al inicio
    }

    // Eliminar al Inicio 
    public void eliminarAlInicio() { // Verificar si la lista está vacía
        if (head == null) { // Si la lista está vacía, no se puede eliminar ningún nodo
            System.out.println("La lista esta vacia nose puede eliminar");
            return; // Salir del método sin hacer nada
        }
        if (head.siguiente == head) { // Si solo hay un nodo en la lista
            head = null; // La lista queda vacía
        } else { // Si hay más de un nodo en la lista
            Nodo ultimo = head.anterior; // Obtener el último nodo de la lista (el head anterior)
            head = head.siguiente; // El head de la lista ahora es el siguiente nodo
            head.anterior = ultimo; // El nuevo head apunta al último nodo como anterior
            ultimo.siguiente = head; // El último nodo apunta al nuevo head como siguiente
        }
    }

    // Eliminar al Final 
    public void eliminarAlFinal() { // Verificar si la lista está vacía
        if (head == null) { // Si la lista está vacía, no se puede eliminar ningún nodo
            System.out.println("La lista esta vacia nose puede eliminar");
            return; // Salir del método sin hacer nada
        }
        if (head.siguiente == head) { // Si solo hay un nodo en la lista
            head = null; // La lista queda vacía
        } else { // Si hay más de un nodo en la lista
            Nodo ultimo = head.anterior; // Obtener el último nodo de la lista (el head anterior)
            ultimo.anterior.siguiente = head; // El nodo anterior al último apunta al head como siguiente
            head.anterior = ultimo.anterior; // El head apunta al nodo anterior al último como anterior
        }
    }

    // Buscar un Elemento 
    public boolean buscarElemento(int valorBuscado) { 
        if (head == null) { // Si la lista está vacía, no se puede encontrar ningún elemento
            return false; // Retornar false indicando que el elemento no fue encontrado
        }
        Nodo actual = head; // Comenzar la búsqueda desde el head de la lista
        do { // Recorrer la lista hasta volver al head
            if (actual.dato == valorBuscado) { // Si el dato del nodo actual coincide con el valor buscado
                return true; // Retornar true indicando que el elemento fue encontrado
            }
            actual = actual.siguiente; // Mover al siguiente nodo en la lista
        } while (actual != head); // Continuar hasta volver al head de la lista
        return false; // Retornar false indicando que el elemento no fue encontrado después de recorrer toda la lista
    }

    // Recorrer e Imprimir la Lista 
    public void imprimir() {
        if (head == null) { // Si la lista está vacía, no hay nada que imprimir
            System.out.println("La lista esta vacia");
            return; // Salir del método sin hacer nada
        }
        Nodo actual = head; // Comenzar a imprimir desde el head de la lista
        do { // Recorrer la lista hasta volver al head
            System.out.print(actual.dato + " "); // Imprimir el dato del nodo actual seguido de un espacio
            actual = actual.siguiente; // Mover al siguiente nodo en la lista
        } while (actual != head); // Continuar hasta volver al head de la lista
        System.out.println(); // Imprimir una nueva línea después de imprimir todos los elementos de la lista
    }
}