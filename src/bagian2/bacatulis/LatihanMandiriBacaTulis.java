package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LatihanMandiriBacaTulis {

    public static void main(String[] args) {

        // 1. Menulis 5 nama hari ke file hari.txt
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {
            penulis.println("Senin");
            penulis.println("Selasa");
            penulis.println("Rabu");
            penulis.println("Kamis");
            penulis.println("Jum'at");

            System.out.println("=== Data Awal ===");
            System.out.println("5 nama hari berhasil ditulis ke hari.txt");
        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }

        // Membaca dan menampilkan isi file
        System.out.println("\nIsi hari.txt:");
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        // 2. Menambahkan 2 nama hari tanpa menghapus isi sebelumnya
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))) {
            penulis.println("Sabtu");
            penulis.println("Minggu");

            System.out.println("\n=== Data Setelah Append ===");
            System.out.println("2 nama hari berhasil ditambahkan.");
        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }

        // Menampilkan seluruh isi file setelah append
        System.out.println("\nIsi hari.txt setelah append:");
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        // 3. Menghitung jumlah baris
        int jumlahBaris = 0;

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            while (pembaca.readLine() != null) {
                jumlahBaris++;
            }

            System.out.println("\nJumlah baris dalam hari.txt = " + jumlahBaris);
        } catch (IOException e) {
            System.out.println("Gagal menghitung baris: " + e.getMessage());
        }
    }
}
