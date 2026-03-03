import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan total detik: ");
        int detik = input.nextInt();

        int jam = detik / 3600, sisaDetik = detik % 3600;
        int menit = sisaDetik / 60, detikSisa = sisaDetik % 60;

        System.out.printf("Hasil konversi: %d Jam, %d Menit, %d Detik", jam, menit, detikSisa);
        input.close();
    }
}
