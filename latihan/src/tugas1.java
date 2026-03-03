import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Tinggi Ruangan (meter) = ");
        double t = input.nextDouble();
        System.out.print("Masukan Lebar Ruangan (meter) = ");
        double l = input.nextDouble();
        System.out.print("Masukan Panjang Ruangan (meter) = ");
        double p = input.nextDouble();
        Double luas = (2 * (p + l)) * t;
        System.out.printf("Luas Permukaan Tembok = %.2f m²%n", luas);
        System.out.println("Cat yang dibutuhkan = " + Math.ceil(luas / 10) + " Liter");
        input.close();
    }
}
