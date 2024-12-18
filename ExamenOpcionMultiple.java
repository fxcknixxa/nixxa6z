import java.util.Scanner;

public class ExamenOpcionMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        mostrarBienvenidaYInstrucciones();

        String[] preguntas = {
            "¿Cuál es la capital de España?",
            "¿Cuál es el planeta más grande del sistema solar?",
            "¿Cuál es el autor de la obra 'Don Quijote de la Mancha'?",
            "¿Cuál es el número atómico del oxígeno?",
            "¿Cuál es el año en que se descubrió América?"
        };

        String[][] opciones = {
            {"Madrid", "Barcelona", "Valencia", "Sevilla"},
            {"Mercurio", "Venus", "Tierra", "Júpiter"},
            {"Miguel de Cervantes", "William Shakespeare", "Jorge Luis Borges", "Gabriel García Márquez"},
            {"8", "16", "32", "64"},
            {"1492", "1500", "1510", "1520"}
        };

        String[] respuestasCorrectas = {"Madrid", "Júpiter", "Miguel de Cervantes", "8", "1492"};

        int aciertos = 0;

        for (int i = 0; i < preguntas.length; i++) {
            System.out.println(preguntas[i]);
            for (int j = 0; j < opciones[i].length; j++) {
                System.out.println((j + 1) + ". " + opciones[i][j]);
            }

            System.out.print("Ingrese su respuesta (1-4): ");
            int respuesta = scanner.nextInt();

            if (opciones[i][respuesta - 1].equals(respuestasCorrectas[i])) {
                aciertos++;
                System.out.println("Correcto!");
            } else {
                System.out.println("Incorrecto. La respuesta correcta es " + respuestasCorrectas[i]);
            }
        }

        System.out.println("Examen finalizado. Usted obtuvo " + aciertos + " aciertos de " + preguntas.length + " preguntas.");
    }

    public static void mostrarBienvenidaYInstrucciones() {
        System.out.println("¡Bienvenido al examen de opción múltiple!");
        System.out.println("------------------------------------------------");
        System.out.println("Instrucciones:");
        System.out.println("1. Lee cada pregunta cuidadosamente.");
        System.out.println("2. Selecciona una de las opciones de respuesta.");
        System.out.println("3. Ingresa el número de la opción que crees correcta.");
        System.out.println("4. Repite el proceso para cada pregunta.");
        System.out.println("5. Al finalizar, se te mostrará el resultado.");
        System.out.println("¡Buena suerte!");
        System.out.println();
    }
