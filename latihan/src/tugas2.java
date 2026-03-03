import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Celcius = ");
        double c = input.nextDouble();
        double f = (c * 9 / 5) + 32, k = c + 273.15, r = c * 9 / 5;
        System.out.printf("Celsius ke Fahrenheit = %.2f%n", f);
        System.out.printf("Celsius ke Kelvin = %.2f%n", k);
        System.out.printf("Celsius ke Reamur = %.2f%n", r);
        input.close();
    }
}
