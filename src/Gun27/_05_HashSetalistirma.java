package Gun27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _05_HashSetalistirma {

    public static void main(String[] args) {
        //soru-1: Bir HashSet random olarak 10 adet olacak şekilde 1 den 20 e
        // kadar olan sayılarla dolduran fonksiyonu yazınız.
        // Set i main de yazdırınız.

       HashSet<Integer> hs=generateSet();

        System.out.println("hs = " + hs);
        System.out.println("hs.size() = " + hs.size());//burada sayacta 10 adet random sayi oldugunu göruyoruz


        // Soru 2 : Bu SET i bir fonksiyonda diziye çeviriniz.
        // main de yazdırınız bu diziyi.
        Integer[] dizi=guzelllik(hs);
        System.out.println("dizi = " +Arrays.toString(dizi));

    }

    private static Integer[] guzelllik(HashSet<Integer> hs) {

        Integer [] dizi=new Integer[hs.size()];
        int index=0;
        for (int e:hs) {
            dizi[index]=e;
            index++;
        }

     return dizi;
    }

    private static HashSet<Integer> generateSet() {
        int sayi=0;
        HashSet<Integer> sayilar = new HashSet<>();
        while (sayilar.size()<10){

            sayi=(int) (Math.random()*20);
            sayilar.add(sayi);
        }

        return sayilar;
    }
}
