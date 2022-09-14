package Gun12;

import java.util.Scanner;

public class _08_JavaRandom {
    public static void main(String[] args) {
        // Kullanıcıdan alt ve üst değeri  tek bir satırda arasında boşluk olarak (önce min bir boşluk
        // sonra max değeri) alarak sayı üretiniz ve ekrana yazdırınız.
        // 34 56 şeklinde tek bir satırda girecek min ve max ı   5,75  gibi

        Scanner scanner = new Scanner(System.in);
        System.out.print("min sayiyi giriniz= ");
        int min = scanner.nextInt();
        System.out.print("max sayiyi giriniz= ");
        int max = scanner.nextInt();
        System.out.println("Math.min(max,min)+\" , \"+Math.max(max,min) = " + Math.min(max, min) + "," + Math.max(max, min));
        int yeniRanS1 = (int) (Math.random() * ((max - min) + 1)) + min;
        int yeniRanS2 = (int) (Math.random() * ((max - min) + 1)) + max;
        System.out.println("min,max= " + yeniRanS1 + "," + yeniRanS2);
    }

}