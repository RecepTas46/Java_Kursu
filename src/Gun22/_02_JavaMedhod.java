package Gun22;

import java.util.Locale;

public class _02_JavaMedhod {
    public static void main(String[] args) {
        merhabaYaz();
        ismetMerhabaYaz("ismet");//parametre girme
        ismetMerhabaYaz("ahmet");
        sevgili(" cigdem " + "sevgili kizim meltem");
        birinciLig("\nfenerbahce \n" + "galatasaray\n" + "besiktas\n" + "trabzon \n" + "kayseri\n");
        toplama(12, 10);
        cikarma(5, 8, 1);

    }


    public static void merhabaYaz() // mainle aynı ismini sen ver
    {
        System.out.println("Merhaba ");
    }

    public static void ismetMerhabaYaz(String isim) {//parametreyi tanimlama
        System.out.println("Merhaba " + isim.toUpperCase());
    }

    public static void sevgili(String ilk) {

        System.out.println("sevgili karicim " + ilk);
    }

    public static void birinciLig(String takim) {
        System.out.println("Takim Siralamasi:" + takim.toUpperCase(Locale.ROOT));
    }

    public static void toplama(int a, int b) {
        System.out.print("Toplama yap:" + (a + b) + " ");
    }

    public static void cikarma(int x, int y, int z) {
        System.out.println();
        System.out.println("islem= " + (x - y + z));
    }

}
