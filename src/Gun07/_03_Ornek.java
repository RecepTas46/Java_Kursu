package Gun07;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {

        // Girilen bir adı ekrana yazdırınız.

        Scanner adi=new Scanner(System.in);
        System.out.print("ad giriniz: ");
        String ad = adi.next();

        System.out.print("sayad giriniz: ");
        String soyad=adi.next();
        System.out.println("ad-soyad= " + ad+ " "+soyad +" ");


ad="Hakan";
soyad="Guntan";
        System.out.println("ad-soyad= "+ad+ " "+soyad +" ");

    }
}
