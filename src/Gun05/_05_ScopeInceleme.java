package Gun05;

public class _05_ScopeInceleme {
    public static void main(String[] args) {
        int a=5; // a aşağıdaki scopun dışında olduğundan global gibi oluyor
        // her yerde geçerli oluyor.

        { //bu parantezlerin arasında tanımlanan değişkenler sadece burada geçerli olur
            // b sadece bu parantezler(Scope) arasında geçerli
            int b = 75;
            a = 7;
            int c=  34;
            System.out.println("b = " + b);
            System.out.println("a = " + a);
            System.out.println("c = " + c);
        }

        // b=75;  b değişkeni sadece yukarıdaki scope da geçerli

        System.out.println("a = " + a);
        // System.out.println("b = " + b); // b degiskeni sadece yukardaki Scope de gecerli

    }
}
