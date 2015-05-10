package tugas_besar;

import java.util.Scanner;

public class KebersihanRuangKelas extends Identitas_Ruang_Kelas {

    Scanner input = new Scanner(System.in);
    
    @Override
    public void input_data() {

        System.out.println("Input kondisi sirkulasi udara : ");
        System.out.println("1. Lancar \n2. Tidak lancar");
        super.setSirkulasi_udara(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan nilai pencahayaan : ");
        super.setNilai_pencahayaan(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan kelembapan : ");
        super.setKelembapan(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan suhu : ");
        super.setSuhu(input.nextInt());
        System.out.println("\n");

    }

    public String analisisSirkulasiUdara() {
        if (super.getSirkulasi_udara() == 1) {
            return ("Sirkulasi Udara = Sesuai");
        } else {
            return ("Sirkulasi Udara = Tidak Sesuai");
        }
    }

    public String analisisPencahayaan() {
        if (super.getNilai_pencahayaan() >= 250 && super.getNilai_pencahayaan() <= 350) {
            return ("Nilai Pencahayaan = Sesuai");
        } else {
            return ("Nilai Pencahayaan = Tidak Sesuai");
        }
    }

    public String analisisKelembapan() {
        if (super.getKelembapan() >= 70 && super.getKelembapan() <= 80) {
            return ("Kelembapan = Sesuai");
        } else {
            return ("Kelembapan = Tidak Sesuai");
        }
    }

    public String analisisSuhu() {
        if (super.getSuhu() >= 25 && super.getSuhu() <= 35) {
            return ("Suhu = Sesuai");
        } else {
            return ("Suhu = Tidak Sesuai");
        }
    }

    @Override
    public void tampil_data() {

        KebersihanRuangKelas c = new KebersihanRuangKelas();
        System.out.println("Sirkulasi Udara   = " + super.getSirkulasi_udara());
        System.out.println("Analisis Nilai Pencahayaan : " + c.analisisPencahayaan());
        System.out.println("--------------------------------------");
        System.out.println("Analisis Kelembapan        : " + c.analisisKelembapan());
        System.out.println("--------------------------------------");
        System.out.println("Analisis Suhu              : " + c.analisisSuhu());
        System.out.println("--------------------------------------");

    }

}