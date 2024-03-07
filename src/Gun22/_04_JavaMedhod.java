package Gun22;

import java.util.Arrays;
import java.util.Scanner;

public class _04_JavaMedhod {
    public static void main(String[] args) {

        // String şeklinde aralarında boşluklarla girilen bir dizinin
        // enbüyük, enküçük elemanını, bütün elemanların toplamını,
        // sayıların ortalamasını ayrı ayrı metodlarda yapınız.
        // 3 4 12 45 67  gibi giriş yapılacak.

    /*    Scanner oku=new Scanner(System.in);
        System.out.println("sayilari birer boslukla giriniz;");
        String cümleDizi= oku.nextLine();

        String [] strDizi=cümleDizi.split("");//String diziye cevrildi
        int [] intDizi=new int[strDizi.length];

        // rakam halleri yeni diziye atandi
        for (int i = 0; i < strDizi.length ; i++)
        {
            intDizi[i]=Integer.parseInt(strDizi[i]);

        }

        enBuyuk(intDizi);
        enKucuk(intDizi);
        tumTopla(intDizi);
        ortalamaBul(intDizi);


    }
    public static void enBuyuk(int dizi[]){//ismi ayni olmak zorunda degil
        Arrays.sort(dizi);
        System.out.println("enb= " + dizi[dizi.length-1]);

    }



    public static void enKucuk(int dizi[])
    {
        Arrays.sort(dizi);
        System.out.println("enk = " + dizi[0]);

    }

    public static void tumTopla(int dizi[])
    {
        int toplam=0;
        for (int i = 0; i < dizi.length ; i++)
        {
            toplam+=dizi[i];

            System.out.println("toplam = " + toplam);

        }


    }
    public static void ortalamaBul(int dizi[])
    {
       int toplam=0;
        for (int i = 0; i < dizi.length ; i++) {
            toplam += dizi[i];
            System.out.println("ortalama = " + toplam / dizi.length);
        }
    */

        // String şeklinde aralarında boşluklarla girilen bir dizinin
        // enbüyük, enküçük elemanını, bütün elemanların toplamını,
        // sayıların ortalamasını ayrı ayrı metodlarda yapınız.
        // 3 4 12 45 67  gibi giriş yapılacak.
        Scanner oku = new Scanner(System.in);
        System.out.println("Aralarinda bosluklarla girilen biri dizi giriniz:");
        String kelimeDizi=oku.nextLine();

    String [] yeniDizi=kelimeDizi.split(" ");
    int [] sayiDizi=new int[yeniDizi.length];

        for (int i = 0; i <yeniDizi.length ; i++)
        {
            sayiDizi[i]=Integer.parseInt(yeniDizi[i]);
        }

    enBuyuk(sayiDizi);
    enKucuk(sayiDizi);
    toplam(sayiDizi);
    ortalama(sayiDizi);


    }
    public static void enBuyuk(int dizi[])
    {
        Arrays.sort(dizi);
        System.out.println("enb=" +dizi[dizi.length-1]);
    }
    public static void enKucuk(int dizi[])
    {
        Arrays.sort(dizi);
        System.out.println("enk=" +dizi[0]);
    }
    public static void toplam (int dizi[])
    {
        int topla=0;
        for (int i = 0; i < dizi.length ; i++)
        {
            topla=topla+dizi[i];


        }            System.out.println("topla = " + topla);

    }
    public static void ortalama (int dizi[])
    {
        int topla=0;
        for (int i = 0; i < dizi.length ; i++)
        {
            topla=topla+dizi[i];


        }            System.out.println("ortalama = " + topla/ dizi.length);


    }
}
