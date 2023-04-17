package Day20_ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class C10_fibonacci_from_babayigit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bir sayi giriniz: ");
        int sayi = scan.nextInt();

        fibonacci(sayi);


    }

    private static void fibonacci(int sayi) {

        ArrayList<Integer> fibo = new ArrayList<>();

        // fibo listinin ilk iki rakamini atıyoruz

        fibo.add(1);
        fibo.add(1);

        for (int i = 2; i < sayi ; i++) {
            fibo.add(fibo.get(i-2)+fibo.get(i-1));

        }

        System.out.println(fibo);

    }
}
