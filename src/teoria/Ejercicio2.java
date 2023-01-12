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
        List<String> listaCSV = List.of("joaquin", "garcía abolafia");
        //listaCSV.set(0, "felipe"); es inmutable
        //usamos un bucle mejorado aparezca en una línea cada uno de los valores:
        //nombre
        //apellidos
        //...
        //Un método que pasemos la lista anterior y devuelva un String como una línea CSV
        //"nombre, apellidos, direccion, telefono" pero trabajando con StringBuilder
        //mostramos en consola la cadena anterior, pero en mayúscula
        //Pasamos la cadena anterior a un método y nos devuelva una nueva cadena
        //pero sin espacios y en mayúscula:
        //"NOMBRE,APELLIDOS,DIRECCIÓN,TELÉFONO" usando un StringBuilder
        //Un método, que se le pase la cadena anterior y nos devuelva el nombre
        //con el formato apellidos, nombre usando un StringBuilder
        //Un método que se le pasa la cadena "NOMBRE,APELLIDOS,DIRECCIÓN,TELÉFONO"
        //y un código postal devuelva "NOMBRE,APELLIDOS,DIRECCIÓN,TELÉFONO,CP"
        //usando StringBuilder
    }
}
