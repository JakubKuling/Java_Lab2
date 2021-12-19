import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */

        int i = 100;
        int dzielnik = 80;
        for (; i > 0; ) {
            System.out.print(i);
            if (i % dzielnik == 0) {

                System.out.print("  podzielna przez " + dzielnik);
            }
            System.out.println();
            i--;
        }

        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

        int[] w = new int[5];
        int z = 0;

        Scanner scan = new Scanner(System.in);
        for (int element : w) {
            System.out.println("\nPodaj " + (z + 1) + " element tablicy: ");

            w[z] = scan.nextInt();
            z++;
        }
        for (int value : w) {
            System.out.println(value + 11);
        }


    }
}

