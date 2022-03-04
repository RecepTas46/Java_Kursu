package Gun11;

import java.util.Scanner;

public class _04Ornek {
    public static void main(String[] args) {
        //yan yana aralarinda bir boslukla girilen 2 int sayinin
        //birbirine esit olup olmadigini bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.println("iki sayi giriniz bosluk birakarak aralarina=");
        String sayilar= oku.nextLine();


        int boslukIndex=sayilar.indexOf(" ");

        String strSayi1=sayilar.substring(0,boslukIndex);
        String strSayi12=sayilar.substring(boslukIndex+1);

        int sayi1=Integer.parseInt(strSayi1);
        int sayi2=Integer.parseInt(strSayi12);

        if (sayi1==sayi2){
            System.out.println("esit");
        }

            else
        {
            System.out.println("degil");
        }


    }
}
