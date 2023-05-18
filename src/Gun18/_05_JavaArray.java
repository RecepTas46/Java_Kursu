package Gun18;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {

        // Kullanıcıdan alacağınız 7 sayıyı bir diziye atadıktan sonra
        // ayrı bir döngü ile kaç tanesinin tek sayı olduğunu bulunuz.
        int[] dizi = new int[7];

        Scanner oku = new Scanner(System.in);
        int tekSayilar = 0;
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ".sayi=");
            dizi[i] = oku.nextInt();


        }
        for (int i = 0; i < 7; i++) {
            if (dizi[i] % 2 == 1)
                tekSayilar++;


        }
        System.out.println("tekSayilar = " + tekSayilar);
    }
}
