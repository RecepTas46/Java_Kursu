package Gun24;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
// ArrayList Collection grubunun bir elemanı
            // Array i sıralatırken Arrays.sort u kullandığımız gibi,
            // ArrayList i Collection metodlarını kullanacağız.
            ArrayList<Integer> rakamlar=new ArrayList<>();
            rakamlar.add(55);
            rakamlar.add(32);
            rakamlar.add(29);
            rakamlar.add(52);
            System.out.println("rakamlar = " + rakamlar);

              //kucukten buyuge siralar
            Collections.sort(rakamlar);
            System.out.println("rakamlar = " + rakamlar);
              //siralamayi tersine cevirir
            Collections.reverse(rakamlar);
            System.out.println("rakamlar = " + rakamlar);

            //max-min bulur
            System.out.println("rakamlar = " + Collections.max(rakamlar));
            System.out.println("rakamlar = " + Collections.min(rakamlar));

            //deger atar
            Collections.fill(rakamlar,8);
            System.out.println("rakamlar = " + rakamlar);

            //elamanin yerine yenisini ekler
            Collections.replaceAll(rakamlar,8,9);
            System.out.println("rakamlar = " + rakamlar);



     }
}