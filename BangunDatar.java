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
    }
}