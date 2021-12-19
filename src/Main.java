import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbe");
        int liczba = scan.nextInt();
        switch (liczba % 2) {
            case 0:
                System.out.println("Liczba jest parzysta");
                break;
            default:
                System.out.println("Liczba nie jest parzysta");
        }
            switch (liczba % 7) {
                case 0:
                    System.out.println("liczba jest podzielna przez 7");
                    break;
                default:
                    System.out.println("Liczba nie jest podzielna przez 7");
                    break;
            }




        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */
          String wyraz = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
            System.out.println("Podaj znak króty chcesz sprawdzić:o p x z q");
            String text = scan.next();
            switch (wyraz){
                case
            }
        }
    }

