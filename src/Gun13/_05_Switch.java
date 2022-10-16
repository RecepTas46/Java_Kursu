package Gun13;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        // Kullanıcının girdiği gün sayısına karşılık gelen gün adını yazınız.
        // 1.gün Pazartesi olsun
        Scanner oku = new Scanner(System.in);
        System.out.println("gunNo=");
        int gunNo = oku.nextInt();

        //if(gunNo==1)
        //System.out.println("Pazartesi");

        switch (gunNo){
            case 1:
                System.out.println("Pazartesi");
                break;
                case 2:
                System.out.println("sali");
                break;
                case 3:
                System.out.println("carsamba");
                break;
                case 4:
                System.out.println("persembe");
                break;
                case 5:
                System.out.println("cuma");
                break;
                case 6:
                System.out.println("cumartesi");
                break;
                case 7:
                System.out.println("Pazar");
                break;
            default://yukardakilerin disinda
                System.out.println("hatali deger");
        }
    }
}
