import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis suhu yang akan dikonversi:");
        System.out.println("1. Celsius ke Fahrenheit");
        System.out.println("2. Celsius ke Reamur");

        int pilihan = scanner.nextInt();

        System.out.print("Masukkan suhu dalam Celsius: ");
        double suhuCelsius = scanner.nextDouble();

        double hasilKonversi = 0;

        switch (pilihan) {
            case 1:
                hasilKonversi = celsiusKeFahrenheit(suhuCelsius);
                System.out.println("Hasil konversi: " + hasilKonversi + " Fahrenheit");
                break;
            case 2:
                hasilKonversi = celsiusKeReamur(suhuCelsius);
                System.out.println("Hasil konversi: " + hasilKonversi + " Reamur");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }        // Validasi kelipatan 2 dan 5
        if (validasiKelipatan(hasilKonversi, 2) && validasiKelipatan(hasilKonversi, 5)) {
            System.out.println("Hasil konversi merupakan kelipatan 2 dan 5.");
        } else {
            System.out.println("Hasil konversi tidak merupakan kelipatan 2 dan 5.");
        }
    }

    // Celsius ke Fahrenheit
    private static double celsiusKeFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // konversi Celsius ke Reamur
    private static double celsiusKeReamur(double celsius) {
        return celsius * 4 / 5;
    }

    // validasi kelipatan
    private static boolean validasiKelipatan(double nilai, int kelipatan) {
        return (nilai % kelipatan == 0);
    }
}


