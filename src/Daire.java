import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {

        double r;
        double pi = 3.14, alan, cevre;

        System.out.println("Merhaba, Daire Çevre ve Alan Hesaplama Programına Hoş Geldiniz...");
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Çevre ve Alanını Hesaplamak İstediğiniz Dairenin Yarı Çapını Giriniz: ");
        r = input.nextDouble();

        cevre = (2*pi*r);
        alan = (pi*r*r);

        System.out.println("Dairenin Çevresi = " + cevre + "'dir...");
        System.out.println("Dairenin Alanı = " + alan + "'dir...");
    }
}
