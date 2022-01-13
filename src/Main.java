public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
        for (int q = 0; q <= 80; q++) {
            if (q == 10)
                break;
            System.out.print(q + " ");
        }
        System.out.println("\n");

        for (int q = 0; q <=40; q++) {
            if (q % 4 == 0)
                continue;
            System.out.print(q + " ");
        }
        System.out.println("\n");


        for (int q = 0; q <= 50; q++) {
            if (q== 10)
                return;
            System.out.print(q + " ");

        }
    }
}
