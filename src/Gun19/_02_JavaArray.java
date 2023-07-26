package Gun19;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        //Kullanıcnın gireceği 20 sayıyı bir diziye attıktan sonra
        //bir sonraki kendisinden büyük kaç sayı olduğunu bulunuz ?
        
        Scanner oku=new Scanner(System.in);
       int [] dizi=new int[5];//5 denemesi kolay olsun diye yazildi
       
         int Miktar=0;
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ".sayi=");
            dizi[i] = oku.nextInt();
        }
            for (int i = 0; i < dizi.length-1; i++) {

                if (dizi[i] > dizi[i + 1])
                    Miktar++;

            }

        System.out.println("Miktar = " + Miktar);

         


    }
}
