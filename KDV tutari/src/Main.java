import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvTutar, kdvliTutar, oran1 = 0.18, oran2 = 0.08;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücreti Giriniz : ");
        tutar = input.nextDouble();

        double kdv = (tutar <= 1000) ? oran1 : oran2;

        kdvTutar = tutar * kdv;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: "+ kdv);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);
    }
}