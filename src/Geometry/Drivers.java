package Geometry;
import java.util.Scanner;


public class Drivers {

    static Lingkaran L  = new Lingkaran();
    static Tabung T = new Tabung();
    static Persegi P = new Persegi();

    public static void Input(){
        int Jari,Long,Side ;
        Scanner g = new Scanner(System.in);
        System.out.print("Input Jari-Jari: ");
        Jari = g.nextInt();
        L.setJariJari(Jari);
        System.out.print("Input Tinggi: ");
        Long = g.nextInt();
        T.setJariJari(Jari);
        T.setTinggi(Long);
        System.out.print("Input Sisi: ");
        Side = g.nextInt();
        P.setSisi(Side);

    }

    public static void Lingkaran(){
        System.out.println("\n=== Lingkaran ===");
        System.out.printf("Luas Lingkaran Adalah: %.1f",L.luas());
        System.out.printf("\nKeliling Lingkaran Adalah: %.1f\n",L.Keliling());
        System.out.println();
    }

    public static void Tabung(){
        System.out.println("=== Tabung ===");
        System.out.printf("Volume Tabung Adalah: %.1f\n",T.getVolume());
        System.out.println();
    }

    public static void Persegi(){
        System.out.println("=== Persegi ===");
        System.out.printf("Luas Persegi Adalah: %.1f",P.luas());
        System.out.printf("\nKeliling Persegi Adalah: %.1f",P.Keliling());
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("====== Welcome ======");
        Input();
        Lingkaran();
        Tabung();
        Persegi();
    }
}
