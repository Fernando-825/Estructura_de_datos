public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Historial historial = new Historial();

        // hacer() tres veces
        System.out.println("--- 1. REALIZAR ACCIONES ---");
        historial.hacer("Escribir Hola");
        historial.hacer("Borrar palabra");
        historial.hacer("Escribir Mundo");
        
        historial.mostrar();

        // deshacer() dos veces
        System.out.println("--- 2. DESHACER DOS VECES ---");
        historial.deshacer(); // Deshace "Escribir Mundo"
        historial.deshacer(); // Deshace "Borrar palabra"
        
        historial.mostrar();

        // 3) Flujo: rehacer() una vez
        System.out.println("--- 3. REHACER UNA VEZ ---");
        historial.rehacer(); // Rehace "Borrar palabra"
        
        historial.mostrar();
    }

    
}
