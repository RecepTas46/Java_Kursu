package Gun13;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
// Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner oku =new Scanner(System.in);
        System.out.println("1.sayi giriniz=");
        int sayi1= oku.nextInt();
        System.out.println("2.sayiyi giriniz=");
        int sayi2= oku.nextInt();
        System.out.println("toplama icin T\nCikarma icin C\nCarpma icin P\nBölme icin B\nGiriniz  ");
        Scanner okustr =new Scanner(System.in);
        String islem=okustr.next();

        if (islem.equalsIgnoreCase("T"))
            System.out.println("toplam = " + (sayi1+sayi2));
        else
        if (islem.equalsIgnoreCase("Ç"))
            System.out.println("Çıkartma = " + (sayi1-sayi2));
        else
        if (islem.equalsIgnoreCase("P"))
            System.out.println("Çarpma = " + (sayi1*sayi2));
        else
        if (islem.equalsIgnoreCase("B"))
            System.out.println("Bölme = " + (sayi1/sayi2));
    }
    }

