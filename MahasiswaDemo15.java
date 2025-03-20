import java.util.Scanner;

public class MahasiswaDemo15 {
    
    public static void main(String[] args) {

        Scanner input15 = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = input15.nextInt();
        input15.nextLine();
        
        MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15();

        Mahasiswa15[] arrayMahasiswa15 = new Mahasiswa15[jmlMhs];

        for (int i = 0; i< jmlMhs; i++){
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = input15.nextLine();
            System.out.print("Nama : ");
            String nama = input15.nextLine();
            System.out.print("IPK : ");
            double ipk = input15.nextDouble();
            input15.nextLine();
            System.out.print("Kelas : ");
            String kelas = input15.nextLine();
            System.out.println("---------------------------------------");
            arrayMahasiswa15[i] = new Mahasiswa15(nim, nama, kelas, ipk);
            list.tambah(arrayMahasiswa15[i]);
        }

        // System.out.println("Data Mahasiswa sebelum sorting: ");
        // list.tampil();

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC)  : ");
        // list.bubbleSort();
        // list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();

//         Mahasiswa15 m1 = new Mahasiswa15("123", "Zidan", "2A", 3.2);
//         Mahasiswa15 m2 = new Mahasiswa15("124", "Ayu", "2A", 3.5);
//         Mahasiswa15 m3 = new Mahasiswa15("125", "Sofi", "2A", 3.1);
//         Mahasiswa15 m4 = new Mahasiswa15("126", "Mita", "2A", 3.9);
//         Mahasiswa15 m5 = new Mahasiswa15("127", "Miki", "2A", 3.7);

//         list.tambah(m1);
//         list.tambah(m2);
//         list.tambah(m3);
//         list.tambah(m4);
//         list.tambah(m5);

//         System.out.println("Data Mahasiswa sebelum sorting: ");
//         list.tampil();

//         System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
//         list.bubbleSort();
//         list.tampil();
    }
}
