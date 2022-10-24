package Gun16;

public class _02_forLoop {
    public static void main(String[] args) {

        int i= 0;
        while (i<5){
            System.out.println("w-i = " + i);
            i++;
        }
        //for döngüsü
        for (int j=0;j<5;j++)
        {


                System.out.println("f-j = " + j);
            }
        int toplam =0;
        for (int k=1;k<10;k++){
            toplam=toplam+k;
            System.out.println("k = " + k);
        }
        System.out.println("toplam = " + toplam);

    }
}
