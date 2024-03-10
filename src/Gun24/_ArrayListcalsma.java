package Gun24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class _ArrayListcalsma {
    public static void main(String[] args) {
            // Kullanıcıdan alacağınız 6 elelamnlı bir dizinin
            // sadece tek elelamnlarını ayrı diziye bir metodda atayarak
            // main de yazdırınız.
            Scanner oku=new Scanner(System.in);
            System.out.println("aralarinda birer boslukla 6 sayi giriniz");

            int [] dizi =new int[6];

            for (int i = 0; i < dizi.length ; i++) {
                    dizi[i]= oku.nextInt();
            }


         tekElamanlar(dizi);
            ciftElamanlar(dizi);


     }
     public static void tekElamanlar(int[] dizi){
            ArrayList<Integer> list1=new ArrayList<>();
            int tek=0;
             for (int i = 0; i < dizi.length ; i++) {
                     if (dizi[i]%2==1)

                             tek++;
                  list1.add(i);

             }
             System.out.println("tek = " + tek);





     }
        public static void ciftElamanlar(int[] dizi) {
                ArrayList<Integer> list2=new ArrayList<>();

                int cift = 0;
                for (int i = 0; i < dizi.length; i++) {

                        if (dizi[i] % 2 == 0)
                                cift++;
                       list2.add(i);

                }
                System.out.println("cift = " + cift);

        }
}