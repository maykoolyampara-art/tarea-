import java.util.Arrays;

public class Main {

    public static boolean esAnagrama(String palabra1, String palabra2) {

        // Convertir las palabras a minúsculas
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();

        // Verificar si tienen la misma cantidad de letras
        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        // Convertir las palabras en arreglos de caracteres
        char[] letras1 = palabra1.toCharArray();
        char[] letras2 = palabra2.toCharArray();

        // Ordenar las letras alfabéticamente
        Arrays.sort(letras1);
        Arrays.sort(letras2);

        // Comparar los arreglos ordenados
        return Arrays.equals(letras1, letras2);
    }

    public static void main(String[] args) {

        String palabra1 = "congreso";
        String palabra2 = "sogrecon";

        if (esAnagrama(palabra1, palabra2)) {
            System.out.println("Las palabras son anagramas");
        } else {
            System.out.println("Las palabras no son anagramas");
        }
    }
}
