import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        boolean resultadoBusqueda = true; 
        
        // 1) Crear un objeto de la clase ListaMaterias.
        ListaMaterias listaMaterias = new ListaMaterias();

        System.out.println("Lista de materias :)");

        // 1.1) Agregar elementos.
        listaMaterias.agregar("Matematicas");
        listaMaterias.agregar("Fisica");
        listaMaterias.agregar("Quimica");
        listaMaterias.agregar("Historia");
        listaMaterias.agregar("Programacion");

        // Mostrar la lista de materias.
        listaMaterias.imprimir();

        // 2) Solicitar una materia a buscar.
        System.out.print("\nBuscar materia: ");
        String busqueda = leer.nextLine();

        //  3) Mostrar el resultado.
        System.out.print("Resultado: Materia '" + busqueda + "'");
        
        if (resultadoBusqueda) {
            System.out.println(" encontrada.");
        } else {
            System.out.println(" no encontrada.");
        }

    }
}
