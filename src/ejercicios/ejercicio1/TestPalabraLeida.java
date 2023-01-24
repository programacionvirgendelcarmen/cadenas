package ejercicios.ejercicio1;

import java.util.Scanner;
import static ejercicios.ejercicio1.Palabra.*;
public class TestPalabraLeida {
    private final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {

        String palabra1 = getPalabra();
        mostrarInformacionDePalabra(palabra1);
        String palabra2 = getPalabra();
        System.out.printf("\n¿Son iguales %s y %s? %B%n",
                palabra1, palabra2, sonIguales(palabra1, palabra2));
        System.out.println("\nIntroduce una palabra de una sola letra");
        String sLetra = "";
        do{
            sLetra = getPalabra();
        } while ( sLetra.length() != 1);
        char cLetra = sLetra.charAt(0);
        System.out.printf("¿%s contiene %c? %B%n", palabra1, cLetra,
                contieneLetra(palabra1, cLetra));
        SC.close();
    }

    private static void mostrarInformacionDePalabra(String palabra) {
        System.out.printf("Analizando la palabra: %s%n", palabra);
        System.out.println("===================================\n");
        System.out.printf("Nº de letra: %d%n", obtenerNumeroDeLetras(palabra));
        System.out.printf("¿Empieza por vocal? %B%n", empiezaPorVocal(palabra));
        System.out.printf("¿Acaba en vocal? %B%n", acabaEnVocal(palabra));
        System.out.printf("Nº de vocales %d%n", obtenerNumeroDeVocales(palabra));
        System.out.printf("¿Es un palíndromo? %B%n", esUnPalindromo(palabra));
    }

    private static String getPalabra( ) {
        String palabra = "";
        do {
            System.out.println("Introduce una única palabra");
            palabra = SC.nextLine();
        } while (! palabra.toLowerCase().matches("[a-zñáéíóúü]+"));
        return palabra;
    }
}
