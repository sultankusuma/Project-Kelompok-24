import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Operation operation = new Operation();
        operation.start();
    }
}

class Operation {
    public Scanner scanner;

    public Operation() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n== KAMUS KATA BY KELOMPOK 24 ==");
            System.out.println("1. Cari kata");
            System.out.println("2. Tampilkan semua kata");
            System.out.println("3. Hapus kata");
            System.out.println("4. Riwayat kata yang dihapus");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 5) {
                System.out.println("Terima kasih telah menggunakan kamus!");
                break;
            } else {
                System.out.println("Pilihan belum tersedia.");
            }
        }
    }
}  