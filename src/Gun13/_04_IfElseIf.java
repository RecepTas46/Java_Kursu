package Gun13;

import java.util.Scanner;

public class _04_IfElseIf {
    public static void main(String[] args) {
// Soru : Kullanıcıdan  Fizik: 90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.println("Ders ve Notu=");
        String dersNotu= oku.nextLine();
        int ögrNotu=Integer.parseInt(dersNotu.replaceAll("[^0-9]",""));
        String dersAdi=dersNotu.replaceAll("[0-9]","");

            System.out.println("ögrNotu="+ögrNotu);
        System.out.println("dersNotu="+dersAdi);

        if (ögrNotu>=90)
            System.out.println("A");
        else
            if (ögrNotu>=80)
            System.out.println("B");
            else
                if (ögrNotu>=70)
                 System.out.println("C");
                  else
                      if (ögrNotu>=60)
                     System.out.println("D");
                      else
                          if (ögrNotu>=40)
                       System.out.println("E");
                          else
                      System.out.println("F");


        }


    }

