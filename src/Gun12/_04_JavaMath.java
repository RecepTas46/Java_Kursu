package Gun12;

import java.util.Scanner;

public class _04_JavaMath {
    public static void main(String[] args) {

        //Math.max yöntemi ile girilen 3 sayidan buyuk olanini bulunz
        Scanner oku=new Scanner(System.in);
        System.out.println("a nin degeri=");
        int a= oku.nextInt();

        System.out.println("b degeri=");
        int b=oku.nextInt();
        System.out.println("c degeri=");
        int c=oku.nextInt();
        //1.yöntem
        int enb=Math.max(a,b);
        enb=Math.max(enb, c);
        System.out.println("enb="+ enb);

        //2.yöntem
        System.out.println("enb="+ Math.max(b,c));

        //3. yöntem
        enb=Math.max(a, Math.max(b,c));
        System.out.println("enb="+enb);





    }
}
