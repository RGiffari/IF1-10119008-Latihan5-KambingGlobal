package com.company;

/**
 *
 * @author
 * NAMA         : Raihan Giffari
 * KELAS        : PBO12
 * NIM          : 10119008
 * Deskripsi Program    : Program ini berisi penjumlahan antar method
 *
 */

public class KambingGlobal {

	// Variabel jumlah kambing menjadi variabel instance
        int jumlahKambing = 88;

    // Method untuk menampilkan jumlah kambing
        public void getJumlahKambing() {
            System.out.println("Jumlah kambing: " + jumlahKambing);
        }

        public void tambahKambing() {
            jumlahKambing = jumlahKambing + 5;
            System.out.println("Jumlah kambing setelah ditambah: " +
                    jumlahKambing);
        }
    public static void main(String[] args) {
            KambingGlobal kambingSusu = new KambingGlobal();
        // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();

        // Menambah satu kambing
        kambingSusu.tambahKambing();

        // Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();

    }
}
