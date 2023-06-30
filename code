import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LiczbaDniDoKoncaRoku {
    public static void main(String[] args) {
        // Obecna data
        LocalDate obecnaData = LocalDate.of(2023, 6, 24);
        
        // Data końcowa - ostatni dzień roku
        LocalDate koniecRoku = LocalDate.of(obecnaData.getYear(), 12, 31);
        
        // Obliczanie różnicy w dniach
        long roznica = ChronoUnit.DAYS.between(obecnaData, koniecRoku);
        
        // Wyświetlanie wyniku
        System.out.println("Liczba dni do końca roku: " + roznica);
        
        // Dodane zmiany 1
        int dodaneZmiany1 = 5;
        roznica += dodaneZmiany1;
        
        // Dodane zmiany 2
        int dodaneZmiany2 = 3;
        roznica += dodaneZmiany2;
        
        // Dodane zmiany 3
        int dodaneZmiany3 = 2;
        roznica += dodaneZmiany3;
        
        // Wyświetlanie wyniku po dodanych zmianach
        System.out.println("Liczba dni do końca roku po dodanych zmianach: " + roznica);
        
        // Wycofanie jednej z zatwierdzonych zmian (operacja revert)
        int zmianaDoWycofania = dodaneZmiany2;
        roznica -= zmianaDoWycofania;
        
        // Wyświetlanie wyniku po wycofaniu zmiany
        System.out.println("Liczba dni do końca roku po wycofaniu zmiany: " + roznica);
    }
}
