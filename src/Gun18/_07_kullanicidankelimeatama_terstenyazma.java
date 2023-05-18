package Gun18;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class _07_kullanicidankelimeatama_terstenyazma {
    public static void main(String[] args) {


        //1- Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
        // Kelimelerden en uzun olanının ilk ve son harfini Büyük ise küçük
        // küçük ise büyük hale getiriniz.
        Scanner oku = new Scanner(System.in);

      /*  String [] dizi = new String[5];

        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i + 1) + ".kelime");
            dizi[i] = oku.nextLine();

        }

        int enb= dizi.length;
        for (int i = 0; i < dizi.length; i++)
        {
          if (dizi[i].length()>enb)
            System.out.println("dizi = " +enb);

        }*/

      /*
      //2- Kullanıcıdan alacağınız bir cümlenin sadece ilk harflerini bir diziye atayınız.

        String [] cumle=new String[1];
        System.out.println("bir cumle giriniz:");
        int kelimeSayisi=0;

        for (int i = 0; i <cumle[i].length()-1 ; i++)
        {     cumle[i]=oku.nextLine();
                if (cumle[i].charAt(i) == ' ')
                    kelimeSayisi++;

            System.out.println("kelimeSayisi = " + cumle[i].charAt(i));



        }*/


     /*
     //3- Kullanıcıdana alacağınız bir cümlenin kelimelerini bir diziye atayınız.
        String[] dizi1 = new String[1];

        for (int j = 0; j < dizi1.length; j++) {
            System.out.println(" bir cümle giriniz= ");
            dizi1[j] = oku.nextLine();

            System.out.println("dizi1[0] = " + dizi1[j]);


        }
        */


        // 4-Kullanıcıdana alacağınız bir cümlenin kelimelerini tersten yazdiriniz
        System.out.println(" bir cumle giriniz:");
        String cumle = oku.nextLine();
        for (int j = cumle.length() - 1; j >= 0; j--) {
            System.out.print(cumle.charAt(j));

        }


    }
}
