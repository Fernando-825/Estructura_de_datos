import java.util.Stack;

public class Historial {

    // Pila de acciones hechas (la principal).
    private Stack<String> acciones; 
    // Pila de acciones deshechas (lo que se puede recuperar).
    private Stack<String> rehacer; 

    // Constructor
    public Historial() {
        this.acciones = new Stack<>();
        this.rehacer = new Stack<>();
    }


    // Registrar nueva acción ej. "Escribir hola"
    public void hacer(String accion) {
        acciones.push(accion); // Agrega la acción a la cima de la pila 'acciones'.
        rehacer.clear();       // Si se hace una nueva acción, se borra el historial de rehacer.
        System.out.println("HACER: Registrada: " + accion);
    }


    // Mandar última acción a pila "rehacer"
    public String deshacer() {
        if (acciones.isEmpty()) {
            System.out.println("DESHACER: No hay acciones para deshacer.");
            return null;
        }
        
        // 1. Sacar la última acción de la pila "acciones" (pop).
        String accionDeshecha = acciones.pop();
        
        // 2. Agregar esa acción a la pila "rehacer" (push).
        rehacer.push(accionDeshecha);
        
        System.out.println("DESHACER: Mueve \"" + accionDeshecha + "\" a rehacer.");
        return accionDeshecha;
    }

    // Mandar la última acción deshecha a "acciones"
    public String rehacer() {
        if (rehacer.isEmpty()) {
            System.out.println("REHACER: No hay acciones para rehacer.");
            return null;
        }

        // 1. Saca la última acción de la pila "rehacer" (pop).
        String accionRehecha = rehacer.pop();
        
        // 2. Agrega esa acción de vuelta a la pila "acciones" (push).
        acciones.push(accionRehecha);
        
        System.out.println("REHACER: Recupera \"" + accionRehecha + "\" y la agrega a acciones.");
        return accionRehecha;
    }

    // Mostrar pilas
    public void mostrar() {
        System.out.println("\n--- ESTADO ACTUAL ---");
        System.out.println("Acciones (Pila Principal): " + acciones);
        System.out.println("Rehacer (Pila Secundaria): " + rehacer);
        System.out.println("--------------------\n");

    }

}
