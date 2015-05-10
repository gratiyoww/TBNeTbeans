package tugas_besar;

import java.util.Scanner;

public class Kondisi_Ruang_Kelas extends Identitas_Ruang_Kelas {

    Scanner input = new Scanner(System.in);

    @Override
    public void hitung_data() {
        System.out.println("Kondisi Ruang Kelas\n");
        System.out.println("Masukkan panjang ruangan : ");
        super.setPanjang(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan lebar ruangan : ");
        super.setLebar(input.nextInt());
        System.out.println("\n");
        System.out.println("masukan jumlah kursi : ");
        super.setJml_kursi(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan jumlah pintu : ");
        super.setJml_pintu(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan jumlah jendela : ");
        super.setJml_jendela(input.nextInt());
        System.out.println("\n");
    }

    public double Hitungluas() {
        return super.getPanjang() * super.getLebar();

    }

    public String BentukRuang() {
        if (super.getPanjang() == super.getLebar()) {
            return ("Bentuk Ruangan Persegi");
        } else {
            return ("Bentuk Ruangan Persegi Panjang");
        }

    }

    public double rasio() {
        return Hitungluas() / super.getJml_kursi();
    }

    public String AnalisaPintu() {
        if (super.getJml_pintu() >= 2) {
            return "Jumlah Pintu = Sesuai";
        } else {
            return "Jumlah Pintu = tidak sesuai";
        }
    }

    public String AnalisaJendela() {
        if (super.getJml_jendela() >= 1) {
            return "Jumlah Jendela = Sesuai";
        } else {
            return "Jumlah Jendela = Tidak Sesuai";
        }
    }

    @Override
    public void tampil_data() {
        Kondisi_Ruang_Kelas x = new Kondisi_Ruang_Kelas();
        System.out.println("Luas Ruang = " + x.Hitungluas());
        System.out.println("Bentuk Ruang = " + x.BentukRuang());
        System.out.println("Rasio Luas = " + x.rasio());
        System.out.println("Analisis Pintu = " + x.AnalisaPintu());
        System.out.println("Analisis Jendela =  " + x.AnalisaJendela());
        System.out.println("");
    }
}
