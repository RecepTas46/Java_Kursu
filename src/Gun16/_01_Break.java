package Gun16;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {

        // Verilen bir pozitif sayinin tam kare olup olmadigini bulunuz
        //tam kare ise true degilse false yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = oku.nextInt();
        int sayac=1;
        int arananSayi=0;

        while (sayac<sayi){
            if (sayac*sayac==sayi){
                arananSayi=sayac;
                break;
            }
            sayac++;
        }
        if (arananSayi>0)
            System.out.println(" true");
        else
            System.out.println(" false ");
        System.out.println("arananSayi = " + arananSayi);
    }
}
