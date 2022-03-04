package Gun65.mainArgms;

public class mainArguments {
    public static void main(String[] args) {
        System.out.println("args[0] = " + args[0]);
        System.out.println("args[0] = " + args[1]);
        // programın başlangıcında parametre vermek için,
        //1- Önce programı RUN ediniz.
        //2-Menuden Run-> Edit Configuration a giriniz.
        //3-Program Argumnets satırına verilecek değerleri
        // arasında bir boşluk koyarak yazıp OK ye basınız.
        for (String s : args) {
            System.out.println("s = " + s);
        }
    }
}
