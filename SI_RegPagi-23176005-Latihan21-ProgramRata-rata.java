/**
 * Nama                 : Khaerul Adzkia Alamsyah
 * Nim                  : 23176005
 * Prodi                : Sistem Informasi / Semester 3
 * Mata Kuliah          : PBO 1 / Pertemuan 6 / Latihan 21 - Program rata-rata nilai
 * Deskripsi Program    : Menghitung rata-rata nilai mahasiswa. 
                          Program ini meminta pengguna untuk memasukkan jumlah mahasiswa,
                          kemudian menggunakan loop for untuk mengumpulkan nilai setiap mahasiswa.
 * @author
 **/
package pertemuan.pkg6;
import java.util.Scanner;
public class Latihan21 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah mahasiswa
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        int jumlahMahasiswa = scanner.nextInt();

        // Deklarasi variabel untuk menyimpan total nilai
        double totalNilai = 0;

        // Meminta input nilai untuk setiap mahasiswa dan menjumlahkannya
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            double nilai = scanner.nextDouble();
            totalNilai += nilai;
        }

        // Menghitung rata-rata nilai
        double rataRataNilai = totalNilai / jumlahMahasiswa;

        // Menampilkan hasil
        System.out.println("\nMaka, Rata-rata Nilainya adalah " + rataRataNilai);
        System.out.println("Developed by : Khaerul Adzkia Alamsyah");

        scanner.close();
    }
}


