import java.util.Scanner;

public class ContarChar {

    /*
     Cuenta de forma recursiva cuántas veces aparece un carácter en una cadena.
     texto: La cadena en la que se buscará.
     caracter: El carácter que se desea contar.
     return El número de veces que el carácter aparece en la cadena.
     */
    public static int contar(String texto, char caracter) {
        // Si la cadena está vacía no hay más que contar
        if (texto.isEmpty()) {
            return 0;
        }

        // Obtenemos primer caracter
        char primerCaracter = texto.charAt(0);
        // Obtenemos el resto de la cadena (desde el 2 carácter).
        String restoDelTexto = texto.substring(1);

        // Si el primer carácter de la cadena == caracter, suma 1 al resultado de la llamada recursiva.
        if (primerCaracter == caracter) {
            return 1 + contar(restoDelTexto, caracter);
        } else {
            // Si no coincide retorna el resultado de la llamada recursiva.
            return contar(restoDelTexto, caracter);
        }
    }


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Cuenta caracteres: ");
        System.out.print("Ingresa una cadena de texto: ");
        //Recibimos cadena
        String cadena = leer.nextLine();
        System.out.print("Ingresa el carácter a buscar: ");
        // Lee el primer carácter de la línea de entrada.
        char buscarCaracter = leer.next().charAt(0);

        int resultado = contar(cadena, buscarCaracter);

        System.out.println("El carácter " + buscarCaracter + " aparece " + resultado + " veces");

    }
}
