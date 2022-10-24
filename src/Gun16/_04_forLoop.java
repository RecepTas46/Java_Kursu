package Gun16;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
// kullanicinin  gireceği bir rakama kadar olan sayıların toplamını bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.println(" sayi giriniz=");
        int sayi=oku.nextInt();

     int toplam=0;
        for (int i=0;i<sayi;i++)//for(int i=sayi;i>0;i--)
        {

            toplam=toplam+i;

        }
        System.out.println("toplam = " + toplam);
    }
}
