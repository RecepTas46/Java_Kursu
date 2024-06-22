package Gun28;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _03_HashSet {
    public static void main(String[] args) {
// Hash algoritmasina bagli siralar
     HashSet<String>hs=new HashSet<>();

     hs.add("bir");
     hs.add("iki");
     hs.add("uc");
     hs.add("dort");
     hs.add("bes");
        System.out.println("hs = " + hs);// hs=(bes, dort, iki, bir, uc)


        //eklenme sirasina göre elamanalri tutuyor
        LinkedHashSet<String> lts=new LinkedHashSet<>();
       lts.add("bir");
       lts.add("iki");
       lts.add("uc");
       lts.add("dort");
       lts.add("bes");
        System.out.println("lts = " + lts);// lts=(bir, iki, uc, dort, bes)

        //alfabetik siraya gore saklar
        TreeSet<String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("uc");
        ts.add("dort");
        ts.add("bes");
        System.out.println("ts = " + ts);//ts=(bes, bir, dort, iki, uc)

        TreeSet<Integer> ts1=new TreeSet<>();
        ts1.add(1);
        ts1.add(12);
        ts1.add(13);
        ts1.add(11);
        ts1.add(10);
        System.out.println("ts1 = " + ts1);//ts1=(1, 10, 11, 12, 13)


    }
}
