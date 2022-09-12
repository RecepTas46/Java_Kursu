package Gun05;

import java.util.Scanner;

public class _03_Ornek1 {
    public static void main(String[] args) {
        //Bir dikdortgenin iki kenari icin uzunkuk tanimlayiniz
        //cevre ve alanini bulunuz

        //bu bolümü sonradan kendim yaptim
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Kisa kenar icin pozitif bir sayi giriniz");
//        int kisaK= sc.nextInt();
//        System.out.println("Uzun kenar icin pozitif bir sayi giriniz");
//        int uzunK=sc.nextInt();
//
//        System.out.println("Alan="+kisaK*uzunK);
//        System.out.println("cevre="+((kisaK*2)+(uzunK*2)));

        int kisaKenar=10;
        int uzunKenar=15;

        int cevre = kisaKenar + kisaKenar + uzunKenar + uzunKenar;
        int alan = kisaKenar * uzunKenar;

        System.out.println("cevre=" + cevre+"cm");
        System.out.println("alan=" + alan + "cm");
    }
}
