package Gun14;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
        // Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner oku = new Scanner(System.in);

        String okunan= "";

        do
         {
             System.out.println(" harf giriniz");
             okunan=oku.next();
             System.out.println(" program calisiyor");



            }while (!okunan.equalsIgnoreCase("x"));
        System.out.println(" program bitti");
        }
    }

