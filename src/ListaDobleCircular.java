public class ListaDobleCircular {
    private Nodo head = null;

    // Insertar al Inicio 
    public void insertarAlInicio(int dato) {
        Nodo.nuevoNodo = new Nodo(dato) { // Crear un nuevo nodo con el dato proporcionado
        if (head == null) { // Si la lista está vacía, el nuevo nodo será la cabeza
            nuevoNodo.siguiente = nuevoNodo; //Nuevo nodo apunta a sí mismo como siguiente
            nuevoNodo.anterior = nuevoNodo; //Nuevo nodo apunta a sí mismo como anterior
            head = nuevoNodo; // La cabeza de la lista ahora es el nuevo nodo
        } else { // Si la lista NO está vacía, se inserta el nuevo nodo al inicio
            Nodo ultimo = head.anterior; // Obtener el último nodo de la lista (el nodo anterior a la cabeza)
            nuevoNodo.siguiente = head; // El nuevo nodo apunta a la cabeza actual como siguiente
            nuevoNodo.anterior = ultimo; // El nuevo nodo apunta al último nodo como anterior
            ultimo.siguiente = nuevoNodo; // El último nodo apunta al nuevo nodo como siguiente
            head.anterior = nuevoNodo; // La cabeza actual apunta al nuevo nodo como anterior
            head = nuevoNodo;  // La cabeza de la lista ahora es el nuevo nodo     
        }
        }
    }

    // Insertar al Final 
    public void insertarAlFinal() {}

    // Eliminar al Inicio 
    public void eliminarAlInicio() {}

    // Eliminar al Final 
    public void eliminarAlFinal() {}

    // Buscar un Elemento 
    public boolean buscarElemento() { }

    // Recorrer e Imprimir la Lista 
    public void imprimir() {}
}