package ejercicios.ejercicio1;

public class Palabra {

    public static int obtenerNumeroDeLetras(String palabra) {
        return palabra.length();
    }
    public static boolean empiezaPorVocal(String palabra){
        return palabra.toLowerCase().matches("[aeiouáéíóú].*");
    }
    public static boolean empiezaPorCosonante(String palabra) {
        return ! empiezaPorVocal(palabra);
    }
    public static boolean acabaEnVocal(String palabra) {
        return palabra.toLowerCase().matches(".*[aeiouáéíóú]");
    }
    public static int obtenerNumeroDeVocales(String palabra) {
        int contadorDeVocales = 0;
        for (int i = 0; i < palabra.length(); i++)
            if (empiezaPorVocal(palabra.charAt(i) + ""))
                contadorDeVocales++;
        return contadorDeVocales;
    }
    public static boolean contieneLetra(String palabra, char letra){
        return palabra.toLowerCase().
                contains(Character.toLowerCase(letra) + "");
    }
    public static boolean sonIguales (String palabra1, String palabra2){
        return palabra1.equalsIgnoreCase(palabra2);
    }
    public static boolean esUnPalindromo(String palabra) {
        StringBuilder stringBuilder = new StringBuilder(palabra);
        String reverso = stringBuilder.reverse().toString();
        return sonIguales(palabra, reverso);
    }
}
