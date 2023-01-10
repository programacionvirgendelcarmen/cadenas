package teoria;

public class Ejercicio1 {

    public static void main(String[] args) {
        //creamos un array de String que aparezca: nombre, apellidos, dirección, telefono
        /*String[] datos = new String[4];
        datos[0] = "javier";
        .....
         */
        String[] datos = {"javier", "gómez hernández", "avda. madrid 35", "953222222"};
        //usamos un bucle mejorado aparezca en una línea cada uno de los valores:
        //nombre
        //apellidos
        //...
        for ( String dato : datos ) {
            System.out.println(dato);
        }
        //Un método que pasemos el array anterior y devuelva un String como una línea CSV
        //"nombre, apellidos, direccion, telefono"
        String csv1 = crearCampoCSV(datos);
        //mostramos en consola la cadena anterior, pero en mayúscula
        System.out.printf("CSV: %S%n", csv1);
        //Pasamos la cadena anterior a un método y nos devuelva una nueva cadena
        //pero sin espacios y en mayúscula:
        //"NOMBRE,APELLIDOS,DIRECCIÓN,TELÉFONO"
        String csv2 = crearCampoCSVSinEspaciosYMayuscula(csv1);
    }

    private static String crearCampoCSVSinEspaciosYMayuscula(String csv1) {
        return csv1;
    }

    private static String crearCampoCSV(String[] datos) {
        String csv = "";
        for (String dato : datos) {
            csv += dato + ", ";
        }
        if (csv.isEmpty())
            return csv;
       // else
       return csv.substring(0, csv.length() - 2);
       //javier,_gómez hernández,_avda. madrid 22,_953222222,_
       //012.................................................csv.length-1
        //substring(0, csv.length()-2)
    }



    //Un método, que se le pase la cadena anterior y nos devuelva el nombre
    //con el formato apellidos, nombre
    //Un método que se le pase el String anterior de apellidos y nombre, nos diga
    //cuantas vocales tiene entre apellidos y nombre 
}
