package Gun14;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {

        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü buluarak yazdırınız.


        Scanner oku = new Scanner(System.in);
        int sayac = 0;
        int enb = 0;
        while (sayac < 5) {
            System.out.println(" sayi giriniz=");
            int sayi = oku.nextInt();

            if (sayi > enb)
                enb = sayi;

            sayac++;
            System.out.println("enb = " + enb);


        }
    }
}
