/*
 * Clase principal del programa CafeteriaStarbiks.
 * Contiene el método main y gestiona la interacción con el usuario.
 * Aplica el patrón Builder para preparar diferentes bebidas de la cafetería.
 */
package main;

import java.util.Scanner;
import model.BananiniBuilder;
import model.Bebida;
import model.BebidaBuilder;
import model.ChocoTinBuilder;
import model.FrezzberryBuilder;
import service.Empleado;

public class CafeteriaStarbiks {

    public static void main(String[] args) {
        // Se utiliza Scanner para leer la entrada del usuario desde consola
        Scanner sc = new Scanner(System.in);

        // Se crea un objeto Empleado, que actuará como el "Director" en el patrón Builder
        Empleado empleado = new Empleado();

        // Muestra el menú principal
        System.out.println("Bienvenido a Starbiks");
        System.out.println("1. ChocoTin\n2. Frezzberry\n3. Bananini");
        System.out.print("Seleccione una opcion: ");
        
        // Lee la opción seleccionada por el usuario
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpia el buffer para evitar problemas al leer cadenas

        // Variable que almacenará el Builder correspondiente a la bebida seleccionada
        BebidaBuilder builder = null;

        // Según la opción elegida, se asigna el Builder correspondiente
        switch (opcion) {
            case 1:
                // Si la bebida requiere leche, se pregunta el tipo al cliente
                String leche1 = preguntarLeche(sc);
                // Se crea el builder para ChocoTin con el tipo de leche elegido
                builder = new ChocoTinBuilder(leche1);
                break;
            case 2:
                // Frezzberry no requiere tipo de leche, se usa directamente su builder
                builder = new FrezzberryBuilder();
                break;
            case 3:
                // Si la bebida requiere leche, se pregunta el tipo al cliente
                String leche2 = preguntarLeche(sc);
                // Se crea el builder para Bananini con el tipo de leche elegido
                builder = new BananiniBuilder(leche2);
                break;
            default:
                // Opción inválida si el número ingresado no corresponde al menú
                System.out.println("Opción invalida.");
        }

        // Si se seleccionó una opción válida y se creó un builder
        if (builder != null) {
            // Se pasa el builder al empleado (director)
            empleado.setBuilder(builder);
            // El empleado prepara la bebida paso a paso usando el builder
            empleado.prepararBebida();
            // Se obtiene la bebida construida desde el empleado
            Bebida bebida = empleado.getBebida();
            // Se muestra el resumen de la bebida preparada
            bebida.mostrarBebida();
        }

        // Se cierra el Scanner para liberar recursos
        sc.close();
    }

    /**
     * Método auxiliar para preguntar al cliente el tipo de leche.
     * @param sc Scanner para leer la entrada.
     * @return Tipo de leche elegido por el usuario como cadena de texto.
     */
    private static String preguntarLeche(Scanner sc) {
        // Muestra las opciones de tipo de leche
        System.out.println("Seleccione tipo de leche:\n1. Entera\n2. Deslactosada\n3. Almendras");
        int tipo = sc.nextInt();
        sc.nextLine(); // Limpia el buffer
        
        // Devuelve la cadena correspondiente según la opción seleccionada
        switch (tipo) {
            case 1: return "Entera";
            case 2: return "Deslactosada";
            case 3: return "Almendras";
            // Si el usuario ingresa un valor inválido, se asigna leche entera por defecto
            default: return "Entera";
        }
    }
}
