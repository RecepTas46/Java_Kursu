package Gun12;

public class _02_03JavaTernary {
    public static void main(String[] args) {
        int x=5;

        System.out.println(x>2 ? x<4 ? 10 : 8 : 7);
        //eger iki tane soru isareti varsa birinci ve en son iki nokta baz alinir,sonra aradaki islem yapilir.
        //yani    x>2? [x<4? 10:8]:7 gibi dusunulur.  dogru sonuc iki noktanin solundaki islemdir.
        
        
    }
}
