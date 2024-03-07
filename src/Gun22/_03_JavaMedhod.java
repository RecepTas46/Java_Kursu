package Gun22;

import java.util.Scanner;

public class _03_JavaMedhod {
    public static void main(String[] args) {
//Her bilgi kullanicidan alinmak isteniyorsa basina tanimlama yapilmali scan okutma islemi yapilmali
        //ve bilgiler yukardan asagi yazildigi icin  her islemin uzerine tanimlanmali,
        //main blagu altina yazilmali yazdiracagimiz bilgiler. asagida yeni yaptigimiy mainlrin icindeki islemler yani
        Scanner oku = new Scanner(System.in);
        System.out.println("lutfen sayi giriniz;");
        int okunan = oku.nextInt();
        ciftmiTekmi(okunan);


        System.out.println("Birir boslukla iki  sayi giriniz: ");
        int sayi1 = oku.nextInt();
        int sayi2 = oku.nextInt();
        topla(sayi1, sayi2);

        ciftmiTekmi(5);
        ciftmiTekmi(4);
        ciftmiTekmi(6);

        System.out.println("Birir boslukla iki  sayi giriniz: ");
        int sayi3 = oku.nextInt();
        int sayi4 = oku.nextInt();
        cikarma(sayi3, sayi4);
    }

    public static void ciftmiTekmi(int sayi) {
        if (sayi % 2 == 0) {
            System.out.println("cift");
        } else
            System.out.println("tek");
    }


    public static void topla(int sayi1, int sayi2) {

        System.out.println("sayi1+sayi2 = " + (sayi1 + sayi2));
    }

    public static void cikarma(int sayi3, int sayi4) {
        System.out.println("cikarma yap = " + (sayi4 - sayi3));
    }

}
