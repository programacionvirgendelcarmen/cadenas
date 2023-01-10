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
        System.out.println(csv2);
        //Un método, que se le pase la cadena anterior y nos devuelva el nombre
        //con el formato apellidos, nombre
        String nombre = crearNombre(csv2);
        System.out.printf("NOMBRE: %s%n", nombre);
        //Un método que se le pase el String anterior de apellidos y nombre, nos diga
        //cuantas vocales tiene entre apellidos y nombre
        int numeroVocalesNombre = contarVocalesDeNombre(nombre);
    }

    private static int contarVocalesDeNombre(String nombre) {
        int contadorVocales = 0;
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.toLowerCase().charAt(i) == 'a' || nombre.toLowerCase().charAt(i) == 'e' )
                contadorVocales++;
        }
        return contadorVocales;
    }

    private static String crearNombre(String csv) {
        //recibo "NOMBRE,APELLIDOS,DIRECCIÓN,TELÉFONO"
        //devuelvo: apellidos, nombre
        String[] tokens = csv.split(",");
        //new String[]{"NOMBRE","APELLIDOS","DIRECCION","TELEFONO"}
        return tokens[1].toLowerCase() + ", " + tokens[0].toLowerCase();
    }

    private static String crearCampoCSVSinEspaciosYMayuscula(String csv) {
        //csv = "nombre, apellidos, direccion, telefono"
        //return NOMBRE,APELLIDOS,DIRECCION,TELEFONO
        return csv.replaceAll(" ","").toUpperCase();
        //falla por que quita el espacios en blanco de los apellidos
        //solucionamos con split(", ")
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





}
