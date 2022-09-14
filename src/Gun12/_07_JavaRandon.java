package Gun12;

import java.util.Scanner;

public class _07_JavaRandon {
    public static void main(String[] args) {

        //kullanicidan al ve ust degeri isteyerek random uretiniz
        //ve uretilen sayiyi ekrana yansitiniz
        //(int) (Math.Random()*(max - min))+min

        Scanner oku=new Scanner(System.in);
        System.out.println("Min=");
        int min= oku.nextInt();
        System.out.println("max");
        int max= oku.nextInt();
        // 3 ile 7 arasi sayi uretmek istendiginde
        //min ne bakalim --->0* (0,99)+min=>3
        //max bakalim --->(0,99*(5)+min==>>4+3=7
        int numberInRange=(int)( Math.random()*(max-min)+1)+min;

        System.out.println("numberInRange=" + numberInRange);
    }
}
