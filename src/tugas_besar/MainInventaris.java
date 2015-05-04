package tugas_besar;

import java.util.Scanner;

public class MainInventaris {

    public static void main(String[] args) {
        ProsesInventaris ambil = new ProsesInventaris();
        ControlInventaris ambil2 = new ControlInventaris();
        String nama, lokasi, fakultas;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama ruang : ");
        nama = input.nextLine();
        System.out.println("Masukkan lokasi ruang : ");
        lokasi = input.nextLine();
        System.out.println("Masukkan fakultas : ");
        fakultas = input.nextLine();
        ambil.hitung_luas_ruang();
        ambil.hitung_bentuk_ruang();
        //System.out.println("Masukkan jml kursi : ");
    }
}
