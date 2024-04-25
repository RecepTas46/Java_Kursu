package Gun27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class _02_HashSet {
    public static void main(String[] args) {



        HashSet<String> renkler=new HashSet<>();//Bu sekilde tanimlannir
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("rED");
        renkler.add("red");

          //1.Yontem ekrana yazdirma
        System.out.println("renkler = " + renkler);

        //2. yöntem
        for (String s:renkler){
            System.out.println("renkler = " + s);
            
        }
        //3. YÖNTEM
        Iterator gosterge=renkler.iterator();//renkler isimli dizinin basina konumlaniyor
        while (gosterge.hasNext()) {//sonraki elaman vaarsa

         //   System.out.println("sonraki elaman = " + gosterge.next());
            //siradaki elamani göster -->>gosterge.remove();siradaki elamani siler

            if (gosterge.next()=="Blue")
                gosterge.remove();//o anda gösterdigi elamani siliyor
        }
            renkler.remove("Red");//bir elaman siler
            System.out.println("Red remove sonrasi = " + renkler);

            renkler.clear();
            System.out.println("clear sonrasi = " + renkler);

    }
}
