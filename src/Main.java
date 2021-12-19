public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        System.out.println("numer indeksu 57080");
        int i = 1000;
        while (i > 0) {
            System.out.println("i: " + i);
            --i;
        }

        i = 1000;
        System.out.println("\n");
        while ((--i) > 0) {
            System.out.print("\nindex: " + i);
            if (i % 80 == 0) {
                System.out.println(" - podzielna przez 80");
            }
        }

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
        String[] liczby = {"jeden", "dwa", "trzy", "Cztery", "Pięć", };
        int me = 0;
        while (me < liczby.length) {
            System.out.println(liczby[me]);
            me++;
        }
        int[] tab = {1, 2, 3, 4, 5};
        int me1 = 0;
        while (me1 < tab.length) {
            System.out.println(tab[me1]);
            me1++;
        }
        double[] tab1 = {1.5, 2.1, 3.3, 4.2, 5.1};
        int me2 = 0;
        while (me2 < tab1.length) {
            System.out.println(tab1[me2]);
            me2++;

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

            while (true){
                System.out.println("prawda");
                //ciągle wypisuje prawda (pentla sie nie skonczy) //

            }
        }


    }
}