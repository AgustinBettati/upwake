import java.time.LocalDate;

/**
 * Created by Lautaro Paskevicius (lautaro.paskevicius@ing.austral.edu.ar)
 * on 14/08/2017.
 */
public class main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(0,12,3);
        LocalDate date2 = LocalDate.of(2012,12,3);
        System.out.println(date1.equals(date2));
        System.out.println(date1.toString());
        System.out.println(date2.toString());
    }
}
