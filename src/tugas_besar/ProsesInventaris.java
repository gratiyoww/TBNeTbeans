package tugas_besar;

import java.util.Scanner;

public class ProsesInventaris {

    ControlInventaris ambil = new ControlInventaris();
    int luas;

    public void hitung_luas_ruang() {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan panjang ruang : ");
        ambil.setPanjang(input.nextInt());
        System.out.println("Masukkan lebar ruang : ");
        ambil.setLebar(input.nextInt());
        luas = ambil.getPanjang() * ambil.getLebar();
        System.out.println("luas : " + luas);
    }

    public void hitung_bentuk_ruang() {
        if (ambil.getPanjang() != luas) {
            String bentuk;
            bentuk = "persegi panjang";
            if (bentuk.equals("persegi panjang")) {
                System.out.println("bentuk ruangan adalah : " + bentuk);
                System.out.println("tidak sesuai");
            }
        } else {
            String bentuk = "persegi";
            System.out.println("bentuk ruangan adalah : " + bentuk);
        }
    }
    public void hitung_rasio_luas(){
        
    }
}
