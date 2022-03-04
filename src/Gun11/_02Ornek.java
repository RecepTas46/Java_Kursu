package Gun11;

import java.util.Scanner;

public class _02Ornek {
    public static void main(String[] args) {
// Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // hayır yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("bir cumle giriniz=");
        String cumle= oku.nextLine();

        if(cumle.length()> 10 && cumle.toLowerCase().contains("study")){
            System.out.println("evet");
        }
        else
        {
            System.out.println("hayir");
        }
    }
}
