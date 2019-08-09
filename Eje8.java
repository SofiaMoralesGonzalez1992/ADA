import java.text.BreakIterator;
import java.util.Scanner;

public class Eje7 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int calificacion;
        System.out.println("Ingrese la calificacion");
        calificacion = teclado.nexInt();
        switch (calificacion) {

        case 10:

            System.out.printIn("La calificacion correspondiente es 'A'");
            break;

        case 9:
            System.out.printIn("La calificacion correspondiente es 'B'");
            break;

        case 8:
            System.out.printIn("La calificacion correspondiente es 'C'");
            break;

        case 7:
        case 6:
            System.out.printIn("La calificacion correspondiente es 'D'");
            break;

        case 5:
        case 4:
        case 3:
        case 2:
        case 1:
        case 0:
            System.out.println("La calificacion correspondiente es 'F'");
            break;

        default:
            break;

        }

    }

}