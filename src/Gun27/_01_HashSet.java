package Gun27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _01_HashSet {
    public static void main(String[] args) {

        // tanimlandigi sekilde sabit elaman sayili
        int sayi=5; //Hafizada 1 rakamlik yer
        int [] dizi=new int[5];//Hafizada 5 rakamlik yer
        int [][] tablo=new int[5][5];//Hafizada 5x5=25 rakamlik yer

        // elaman sayisina gore dinamik olarak artan veya aazalabilen bir yapi gerekti
        ArrayList<Integer> Liste=new ArrayList<>();//dinamik buyuyebilen ve kuculebilen yapi
        ArrayList<ArrayList <Integer>> ListelerinListesi=new ArrayList<>();//listelerin listesi

        // bana tek tek artik elaman tutan bir liste veya degiskeni yerine
        //tekrarli elamanlara izin vermeyen bir yapi gerekiyorsa

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);
        System.out.println("list = " + list);

        //tekrarlara izin vermeyen elaman:HashSet

        HashSet<Integer> hs1=new HashSet<>();//Bu sekilde tanimlannir
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(3);
        hs1.add(4);
        hs1.add(2);

        boolean eklendiMi= hs1.add(4);//yukariya olan bir rakam eklemdiginde kabul etmiyor,eklenmiyor yani
        System.out.println("eklendiMi = " + eklendiMi);
        System.out.println("hs1 = " + hs1);

    }
}
