import java.util.ArrayList;

public class ListaMaterias {

    // La lista (ArrayList) donde se guardarán las materias.
    private ArrayList<String> lista;

    // Constructor de la clase
    public ListaMaterias() {
        this.lista = new ArrayList<>();
    }

    
    //Agrega una nueva materia a la lista.
    public void agregar(String materia) {
        lista.add(materia);
        System.out.println("Materia '" + materia + "' agregada.");
    }

    /*
      Revisa si una materia existe en la lista usando recursión.
      return true si la materia se encuentra.
     */
    public boolean contiene(String materia) {
        return contieneRecursivo(materia, 0); // Llama a la función recursiva desde el inicio.
    }

    /*
     Método auxiliar recursivo para buscar la materia.
     materia: La materia a buscar.
     indice: El índice actual de la lista que se está revisando.
     return: true si la materia es encontrada
     */
    private boolean contieneRecursivo(String materia, int indice) {
        // Si el índice llega al final de la lista, la materia no existe.
        if (indice >= lista.size()) {
            return false;
        }

        /* Caso base 2: Si el elemento en el índice actual es la materia buscada.
         Se usa .equals() para comparar el contenido de las cadenas.  */
        if (lista.get(indice).equals(materia)) {
            return true;
        }

        // Recursivo: Llama a la función con el siguiente índice para seguir buscando.
        return contieneRecursivo(materia, indice + 1);
    }

     // Método para imprimir
    public void imprimir() {
        System.out.println("Materias: " + lista);
    }

}