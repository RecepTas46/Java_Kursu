package Gun16;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print(" cümle yaziniz=");
        String cümle=oku.nextLine();

        for (int i=0;i<cümle.length();i++)
        {

            if (cümle.charAt(i) == ' ')

                continue;//continue calistigi anda devam eden satirlar calismaz,ve sonraki adimdan devam eder

            System.out.println(cümle.charAt(i));
        }

        }

    }

