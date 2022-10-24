package Gun16;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
// kullanicinin  gireceği bir rakama kadar olan sayıların carpimini (faktoriyel) bulunuz
//5!=5*4*3*2*1
        Scanner oku = new Scanner(System.in);
        System.out.println(" sayi giriniz=");
        int sayi = oku.nextInt();

        int carpim = 1;
        for (int i = 1; i <= sayi; i++)


            carpim = carpim * i;
        System.out.println("carpim = " + carpim);


    }
}
