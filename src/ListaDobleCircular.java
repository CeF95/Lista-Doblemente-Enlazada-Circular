public class ListaDobleCircular {
    private Nodo head = null;

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
    public boolean buscarElemento() { }

    // Recorrer e Imprimir la Lista 
    public void imprimir() {}
}