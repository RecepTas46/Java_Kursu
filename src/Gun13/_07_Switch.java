package Gun13;

import java.util.Scanner;

public class _07_Switch {
    public static void main(String[] args) {
// Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner oku =new Scanner(System.in);
        System.out.println("bir sayi giriniz=");
        int sayi= oku.nextInt();

        int onlarBasamagi=(sayi/10) %10;
        switch (onlarBasamagi)
        {
            case  0: System.out.println("sifir");break;
            case  1: System.out.println("bir");break;
            case  2: System.out.println("iki");break;
            case  3: System.out.println("uc");break;
            case  4: System.out.println("dort");break;
            case  5: System.out.println("bes");break;
            case  6: System.out.println("alti");break;
            case  7: System.out.println("yedi");break;
            case  8: System.out.println("sekiz");break;
            case  9: System.out.println("dokuz");break;
        }

    }
}
