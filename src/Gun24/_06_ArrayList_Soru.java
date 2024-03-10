package Gun24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _06_ArrayList_Soru {
    public static void main(String[] args) {

          // Kullanıcıdan alacağınız 6 elelamnlı bir dizinin
            // sadece tek elelamnlarını ayrı diziye bir metodda atayarak
            // main de yazdırınız.

            Scanner oku =new Scanner(System.in);
            System.out.println("Bir sayi giriniz:");
            int [] dizi=new int[6];
            for (int i = 0; i < dizi.length ; i++) {
                    dizi[i]= oku.nextInt();
            }
            tekElamanlar(dizi);
            ciftElamanlar(dizi);
     }
     public static void tekElamanlar(int[]sayi){
            ArrayList<Integer> Liste=new ArrayList<>();
             for (int i = 0; i < sayi.length ; i++) {
                     if (sayi[i]%2==1){
                             Liste.add(sayi[i] );

                     }
             }
            System.out.println("Liste = " + Liste);

         //return Liste;----->void yerine ArrayList<Integer> yazildiginda calisir



     }
     public static void ciftElamanlar(int[] dizi){
        ArrayList<Integer> list2=new ArrayList<>();
         for (int i = 0; i < dizi.length ; i++) {
             if (dizi[i]%2==0)
                 list2.add(dizi[i]);
         }
         System.out.println("list2 = " + list2);
     }
}