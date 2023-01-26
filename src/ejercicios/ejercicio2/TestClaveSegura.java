package ejercicios.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static strings.StringHelper.createSafePassword;

public class TestClaveSegura {
    public static void main(String[] args) {
        List<String> passwords = new ArrayList<>();
        //abrir Scanner
        Scanner sc = new Scanner(System.in);
        //solicitamos el nº claves
        String sNClaves = "";
        do {
            System.out.println("Introduce el nº claves a generas (5-15)");
            sNClaves = sc.nextLine();
        } while ( ! sNClaves.matches("[5-9]|1[0-5]") );
        int iNClaves = Integer.parseInt(sNClaves);
        //solicitamos el tamaño de las claves
        String sTClaves = "";
        do {
            System.out.println("Introduce el tamaño de las claves a generas (8-22)");
            sTClaves = sc.nextLine();
        } while ( ! sTClaves.matches("[89]|1[0-9]|2[0-2]") );
        int iTClaves = Integer.parseInt(sTClaves);
        //usando el método createSafePassword(int lenght)
        //creamos las claves y la añadimos a una colección (array o List)
        for (int i = 0; i < iNClaves; i++) {
            String password = createSafePassword(iTClaves);
            passwords.add(password);
        }
        //mostramos la colección
        System.out.println(passwords);
        //de forma aleatoria, escogemos una y la mostramos
    }
}
