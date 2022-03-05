package Gun10;

import java.util.Scanner;

public class _04_basamakVeSayTers {
    public static void main(String[] args) {

        // Girilen 3 basamaklı bir sayının basamaklarına göre tersini bir sayı olarak
        // ekrana yazdırınız.Örneğin 435 -> 534 sayı olarak bulunacak.

        Scanner oku=new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz:");
        int sayi=oku.nextInt(); // 435

        int birler= sayi%10; // 5
        int onlar = (sayi/10)%10; // 3
        int yuzler= sayi/100; // 4

        int tersi = birler*100 + onlar*10 + yuzler;

        System.out.println("tersi = " + tersi);

        System.out.println("ffffffffffffffffffffffffffffffff");
        //Girilen 4 basamaklı bir sayının basamaklarına göre tersini bir sayı olarak
        //ekrana yaziniz
        System.out.println(" 4 basamakli sayi yaz=");

        int yeniSayi=oku.nextInt();//2345

        int birlerb=yeniSayi%10;//5
        int onlarb=(yeniSayi/10)%10;//4
        int yüzlerb=(yeniSayi/100)%10;//3
        int binlerb=(yeniSayi/1000)%10;

        int tersii=birlerb*1000 +  onlarb*100+  yüzlerb*10+  binlerb;
        System.out.println("tersii = " + tersii);

        //Girilen 5 basamakli bir sayinin tersini ekrana yazdiriniz?

        System.out.println(" 5 basamakli sayi yaz=");

        int besHaneliSayi=oku.nextInt();
        int birlerB=besHaneliSayi%10;//5
        int onlarB=(besHaneliSayi/10)%10;//4
        int yüzlerB=(besHaneliSayi/100)%10;//3
        int binlerB=(besHaneliSayi/1000)%10;
        int onbinlerB=(besHaneliSayi/10000)%10;

        int BesHanenintersi=birlerB*10000+onlarB*1000+yüzlerB*100+binlerB*10+onbinlerB;
        System.out.println("BesHanenintersi = " + BesHanenintersi);


    }
}
