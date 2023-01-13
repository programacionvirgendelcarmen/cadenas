package teoria;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        //creamos un List de String que aparezca: nombre, apellidos, dirección, telefono
        /*List<String> lista = new ArrayList<>(); //lista que se puede modificar
        lista.add("joaquin");
        lista.add("garcía abolafia");*/
        //.......
        List<String> listaCSV =
                List.of("joaquin", "garcía abolafia","avda madrid 35", "953222222");
        //listaCSV.set(0, "felipe"); es inmutable
        //usamos un bucle mejorado aparezca en una línea cada uno de los valores:
        //nombre
        //apellidos
        //...
        for (String dato : listaCSV ) {
            System.out.println(dato);
        }
        //Un método que pasemos la lista anterior y devuelva un String como una línea CSV
        //"nombre, apellidos, direccion, telefono" pero trabajando con StringBuilder
        String csv1 = crearCSV(listaCSV);
        //mostramos en consola la cadena anterior, pero en mayúscula
        System.out.printf("CSV: %S%n", csv1);
        //Pasamos la cadena anterior a un método y nos devuelva una nueva cadena
        //pero sin espacios y en mayúscula:
        //"NOMBRE,APELLIDOS,DIRECCIÓN,TELÉFONO" usando un StringBuilder
        String csv2 = crearCSVMayusculasSinEspacios(csv1);
        System.out.println(csv2);
        //Un método, que se le pase la cadena anterior y nos devuelva el nombre
        //con el formato apellidos, nombre usando un StringBuilder
        String nombre = crearNombreMinuscula(csv2);
        System.out.printf("NOMBRE: %s%n", nombre);
        //Un método que se le pasa la cadena "NOMBRE,APELLIDOS,DIRECCIÓN,TELÉFONO"
        //y un código postal devuelva "NOMBRE,APELLIDOS,DIRECCIÓN,TELÉFONO,CP"
        //usando StringBuilder
        String csv3 = crearCSVConCP(csv2, "23008");
        System.out.println(csv3);
    }

    private static String crearCSVConCP(String csv, String codigoPostal) {
        StringBuilder stringBuilder = new StringBuilder(csv);
        stringBuilder.append(',');
        stringBuilder.append(codigoPostal);
        return stringBuilder.toString();
    }

    private static String crearNombreMinuscula(String csv) {
        StringBuilder stringBuilder = new StringBuilder(csv);
        //absurdo trabaja con stringBuilder, con csv funcionaría
        String[] tokens = stringBuilder.toString().split(",");
        //new String[]{"NOMBRE","APELLIDOS","DIRECCION","TELEFONO"}
        return tokens[1].toLowerCase() + ", " + tokens[0].toLowerCase();
    }

    private static String crearCSVMayusculasSinEspacios(String csv) {
        StringBuilder stringBuilder = new StringBuilder(csv);
        //es absurdo crear el StringBuilder porque hay que emplear
        //el método replaceAll que es de String y csv ya es un String
        return stringBuilder.toString().replaceAll(", ",",").toUpperCase();
    }

    private static String crearCSV(List<String> listaCSV) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String dato: listaCSV) {
           stringBuilder.append(dato);
           stringBuilder.append(", ");
        }
        return stringBuilder.substring(0, stringBuilder.length() - 2);
    }
}
