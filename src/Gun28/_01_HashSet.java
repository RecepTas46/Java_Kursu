package Gun28;

import java.util.HashSet;
import java.util.Iterator;

public class _01_HashSet {
    public static void main(String[] args) {

        HashSet<Integer>hs1 =new HashSet();//Sadece int alabilen(<> kaldirdik)

       HashSet<Object>hsObject=new HashSet<>();//bu sekilde object elamanlar alabilir
        HashSet hs2=new HashSet();// tipsiz oldu,hersey alir( GENEL OBJECT TIP OLMUS OLDU9
        hs2.add("12");//stringde bir object
        hs2.add(12);//sayida bir object
        hs2.add("ismet");//strinde bir object hersey eklenir

        HashSet<Integer> hs3=new HashSet<>();//sadece integer alabilen Set(Set genel adi)
        hs3.add(12);
        hs3.add(10);
        hs3.add(34);
        hs3.add(7);
        hs3.add(0);
        boolean eklendiMi=hs3.add(5);
        boolean eklendiMi1=hs3.add(34);
        boolean eklendiMi2=hs3.add(0);

//1.ekrana yazdirma
        System.out.println("hs3 = " + hs3);
        System.out.println("eklendiMi (5)= " + eklendiMi);
        System.out.println("eklendiMi1 (34)= " + eklendiMi1);
        System.out.println("eklendiMi2 (0)= " + eklendiMi2);
//2.yontem ekrana yazdirma
        for (Integer e:hs3) {

            System.out.println("e = " + e +" ");
        }

//3.yontem ekrana yazdirma
        Iterator gosterge=hs3.iterator();
        while (gosterge.hasNext()){

            Integer elaman =(Integer) gosterge.next();

            if (elaman==34){
                gosterge.remove();
            }
        }

        System.out.println("34 remove sonrasi hs3 = " + hs3);
hs3.remove(5);
        System.out.println("5 remove sonrasihs3 = " + hs3);

        if (hs3.contains(5))
            System.out.println("5 var hs3 de = " + hs3);
        else
            System.out.println(" 5 yok hs1 = " + hs1);

        hs3.clear();
        System.out.println("clear sonrasi hs3 = " + hs3);
    }
}
