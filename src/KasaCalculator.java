import java.util.Scanner;


public class KasaCalculator {
    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, toplam;

        Scanner input = new Scanner(System.in);

        System.out.println("Aldığınız Armut Kaç Kg ? = ");
        armutKg = input.nextDouble();
        System.out.println("Aldığınız Elma Kaç Kg ? = ");
        elmaKg = input.nextDouble();
        System.out.println("Aldığınız Domates Kaç Kg ? = ");
        domatesKg = input.nextDouble();
        System.out.println("Aldığınız Muz Kaç Kg ? = ");
        muzKg = input.nextDouble();
        System.out.println("Aldığınız Patlican Kaç Kg ? = ");
        patlicanKg = input.nextDouble();

        toplam = ((armut*armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg));

        System.out.println("Almış olduğunuz ürünlerin genel toplamı = " + toplam);



    }
}
