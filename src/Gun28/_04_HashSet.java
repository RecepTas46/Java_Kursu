package Gun28;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _04_HashSet {
    public static void main(String[] args) {
//Soru 1 : bir metod oluşturup bir HashSet i
        // verilen bu numaralar ile doldurunuz [1, 2, 3, 4, 5, 5, 5, 6, 7, 8]
        // bu işlemi generateSet() metodunda yapınız.mainden yazdırınız.

        HashSet<Integer>hs=generateSet();
        System.out.println("hs = " + hs);

        // Soru 2: AddElements şeklinde ebir metodla 1 veya 1 den fazla sayı eklenebilen metodu
        // yazınız.
        AddElements(hs, 12,14);
         AddElements(hs, 1,2,3,4,5,101,102,103);
        AddElements(hs,65);
        System.out.println("hs = " + hs);
    }
    //dizi tipindeki,dizi,ArrayList,set ler fonksiyona gonderdiginizde,fonksiyona kendisi girdigi icin,yapilan degisiklikler
    //yapildigi icin bu degiskenleeri RETURN etmeye gere yok..
    public static void AddElements(HashSet<Integer>hs,Integer...sayilar){
        //1.yontem
        hs.addAll(Arrays.asList(sayilar));

        //2.yontem
        for (int i = 0; i < sayilar.length; i++) {
            hs.add(sayilar[i]);
        }
//return hs---->>>yapsa idik void yerine HashSet<Integer> yazacaktik ve yukardaki
        // AddElements onlerine hs= koyacaktik.
    }


    public static HashSet<Integer> generateSet(){
        Integer [] dizi= {1, 2, 3, 4, 5, 5, 5, 6, 7, 8};
        HashSet<Integer> hs=new HashSet<>(Arrays.asList(dizi));

        return hs;

    }
}
