package TugasArray2D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array2DPenjualan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // inisialisasi array 2 dimensi untuk menyimpan data penjualan
        int[][] dataPenjualan = new int[5][4];

        // inisialisasi data barang
        String[] namaBarang = {"Sabun", "Indomie Goreng", "Le Minerale", "Silverqueen", "Sunsilk 400ml"};
        int[] hargaBarang = {3000, 2500, 3000, 14000, 20000};

        // input data penjualan dari user
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.print("Masukkan jumlah " + namaBarang[i] + " yang dibeli: ");
            dataPenjualan[i][0] = Integer.parseInt(br.readLine());
            dataPenjualan[i][1] = hargaBarang[i];
            dataPenjualan[i][2] = dataPenjualan[i][0] * dataPenjualan[i][1];
        }

        // hitung total harga
        int totalHarga = 0;
        for (int i = 0; i < namaBarang.length; i++) {
            totalHarga += dataPenjualan[i][2];
        }

        // input uang dibayarkan dari user
        System.out.print("Masukkan uang yang dibayarkan: ");
        int uangDibayarkan = Integer.parseInt(br.readLine());

        // hitung kembalian
        int kembalian = uangDibayarkan - totalHarga;

        // tampilkan data penjualan
        System.out.println("\nData Penjualan:");
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "Nama Barang", "Qty", "Harga", "Total");
        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < namaBarang.length; i++) {
            if (dataPenjualan[i][0] != 0) {
                System.out.printf("%-20s %-10d %-10d %-10d\n", namaBarang[i], dataPenjualan[i][0], dataPenjualan[i][1], dataPenjualan[i][2]);
            }
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%-40s %-10d\n", "Grand Total", totalHarga);
        System.out.printf("%-40s %-10d\n", "Uang Dibayarkan", uangDibayarkan);
        System.out.printf("%-40s %-10d\n", "Kembali", kembalian);
    }
}

