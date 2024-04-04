package Gun26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _Java2dArrayList {
    public static void main(String[] args) {
        /*******************/
        int sayi = 5; // tek bir rakam saklayabilen değişken
        int[] dizi = new int[5]; // 5 adet rakam saklayabilen değişken.
        int[][] tablo = new int[5][5]; // 5x5 lik 25 adet rakam saklayabilen değişken

        ArrayList<Integer> liste = new ArrayList<>(); // istenildiği kadar rakam eklenebilen değişken
        /*******************/

        int[][] tablo2 = new int[5][5]; //5x5 lik 25 adet rakam saklayabilen değişken

        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>(); // Listelerin listesi


        String[] dersler = new String[3];
        dersler[0] = "Matematik";
        dersler[1] = "Türkçe";
        dersler[2] = "Kimya";

        ArrayList<Integer> matNotlar = new ArrayList<>(); // bu bir liste
        matNotlar.add(90);
        matNotlar.add(80);
        matNotlar.add(70);

        ArrayList<Integer> turNotlar = new ArrayList<>(); // bu bir liste
        turNotlar.add(95);
        turNotlar.add(85);
        turNotlar.add(75);

        ArrayList<Integer> kimNotlar = new ArrayList<>(); // bu bir liste
        kimNotlar.add(60);
        kimNotlar.add(50);
        kimNotlar.add(40);
        kimNotlar.add(30);

        notlarListesi.add(matNotlar);
        notlarListesi.add(turNotlar);
        notlarListesi.add(kimNotlar);

        for (int i = 0; i < matNotlar.size(); i++) {
            System.out.println("matNotlar = " + matNotlar.get(i));
        }

        // tüm notlar
        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println(dersler[i]);
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.println((i + 1) + ".yapraktaki, " + (j + 1) + ".Not = " +
                        notlarListesi.get(i).get(j));  //satır sütun yapısı tablo[i][j]
            }
        }


        //Soru 1:Kullanicidan alinan ders nosuna göre ekrana
        // Notlarin listesini bir fonksiyona yaziniz

        Scanner oku = new Scanner(System.in);
        System.out.println("Ders No  (o=Mat,1=Tur,2=Kim) :");
        int dersNo = oku.nextByte();
        dersNotlariYazdir(notlarListesi, dersNo);
        //Soru 2:Yukarida girilen derse ait ortalamayi main de yazdiriniz

        int dersOrt = ortalamaYaz(notlarListesi, dersNo);
        System.out.println("dersOrt = " + dersOrt);

        //Soru 3:Tüm derslerin not ortalamasini mainde gonderin
        double tümdersOrt = tümOrtalamaYaz(notlarListesi);
        System.out.println("tümdersOrt = " + tümdersOrt);

        //Soru 4 : Kullacıdan alacağını sıradaki tüm derslerin notlarının ortalamasını bulunuz
        // yani tüm derailed 1.Sınavın ortalaması gibi, sınav bilgisini kullanıcıdan alınız
        System.out.println("sinav No=");
        int sinavNo = oku.nextInt();
        double sinavOrt = sinavOrtalamaYaz(notlarListesi, sinavNo);
        System.out.println("sinavNo = " + sinavNo);
        System.out.println("sinavOrt = " + sinavOrt);
        //1.ödev: en buyuk elamani ve en kucuk elamani bulunuz


        //2.odev: Recursive (özyinelemeci methodlar)konusu googleden ve youtuebeden arastirilacak ve ögrenilecek
        //3.odev:"aaabbccccdeeeff" seklinde verilen bir stringi yine string olarak "3a2b4c1d3e2f" seklinde yazdiran methodu yapiniz


    }


    private static double sinavOrtalamaYaz(ArrayList<ArrayList<Integer>> notlarListesi, int sinavNo) {
        double toplam = 0;
        int notMiktar = 0;
        for (int i = 0; i < notlarListesi.size(); i++) {

            if (sinavNo < notlarListesi.get(i).size()) {
                toplam = toplam + notlarListesi.get(i).get(sinavNo);
                notMiktar++;
            }

        }
        return toplam / notMiktar;
    }

    public static int tümOrtalamaYaz(ArrayList<ArrayList<Integer>> notlarListesi) {
        int toplam = 0;
        int notMiktari = 0;
        for (int i = 0; i < notlarListesi.size(); i++) {

            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                toplam += notlarListesi.get(i).get(j);
                notMiktari++;
            }
        }
        return toplam / notMiktari;
    }

    public static int ortalamaYaz(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo) {

        int toplam = 0;

        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            toplam += notlarListesi.get(dersNo).get(i);
        }
        return toplam / notlarListesi.get(dersNo).size();
    }

    public static void dersNotlariYazdir(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo) {
        System.out.println(notlarListesi.get(dersNo));
    }

}