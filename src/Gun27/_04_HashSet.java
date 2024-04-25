package Gun27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class _04_HashSet {
    public static void main(String[] args) {

//soru-1: Bir HashSet random olarak 10 adet olacak şekilde 1 den 20 e
        // kadar olan sayılarla dolduran fonksiyonu yazınız.
        // Set i main de yazdırınız.
        HashSet<Integer> hs=generateSet();
        System.out.println("hs = " + hs);
        System.out.println("hs.size() = " + hs.size());

        // Soru 2 : Bu SET i bir fonksiyonda diziye çeviriniz.
        // main de yazdırınız bu diziyi.
        Integer[]dizi=convertToArray(hs);
        System.out.println("dizi " + Arrays.toString(dizi) );

    }
    public static HashSet<Integer> generateSet() {


        HashSet<Integer> sayilar = new HashSet<>();
        int sayi = 0;
        //  for (int i = 0; i < sayilar.size(); i++) {


        //    sayi = (int) (Math.random() * 20);
        //  sayilar.add(sayi);

        //}
        // return sayilar;

        while ((sayilar.size()<10))
        {
            sayi = (int) (Math.random() * 21);
            sayilar.add(sayi);
        }
        return sayilar;
    }


    public static Integer[] convertToArray(HashSet<Integer>hs) {
        //1. yontem
        Integer[] dizi=new Integer[hs.size()];
        int index=0;
        for(int e:hs)
        {
            dizi[index]=e;
            index++;
        }
        //2.yontem
        dizi=hs.toArray(new Integer[hs.size()]);
        return dizi;
    }
}
