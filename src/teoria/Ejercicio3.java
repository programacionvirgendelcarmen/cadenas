package teoria;

import strings.StringHelper;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce contraseña");
        String passwd = sc.nextLine();
        /*if (passwd.length() < 8) {
            System.out.printf("%s no es segura%n", passwd);
            return;
        };

        boolean numero = false, simbolo = false, mayuscula = false, minuscula = false;
        for (int i = 0; i < passwd.length(); i++) {
            if (Character.isDigit(passwd.charAt(i)))
                numero = true;
            else if (Character.isLowerCase(passwd.charAt(i)))
                minuscula = true;
            else if (Character.isUpperCase(passwd.charAt(i)))
                mayuscula = true;
            else
                simbolo = true;
        }*/
       // boolean segura = esContrasennaSegura(passwd);
        boolean segura = StringHelper.isSafePasswordDefault(passwd);
        System.out.printf("%s ¿Es segura? %B%n", passwd, segura);
    }
    public static boolean esContrasennaSegura(String passwd){
        if (passwd.length() < 8)
            return false;


        boolean numero = false, simbolo = false, mayuscula = false, minuscula = false;
        for (int i = 0; i < passwd.length(); i++) {
            if (Character.isDigit(passwd.charAt(i)))
                numero = true;
            else if (Character.isLowerCase(passwd.charAt(i)))
                minuscula = true;
            else if (Character.isUpperCase(passwd.charAt(i)))
                mayuscula = true;
            else
                simbolo = true;
        }
        return numero && simbolo && mayuscula && minuscula;

    }
}
