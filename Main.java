import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> declaraciones = new ArrayList<>();
        List<String> asignaciones = new ArrayList<>();

        System.out.println("Ingrese las declaraciones:");
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) break;
            String[] parts = input.split(" ");
            if (parts.length != 2 || !"entero".equals(parts[0].toLowerCase())) {
                System.out.println("Declaración inválida. Formato: entero Identificador");
                continue;
            }
            declaraciones.add(input);
        }

        System.out.println("Ingrese las asignaciones:");
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) break;
            String[] parts = input.split("=");
            if (parts.length != 2) {
                System.out.println("Asignación inválida. Formato: Identificador = Expresión");
                continue;
            }
            asignaciones.add(input);
        }

        // Imprimir las declaraciones y asignaciones
        System.out.println("\nDeclaraciones:");
        for (String decl : declaraciones) {
            System.out.println(decl);
        }

        System.out.println("\nAsignaciones:");
        for (String asignacion : asignaciones) {
            System.out.println(asignacion);
        }
    }
}
