package Gun14;

import java.util.Scanner;

public class _02_WhileLoop {
    public static void main(String[] args) {

        // girilen bir sayiya kadar olan sayilarin toplamini bularak yazdiniriniz
        //girilen sayi dahil
        
        Scanner oku=new Scanner(System.in);
        
        System.out.println(" sayi giriniz=");
         int sayi=oku.nextInt();
        int yedekSayi=sayi;

         int toplam=0;
         while (sayi>0)
        {
            toplam=toplam+sayi;
            sayi--;
           // toplam=toplam+sayi--;//yukardaki 2 satirin yerine bu daha guzel olur
        }
        System.out.println("toplam = " + toplam);
        
        int sayac=0;
        toplam=0;
        while (sayac<=yedekSayi)
        {
            toplam=toplam+sayac;
            sayac++;
        }
        System.out.println("sayac = " + sayac);

        System.out.println("***********************");

          /*  // Girilen bir sayıya kadar olan sayıların toplamını bularak yazdırınız.
            // girilen sayı dahil

            Scanner oku = new Scanner(System.in);
            System.out.print("sayı giriniz =");
            int sayi=oku.nextInt(); //5
            int yedekSayi=sayi;

            int toplam=0;
            while(sayi>0)
            {
                toplam=toplam+sayi; // 5 9 12 14 15
                sayi--; // 5 4 3 2 1

                // toplam = toplam + sayi--; // yukarıdaki 2 satırın yerine bu hem de ne güzel olur.
            }

            System.out.println("toplam = " + toplam);

            // sayaclı hali
            int sayac=0;
            toplam = 0;
            while(sayac <= yedekSayi)
            {
                toplam=toplam+sayac; // 0,1,2,3,4,5
                sayac++;
            }

            System.out.println("toplam = " + toplam);*/

        }
    }

