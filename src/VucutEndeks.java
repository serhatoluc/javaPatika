import java.util.Scanner;

public class VucutEndeks {
    public static void main(String[] args) {

        double boy, kilo, endeks;

        Scanner input = new Scanner(System.in);

        System.out.println("Vücut Kitle Endeksi Programına Hoş Geldiniz...");
        System.out.println("Lütfen Boyunuzu Giriniz: ");
        boy = input.nextDouble();
        System.out.println("Lütfen Kilonuzu Giriniz: ");
        kilo = input.nextDouble();

        endeks = (kilo / (boy*boy));

        System.out.println("Vücut Kitle Endeksiniz = " + endeks);
    }
}
