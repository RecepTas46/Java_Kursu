package Gun24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _03_ArrayList {
    public static void main(String[] args) {
            int[] dizi={2,3,45,66}; // dizilerde başlangıç
            // değeri vererek tanımlama

            //ArrayList de başlangıç değerleri vererek aşağıdaki
            // gibi tanımlayabiliriz.


            // Array elaman tanimlama
            ArrayList<String> List1=new ArrayList<>()
            {
                    {
                            add("Almanca");
                            add("Ingilizce");
                            add("Turkce");
                            add("Rusca");
                            add("Rusca");

                    }

            };
            System.out.println("List1 = " + List1);

            ArrayList<String> List2=new ArrayList<>();


                           List2.add("Almanca");
                           List2.add("Ingilizce");
                           List2.add("Turkce");


            System.out.println("List2= " + List2);
         List1.addAll(List2);
         System.out.println("List2 = " + List1);

         List1.removeAll(List2);
            System.out.println("List1 = " + List1);


            if (List1.contains("Rusca"))
            {
                System.out.println("Rusca var" );
            }

    }
}