package Gun13;

import java.util.Locale;
import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
// Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.(switch kullanınız)
        Scanner oku =new Scanner(System.in);
        System.out.println("1.sayi giriniz=");
        int sayi1= oku.nextInt();
        System.out.println("2.sayiyi giriniz=");
        int sayi2= oku.nextInt();
        System.out.println("toplama icin T\nCikarma icin C\nCarpma icin P\nBölme icin B\nGiriniz  ");
        Scanner oku2 =new Scanner(System.in);
        String islem=oku2.next();//string tipinde okudu

        switch (islem)//buranin tipi neyse case dekilerde o olmali
        {
            case "T":
                System.out.println(" toplam= " + (sayi1 + sayi2));
                break;
            case "C":
                System.out.println(" cikarma= " + (sayi1 - sayi2));
                break;
            case "P":
                System.out.println(" carpma= " + (sayi1 * sayi2));
                break;
            case "B":
                System.out.println(" bolme= " + (sayi1 / sayi2));
                break;

        }

        char islemChar=islem.charAt(0);
            switch (islem)//buranin tipi neyse case dekilerde o olmali
            {
                case "T":
                    System.out.println(" toplam= " + (sayi1 + sayi2));
                    break;
                case "C":
                    System.out.println(" cikarma= " + (sayi1 - sayi2));
                    break;
                case "P":
                    System.out.println(" carpma= " + (sayi1 * sayi2));
                    break;
                case "B":
                    System.out.println(" bolme= " + (sayi1 / sayi2));
                    break;

            }

            switch (islem.toLowerCase())//buranin tipi neyse case dekilerde o olmali
        {
            case "T": System.out.println(" toplam= " +(sayi1+sayi2) );break;
            case "C": System.out.println(" cikarma= " +(sayi1-sayi2) );break;
            case "P": System.out.println(" carpma= " +(sayi1*sayi2) );break;
            case "B": System.out.println(" bolme= " +(sayi1/sayi2) );break;



        }

    }
}
