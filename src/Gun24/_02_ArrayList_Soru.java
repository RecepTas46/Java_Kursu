package Gun24;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_ArrayList_Soru {
    public static void main(String[] args) {

            // Bir öğretmenden girmek istediği kadar notu alınız, ve
            // ortalamayı geçen öğrenci sayısını bulunuz.
            Scanner oku =new Scanner(System.in);
            Scanner oku2 =new Scanner(System.in);
            String devamMi;


            ArrayList<Integer> arrayList=new ArrayList<>();
                do {
                        System.out.println("Not giriniz: ");
                        int ogrNot= oku.nextInt();
                        arrayList.add(ogrNot);

                        System.out.println("Devam (E/H)");
                        devamMi=oku2.next();




                }while (devamMi.equalsIgnoreCase("E"));

                int toplam=0;
            for (int i = 0; i <arrayList.size() ; i++)
            {
                    toplam+=arrayList.get(i);


            }
            int ort=toplam/arrayList.size();
            System.out.println("ort = " + ort);

            int ortGecenSayi=0;
            for (int i = 0; i <arrayList.size() ; i++)
            {
                    if (arrayList.get(i)>ort)
                            ortGecenSayi++;


            } System.out.println("ortGecenSayi = " + ortGecenSayi);

     }
}