import java.util.Scanner;

public class BangunDatar {

    // Method untuk menghitung luas dan keliling persegi
    public static void hitungPersegi(double sisi) {
        double luas = sisi * sisi;
        double keliling = 4 * sisi;
        System.out.println("Masukkan sisi persegi: " + sisi);
        System.out.println("Luas persegi: " + luas);
        System.out.println("Keliling persegi: " + keliling);
    }

    // Method untuk menghitung luas dan keliling persegi panjang
    public static void hitungPersegiPanjang(double panjang, double lebar) {
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);
        System.out.println("Masukkan panjang persegi panjang: " + panjang);
        System.out.println("Masukkan lebar persegi panjang: " + lebar);
        System.out.println("Luas persegi panjang: " + luas);
        System.out.println("Keliling persegi panjang: " + keliling);
    }

    // Method untuk menghitung luas dan keliling lingkaran
    public static void hitungLingkaran(double jariJari) {
        double luas = Math.PI * jariJari * jariJari;
        double keliling = 2 * Math.PI * jariJari;
        System.out.println("Masukkan jari-jari lingkaran: " + jariJari);
        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");

        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                double sisi = input.nextDouble();
                hitungPersegi(sisi);
                break;

            case 2:
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebar = input.nextDouble();
                hitungPersegiPanjang(panjang, lebar);
                break;

            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = input.nextDouble();
                hitungLingkaran(jariJari);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        input.close();
    }
}