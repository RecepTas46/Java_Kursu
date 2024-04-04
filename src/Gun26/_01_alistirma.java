package Gun26;

import java.util.ArrayList;
import java.util.Scanner;

import static Gun26._Java2dArrayList.ortalamaYaz;

public class _01_alistirma {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();

        String[] dersler = new String[3];
        dersler[0] = "Matematik";
        dersler[1] = "Turkce";
        dersler[2] = "Kimya";

        ArrayList<Integer> matNotlar = new ArrayList<>();
        matNotlar.add(76);
        matNotlar.add(89);
        matNotlar.add(65);

        ArrayList<Integer> turNotlar = new ArrayList<>();
        turNotlar.add(56);
        turNotlar.add(76);
        turNotlar.add(80);

        ArrayList<Integer> kimNotlar = new ArrayList<>();
        kimNotlar.add(65);
        kimNotlar.add(60);
        kimNotlar.add(88);
        kimNotlar.add(90);

        notlarListesi.add(matNotlar);
        notlarListesi.add(turNotlar);
        notlarListesi.add(kimNotlar);

        for (int i = 0; i < matNotlar.size(); i++) {

        }
        System.out.println("matNotlar = " + matNotlar);

        for (int i = 0; i < notlarListesi.size(); i++) {

            System.out.println("dersler[i] = " + dersler[i]);

        }
        System.out.println("notlarListesi = " + notlarListesi);
        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println(dersler[i]);

            for (int j = 0; j < notlarListesi.get(i).size(); j++) {

                System.out.println((i + 1) + ".yapraktaki," + (j + 1) + ".Not" + " = " + notlarListesi.get(i).get(j));

            }

        }
        //Soru 1:Kullanicidan alinan ders nosuna göre ekrana
        // Notlarin listesini bir fonksiyona yaziniz
        Scanner oku = new Scanner(System.in);
        System.out.println("Ders No=");
        int dersNo = oku.nextInt();
        notlarListesiYaz(notlarListesi, dersNo);
//Soru 2:Yukarida girilen derse ait ortalamayi main de yazdiriniz

        int dersOrt = ortalamaYaz(notlarListesi, dersNo);
        System.out.println("dersOrt = " + dersOrt);

        //Soru 3:Tüm derslerin not ortalamasini mainde gonderin

        double tumOrt = tumOrtalamaYaz(notlarListesi);
        System.out.println("tumOrt = " + tumOrt);


        //Soru 4 : Kullacıdan alacağını sıradaki tüm derslerin notlarının ortalamasını bulunuz
        // yani tüm derailed 1.Sınavın ortalaması gibi, sınav bilgisini kullanıcıdan alınız
        System.out.println("sinav no=");
        int sinvNo = oku.nextInt();

        int sinavOrtalama = sinavOrtalamaYaz(notlarListesi, sinvNo);
        System.out.println("sinavOrtalama = " + sinavOrtalama);

        //1.ödev: en buyuk elamani bulunuz
        int enb = enbElamaBul(notlarListesi);

        System.out.println("enb = " + enb);

        //en kucuk elamani bulunuz
        int enk = enkElamanBul(notlarListesi);
        System.out.println("enk = " + enk);
    }

    private static int enkElamanBul(ArrayList<ArrayList<Integer>> notlarListesi) {
        int enk = 100;
        for (int i = 0; i < notlarListesi.size(); i++) {
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                if (enk > notlarListesi.get(i).get(j)) {
                    enk = notlarListesi.get(i).get(j);

                }
            }
        }
        return enk;
    }


    private static int enbElamaBul(ArrayList<ArrayList<Integer>> notlarListesi) {
        int enb = 0;

        for (int i = 0; i < notlarListesi.size(); i++) {
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {

                if (enb < notlarListesi.get(i).get(j)) {
                    enb = notlarListesi.get(i).get(j);

                }

            }
        }
        return enb;
    }

    private static int sinavOrtalamaYaz(ArrayList<ArrayList<Integer>> notlarListesi, int sinvNo) {
        int toplam = 0;
        int girlnNot = 0;
        for (int i = 0; i < notlarListesi.size(); i++) {
            if (sinvNo < notlarListesi.get(i).size())
                toplam += notlarListesi.get(i).get(sinvNo);
            girlnNot++;
        }
        return toplam / girlnNot;
    }

    private static int tumOrtalamaYaz(ArrayList<ArrayList<Integer>> notlarListesi) {
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
            toplam++;

        }
        return toplam / notlarListesi.get(dersNo).size();

    }

    private static void notlarListesiYaz(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo) {

        System.out.println(notlarListesi.get(dersNo));
    }
}
