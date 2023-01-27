package ejercicios.ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    private static final Scanner SC_IN = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {
        List<String> nombres = new ArrayList<>();
        Scanner scFile = new Scanner(new File("ficheros/nombres.txt"));

       while (scFile.hasNextLine()){
           String nombre = scFile.nextLine();
           nombres.add(nombre);
       }
        System.out.printf("Lista con %d nombres%n", nombres.size());
        List<String> nombreAcabadoConsonante =
                obtenerNombreAcabanConsonante(nombres);
        System.out.println("NOMBRES ACABADOS EN CONSONANTE");
        nombreAcabadoConsonante.forEach(System.out::println);
        String letra = "";
        do {
            System.out.println("Introduce una letra");
            letra = SC_IN.nextLine();
        } while (! letra.toLowerCase().matches(("[a-záéíóúñ]")));

    }
    private static List<String> obtenerNombreAcabanConsonante(List<String> lista){
        List<String> listaNombresAcabadosConsonante = new ArrayList<>();
        for (String nombre : lista)
            if (nombre.toLowerCase().matches(".*[^aeiouáéíóú]"))
                listaNombresAcabadosConsonante.add(nombre);
        return listaNombresAcabadosConsonante;
    }
    private static List<String> obtenerListaEmpiezaPorLetra(
            List<String> lista, String letra){
        List<String> listaEmpiezaPorLetra = new ArrayList<>();
        for (String nombre : lista )
            if (nombre.toLowerCase().startsWith(letra.toLowerCase()))
                listaEmpiezaPorLetra.add(nombre);

        return listaEmpiezaPorLetra;
    }
}
