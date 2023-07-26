package Gun14;

import java.util.Scanner;

public class  _05_DoWhile {
    public static void main(String[] args) {
         //kullanicidan sifir girilene kadar sayi isteyiniz
        //bu soruyu önce while ile ,sonra while ie cöznüz

        Scanner oku = new Scanner(System.in);


        int sayi;//ara parantezin disinda olmali,scope ye bak

        do {//do while döngüsü

            System.out.println("sayi giriniz=");
            sayi= oku.nextInt();
        }while (sayi!=0);
    }
}
