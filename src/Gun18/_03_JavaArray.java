package Gun18;

public class _03_JavaArray {
    public static void main(String[] args) {
        // diziler asagidaki gibi tanimlanabilir
        int[] dizi1=new  int[5];
        int[] dizi2={5,77,786,0,-1,4,5,6,7,323,4,55,677};//elaman sayisina kadar uzunkukta dizi tanimlandi

        String[]  dizi3=new String[5];//String tipinde 5 elamanili ici bos dizi tanimlaadik
        boolean[] dizi4 =new boolean[6];//booelen tipinde 6 elamanli dizi tanimlandi
        double [] dizi5=new double[5];//double cinsinden 5 elamanli dizi tanimlandi

        for (int i = 0; i < dizi1.length; i++)
            System.out.println("dizi1 (int) = "+ dizi1[i]);

        for (int i = 0; i < dizi2.length; i++)
            System.out.println("dizi2 (int) = "+ dizi2[i]);

        for (int i = 0; i < dizi3.length; i++)
            System.out.println("dizi3 (int) = "+ dizi3[i]);

        for (int i = 0; i < dizi4.length; i++)
            System.out.println("dizi4 (int) = "+ dizi4[i]);

        for (int i = 0; i < dizi5.length; i++)
            System.out.println("dizi5 (int) = "+ dizi5[i]);


    }
}
