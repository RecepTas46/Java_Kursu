package Gun28;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class _02_HashSet {
    public static void main(String[] args) {

     Integer[] dizi=new  Integer[]{1,2,3,4,5};//bir dizi tanimladik
        HashSet<Integer> hs=new HashSet<>(Arrays.asList(dizi));

        HashSet<Integer> hs2=new HashSet<>(Arrays.asList(4,5,6,7,8));//diziyi Set e attik
HashSet<Object>jb=new HashSet<>(Arrays.asList(9,10,11,12,"asd"));

        System.out.println("hs = " + hs);
        System.out.println("hs2 = " + hs2);
        System.out.println("jb = " + jb);

        //ortak elamanlari bulma:kesisim
        HashSet<Integer>hsKesisim=new HashSet<>(hs);
        hsKesisim.retainAll(hs2);
        System.out.println("hsKesisim = " + hsKesisim);

        //farklarini bulma
        HashSet<Integer>hsFark=new HashSet<>();
        hsFark.addAll(hs);//hs hsFark a eklendi
        hsFark.removeAll(hs2);//farki bulmus oldu
        System.out.println("hsFark = " + hsFark);
    }
}
