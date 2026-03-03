import java.util.Scanner;

public class hitungGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==========Sistem Payroll===========");
        System.out.print("Masukan Nama\t:");
        String nama = input.nextLine();

        System.out.print("Masukan Gaji Pokok (Rp)\t:");
        double gaji = input.nextDouble();

        System.out.print("Jumlah Jam Lembur\t:");
        int jam = input.nextInt();

        double upahLembur = gaji / 173, totalUangLembur = jam * upahLembur, bruto = gaji + totalUangLembur,
                pajakPenghasilan = 0.05 * bruto, bpjs = 0.01 * gaji, gajiBersih = bruto - pajakPenghasilan - bpjs;

        System.out.println("\n=== SLIP GAJI ===");
        System.out.println("Karyawan           : " + nama);
        System.out.printf("Upah Lembur/Jam    : Rp %.2f%n", upahLembur);
        System.out.printf("Total Uang Lembur  : Rp %.2f%n", totalUangLembur);
        System.out.printf("Gaji Bruto         : Rp %.2f%n", bruto);
        System.out.println("-----------------------------------");
        System.out.printf("Potongan Pajak (5%%): Rp %.2f%n", pajakPenghasilan);
        System.out.printf("Potongan BPJS (1%%) : Rp %.2f%n", bpjs);
        System.out.println("-----------------------------------");
        System.out.printf("GAJI BERSIH        : Rp %.2f%n", gajiBersih);
        System.out.println("===================================");

        input.close();
    }
}
