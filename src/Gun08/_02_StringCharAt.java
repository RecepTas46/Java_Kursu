package Gun08;

import java.util.Scanner;

public class _02_StringCharAt {
    public static void main(String[] args) {

        // İstenen noktadaki karakteri verir.
        // Karakterlerin sırası 0 (Sıfır) dan başlar bun index denir.
        //0123456789012
        String kelime="Merhaba Dünya";

        System.out.println("3.Harf = " + kelime.charAt(2) );

        char ilkHarf = kelime.charAt(0);
        System.out.println("ilkHarf = " + ilkHarf);

        //soru: Kullanıcıdan tek okumada alacağınız 2 kelimelik ad ve soyadı ekrana
        // sadece isim başHarf.soysimBasharf. şeklinde yazdırınız.
        // yani Ahmet Yılmaz -> A.Y. olarak yazdırınız.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Ad Soyad Giriniz: ");
        String adSoyad=scanner.nextLine();
        int bosluk=adSoyad.indexOf(' ');
        System.out.println("Ad basharfi ve Soyad basharf: "+adSoyad.toUpperCase().charAt(0)+"."+adSoyad.toUpperCase().charAt(bosluk+1)+".");

    }
}
