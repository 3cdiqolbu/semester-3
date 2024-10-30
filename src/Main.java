import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar menu yang tersedia
        MenuItem[] menu = {
                new MenuItem("Nasi Goreng", 25000),
                new MenuItem("Mie Goreng", 20000),
                new MenuItem("Ayam Bakar", 30000)
        };

        // Membuat nota baru dengan kapasitas tertentu
        Nota nota = new Nota(10);

        System.out.println("Selamat datang di MAKANI");
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %s - Rp %.2f\n", i + 1, menu[i].getNama(), menu[i].getHarga());
        }

        // Proses input pesanan dari user
        boolean lagi = true;
        while (lagi) {
            System.out.print("\nPilih menu (masukkan nomor): ");
            int pilihan = scanner.nextInt();
            if (pilihan < 1 || pilihan > menu.length) {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                continue;
            }

            System.out.print("Jumlah pesanan: ");
            int jumlahPesanan = scanner.nextInt();
            if (jumlahPesanan <= 0) {
                System.out.println("Jumlah pesanan harus lebih dari 0.");
                continue;
            }

            // Tambahkan item yang dipilih ke nota
            nota.tambahItem(menu[pilihan - 1], jumlahPesanan);

            // Tanya apakah ingin memesan item lain
            System.out.print("Ingin memesan lagi? (y/n): ");
            char tambah = scanner.next().charAt(0);
            lagi = (tambah == 'y' || tambah == 'Y');
        }

        // Cetak nota pemesanan
        nota.cetakNota();
        scanner.close();
    }
}

