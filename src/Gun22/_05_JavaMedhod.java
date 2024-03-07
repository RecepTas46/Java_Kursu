package Gun22;

import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaMedhod {
    public static void main(String[] args) {

        // Kullanıcıya aşağıdaki gibi bir menü çıkartarak sürekli değişkenleri alınız ve
// her bir menü elemanını değer alan fonksiyon olarak yazınız.
        /*  1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
        Bir işlem seçiniz */

        Scanner oku=new Scanner(System.in);
    int secim=0;

       do {
           menuYaz();
           secim= oku.nextInt();
           islemYap(secim);

       }while (secim<6);

    }
    public static void menuYaz(){

        System.out.println("******  Menu  *****");
        System.out.println("1-toplama");
        System.out.println("2-çıkarma");
        System.out.println("3-çarpma");
        System.out.println("4-bolme");
        System.out.println("5-Faktöryel");
        System.out.println("6-Çıkış");
        System.out.println("Seciniz:" );

    }

    public static void islemYap(int secim)
    {
        Scanner oku=new Scanner(System.in);
        int sayi1=0;
        int sayi2=0;
        switch (secim) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("1.sayi giriniz ");
                sayi1 = oku.nextInt();
                System.out.println("2.sayi giriniz ");
                sayi2 = oku.nextInt();
                break;
            case 5:
                System.out.println("1.sayi giriniz ");
                sayi1 = oku.nextInt();
                break;

        }
                //islem yapim bölümü
                switch (secim)
                {
                    case 1:toplama(sayi1,sayi2);break;
                    case 2:cikarma(sayi1,sayi2);break;
                    case 3:carpma(sayi1,sayi2);break;
                    case 4:bolme(sayi1,sayi2);break;
                    case 5:faktoriyel(sayi1);break;


                }
        }



    public static void toplama (int sayi1, int sayi2) {

        System.out.println("toplami = " + (sayi1 + sayi2));
    }

    private static void cikarma(int sayi1, int sayi2)
    {
        System.out.println("cikarma: = " + (sayi1-sayi2));
    }
    private static void carpma(int sayi1, int sayi2)
    {
        System.out.println("carpma:"+(sayi1*sayi2));
    }
    private static void bolme(int sayi1, int sayi2)
    {
        System.out.println("bolme= "+sayi1/sayi2);
    }
        private static void faktoriyel(int sayi1)
        {
            int sonuc=1;
            for (int i = 1; i <=sayi1 ; i++)
            {
                sonuc=sonuc*i;

            } System.out.println(sayi1+"!= "+sonuc);
        }

/*
public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int secim=0;

        do{
           menuYaz();
           secim=oku.nextInt();
           islemYap(secim);
        }while (secim<6);

    }

    public static void menuYaz(){
        System.out.println("****** Menü *******");
        System.out.println("1-toplama");
        System.out.println("2-çıkarma");
        System.out.println("3-çarpma");
        System.out.println("4-bölme");
        System.out.println("5-faktöryel");
        System.out.println("6-Çıkış");
        System.out.print("Seçiminiz=");
    }

    public static void islemYap(int secim)
    {
        Scanner oku=new Scanner(System.in);

        // okuma işlemi , kullanıcıdan veri alındı
        int sayi1=0;
        int sayi2=0;
        switch (secim)
        {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.print("1.Sayı = ");
                sayi1 = oku.nextInt();
                System.out.print("2.Sayı = ");
                sayi2 = oku.nextInt();
                break;

            case 5:
                System.out.print("1.Sayı = ");
                sayi1 = oku.nextInt();
                break;
        }

        // işlem yapma bölümü
        switch (secim)
        {
            case 1:toplama(sayi1,sayi2);break;
            case 2:cikarma(sayi1,sayi2);break;
            case 3:carpma(sayi1,sayi2);break;
            case 4:bolme(sayi1,sayi2);break;
            case 5:faktoryel(sayi1);break;
        }
    }

    public static void toplama(int a, int b){
        System.out.println((a+b));
    }
    public static void cikarma(int a, int b){
    }
    public static void carpma(int a, int b){
    }
    public static void bolme(int a, int b){
    }
    public static void faktoryel(int a){
    }
 */
        }