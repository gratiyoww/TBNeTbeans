package tugas_besar;

import java.util.Scanner;

public class Kenyamanan_Ruang_Kelas extends Identitas_Ruang_Kelas {

    Scanner input = new Scanner(System.in);

    @Override
    public void input_data() {
        System.out.println("Pilih Kondisi Kebisingan : ");
        System.out.println("1. bising \n2. tidak bising");
        System.out.print("Pilihan anda : ");
        super.setKebisingan(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih Kondisi Bau Ruangan : ");
        System.out.println("1. bau \n2. tidak bau");
        System.out.print("Pilihan anda : ");
        super.setBau(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih Kondisi Kebocoran Ruangan : ");
        System.out.println("1. bocor \n2. tidak bocor");
        System.out.print("Pilihan anda : ");
        super.setKebocoran(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih Konsisi Kerusakan Ruangan : ");
        System.out.println("1. rusak \n2. tidak rusak");
        System.out.print("Pilihan anda : ");
        super.setKerusakan(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih Kondisi Keausan Ruangan : ");
        System.out.println("1. aus \n2. tidak aus");
        System.out.print("Pilihan anda : ");
        super.setKeausan(input.nextInt());
        System.out.println("\n");
    }

    public String analisisbising() {
        if (super.getKebisingan()== 1) {
            return ("Tingkat Kebisingan = tidak Sesuai");
        } else {
            return ("Tingkat Kebisingan = sesuai");
        }

    }

    public String analisisbau() {

        if (super.getBau() == 1) {
            return ("Bau Ruangan = tidak Sesuai");
        } else {
            return ("Bau Ruangan = sesuai");
        }
    }

    public String analisisbocor() {

        if (super.getKebocoran() == 2) {
            return ("Tingkat Kebocoran = tidak Sesuai");
        } else {
            return ("Tingkat Kebocoran = sesuai");
        }
    }

    public String analisisrusak() {

        if (super.getKerusakan() == 1) {
            return ("Tingkat Kerusakan = tidak Sesuai");
        } else {
            return ("Tingkat Kerusakan = sesuai");
        }
    }

    public String analisisaus() {

        if (super.getKeausan() == 1) {
            return ("Tingkat Keausan = tidak Sesuai");
        } else {
            return ("Tingkat Keausan = sesuai");
        }
    }

    @Override
    public void tampil_data() {
        System.out.println("Kondisi Kebisingan : " + super.getKebisingan());
        System.out.println("Kondisi Bau Ruangan : " + super.getBau());
        System.out.println("Kondisi Kebocoran Ruangan : " + super.getKebocoran());
        System.out.println("Konsisi kerusakan Ruangan : " + super.getKerusakan());
        System.out.println("Kondisi Keausan Ruangan : " + super.getKeausan());
        System.out.println("");
    }
}