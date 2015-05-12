package tugas_besar;

import java.util.Scanner;

public class Keamanan_Ruang_Kelas extends Identitas_Ruang_Kelas {

    Scanner input = new Scanner(System.in);

    @Override
    public void input_data() {
        System.out.println("Pilih kekokohan ruangan : ");
        System.out.println("1. kokoh \n2. tidak kokoh");
        System.out.print("Pilihan anda : ");
        super.setKekokohan(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih kunci pintu ruangan : ");
        System.out.println("1. ada \n2. tidak ada");
        System.out.print("Pilihan anda : ");
        super.setKun_pintu(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih kunci jendela ruangan : ");
        System.out.println("1. ada \n2. tidak ada");
        System.out.print("Pilihan anda : ");
        super.setKun_jendela(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih kondisi bahaya ruangan : ");
        System.out.println("1.aman \n2. tidak aman");
        System.out.print("Pilihan anda : ");
        super.setBahaya(input.nextInt());
        System.out.println("\n");
    }

    public String analisiskokoh() {

        if (super.getKekokohan() == 1) {
            return ("Tingkat Kekokohan = tidak Sesuai");
        } else {
            return ("Tingkat Kekokohan = sesuai");
        }
    }

    public String analisiskuncipintujendela() {

        if (super.getKun_pintu() == 1 && super.getKun_jendela() == 1) {
            return ("Kunci pintu = tidak Sesuai");
        } else {
            return ("Kunci pintu = sesuai");
        }
    }

    public String analisisaman() {
        if (super.getBahaya() == 1) {
            return ("Tingkat Keamanan Ruangan = tidak Sesuai");
        } else {
            return ("Tingkat Keamanan Ruangan = sesuai");
        }
    }

    @Override
    public void tampil_data() {
        System.out.println("Kekokohan ruangan      : " + super.getKekokohan());
        System.out.println("Kunci pintu ruangan    : " + super.getKun_pintu());
        System.out.println("Kunci jendela ruangan  : " + super.getKun_jendela());
        System.out.println("Kondisi bahaya ruangan : " + super.getBahaya());
    }
}
