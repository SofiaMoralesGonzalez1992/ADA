import java.util.*;

/**
 * Eje15
 */
public class Eje15 {

    public static void  main(String[] args) {
        int cantVocales= 0;
        int cantEspacios= 0;
        int cantPuntos= 0;

        char caracter;

        System.out.println("Ingrese caracter por caracter hasta el punto");
        Scanner teclado = new Scanner(System.in);

        caracter = teclado.nextLine().charAt(0);

        while(caracter != '.') {
            if (esVocal(caracter)){
                cantVocales++;
            } else if (caracter == ' ') {
                cantEspacios++;


            }
            caracter = teclado.next
        }

        {
            switch (caracter){

            {
             case 'A':
             case  'a':
             case  'E':
             case  'e':
             case 'i':
             case 'o':
             case 'u':

              cantVocales++;
                 break;
             * case '.':
             
             cantPuntos++;
                      
             break
             *
             * case ('.')


             caracter= teclado.nextline().charAt(0);

             cantPuntos++;

             
             System.out.println("Vocales"+ cantVocales);
             System.out.println("Espacios" + cantEspacios);
             System.out.println("Puntos" + cantPuntos);

        }
        static boolean esVocal()

    }
}


while (caracter != '.') {
    if (esVocal(cacter)){

}