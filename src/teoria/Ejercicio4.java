package teoria;

import java.time.LocalDate;

import static dates.DateHelper.checkDate;

public class Ejercicio4 {
    public static void main(String[] args) {
        if (checkDate("29-02-2000")) {
            LocalDate dateTime = LocalDate.of(2000, 02, 29);
            System.out.println(dateTime);
        } else {
            System.out.println("Fecha no valida");
        }
    }
}
