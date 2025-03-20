import java.util.Scanner;

public class DosenMain15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = input.nextInt();
        input.nextLine();

        DataDosen15 data = new DataDosen15(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode       : ");
            String kode = input.nextLine();
            System.out.print("Nama       : ");
            String nama = input.nextLine();
            System.out.print("Jenis Kelamin (true = Laki-laki, false = Perempuan): ");
            boolean jenisKelamin = input.nextBoolean();
            System.out.print("Usia       : ");
            int usia = input.nextInt();
            input.nextLine();

            data.tambah(new Dosen15(kode, nama, jenisKelamin, usia));
        }

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Sorting ASC (Bubble Sort)");
            System.out.println("3. Sorting DSC (Selection Sort)");
            System.out.println("4. Sorting DSC (Insertion Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\nData Dosen:");
                    data.tampil();
                    break;
                case 2:
                    data.sortingASC();
                    System.out.println("\nData Dosen Setelah Sorting ASC (Bubble Sort):");
                    data.tampil();
                    break;
                case 3:
                    data.sortingDSC();
                    System.out.println("\nData Dosen Setelah Sorting DSC (Selection Sort):");
                    data.tampil();
                    break;
                case 4:
                    data.insertionSort();
                    System.out.println("\nData Dosen Setelah Sorting DSC (Insertion Sort):");
                    data.tampil();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
}
