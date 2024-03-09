package Gun23;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {

        ortalamaBulYaz("ismet",69,56,87,98,90);
        ortalamaBulYaz("ahmet",45,56,57,88,70);
        ortalamaBulYaz("hakan",64,56,80,98,70);
        ortalamaBulYaz("furkan",60,59,27,48,50);

        
        
        ortalamaBulYaz2(44,60,55,8,56,99);
        System.out.println(" = ");
        
    }
    public static void ortalamaBulYaz(String isim,int...notlar){
        
        int toplam=0;
        for (int i = 0; i < notlar.length ; i++) {
            toplam += notlar[i];

            //  for (int not:notlar){//forecht

            //      toplam+=not;


        }        System.out.println(isim+ "  "+  "ortalama = " + toplam/ notlar.length);


    }
    public static void ortalamaBulYaz2(int yas,int...notlar)
    {
        System.out.println("yas="+ yas+ " \n "+"ögrenci notlari: "+Arrays.toString(notlar));
        
    }
    
}