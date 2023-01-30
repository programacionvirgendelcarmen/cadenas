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
           nombres.add(nombre.toLowerCase()); //nombres de lista en minúscula
       }
        System.out.printf("Lista con %d nombres%n", nombres.size());
        List<String> nombreAcabadoConsonante =
                obtenerNombreAcabanConsonante(nombres);
        System.out.println("NOMBRES ACABADOS EN CONSONANTE");
        nombreAcabadoConsonante.forEach(System.out::println);
        System.out.println("NOMBRES QUE EMPIEZA POR UNA LETRA");
        String letra = "";
        do {
            System.out.println("Introduce una letra");
            letra = SC_IN.nextLine();
        } while (! letra.toLowerCase().matches(("[a-záéíóúñ]")));
        System.out.printf("Listado de nombres que empieza por %s%n", letra);
        List<String> nombresEmpiezanPor = obtenerListaEmpiezaPorLetra(
                nombres, letra);
        nombresEmpiezanPor.forEach(System.out::println);
        System.out.println("BUSCAR UN NOMBRE");
        String nombre = "";
        do {
            System.out.println("Introduce un nombre");
            nombre = SC_IN.nextLine();
        } while (! nombre.toLowerCase().matches(("[a-záéíóúñ]+")));
        System.out.printf("¿Está %s en la lista? %B%n",
                nombre, contieneNombre(nombres, nombre));
        System.out.println("BUSCAR UNA SECUENCIA");
        String secuencia = "";
        do {
            System.out.println("Introduce una secuencia");
            secuencia = SC_IN.nextLine();
        } while (! secuencia.toLowerCase().matches(("[a-záéíóúñ]+")));
        List<String> secuencias = obtenerListaNombresAproximados(
                nombres, secuencia);
       // System.out.println(secuencias);
        secuencias.forEach(System.out::println);
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

    private static boolean contieneNombre(List<String> lista, String nombre){
        return lista.contains(nombre.toLowerCase());
    }

    private static List<String> obtenerListaNombresAproximados
            (List<String> lista, String secuencia) {
        List<String> listaAproximados = new ArrayList<>();
        for (String nombre: lista) {
            if (nombre.contains(secuencia.toLowerCase())){
                listaAproximados.add(nombre);
            }
        }
        return listaAproximados;
    }
}
