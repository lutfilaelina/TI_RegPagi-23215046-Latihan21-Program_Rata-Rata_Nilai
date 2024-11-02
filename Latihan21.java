/*
 * @author 
 * NAMA     : Lutfi Laeli Nur Afiyah
 * KELAS    : Teknik Informatika 
 * NIM      : 23215046
 * Deskripsi Program : Program Rata-Rata Nilai
 */ 

package Pertemuan6;
import java.util.Scanner; 

public class Latihan21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        int totalNilai = 0;

        for (int i = 1; i <= jumlahMahasiswa; i++) { //Penjelasan(1)
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            totalNilai += input.nextInt(); //Penjelasan(2)
        }
        
        double rataRata = (double) totalNilai / jumlahMahasiswa; //Penjelasan(3)
        System.out.println("\nMaka, Rata-rata Nilainya adalah " + rataRata );//Penjelasan(4)
        System.out.println("Developed by : Lutfi Laeli Nur Afiyah"); 
    }
} 

/*PENJELASAN 
  (1) Di sini looping digunakan untuk menyesuaikan banyaknya mahasiswa yang akan dihitung nilainya,
      program akan meminta input nilai mahasiswa sebanyak jumlahMahasiswa yang telah terinput.
  (2) Di setiap perulangan, variabel totalNilai akan ditambahkan dengan input yang dimasukkan oleh user. 
  (3) totalNilai yang tadinya berisi integer, di-casiting agar berubah menjadi bertipe data double
      (bernilai desimal), sehingga ketika dibagi dengan variabel jumlahMahasiswa maka hasilnya akan 
      bertipe data double, hal ini dapat memberikan hasil perhitungan rataRata yang lebih akurat
  (4) Kemudian nilai rata-rata dari seluruh mahasiswa ditampilkan.

*/

