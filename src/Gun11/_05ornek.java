package Gun11;

import java.util.Scanner;

public class _05ornek {
    public static void main(String[] args) {
        // Girilen bir sayını pozitif, negatif veya sıfır olduğunu yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.println("sayi=");
        int sayi = oku.nextInt();

        if (sayi > 0) {
            System.out.println(" sayi pozitifdir:");
        } else if (sayi == 0) {
            System.out.println("sayi sifirdir:");

        } else
            System.out.println("sayi nekatiftir:");




    }
}
