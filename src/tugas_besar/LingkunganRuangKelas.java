package tugas_besar;

import java.util.Scanner;

public class LingkunganRuangKelas extends Identitas_Ruang_Kelas {

    Scanner input = new Scanner(System.in);

    @Override
    public void input_data() {

        System.out.println("Kondisi lantai diruangan : ");
        System.out.println("1. Bersih \n2. Kotor");
        super.setKon_lantai(input.nextInt());
        System.out.println("\n");
        System.out.println("Kondisi dinding diruangan : ");
        System.out.println("1. Bersih \n2. Kotor");
        super.setKon_dinding(input.nextInt());
        System.out.println("\n");
        System.out.println("Kondisi Atap diruangan : ");
        System.out.println("1. Bersih \n2. Kotor");
        super.setKon_atap(input.nextInt());
        System.out.println("\n");
        System.out.println("Kondisi pintu diruangan : ");
        System.out.println("1. Bersih \n2. Kotor");
        super.setKon_pintu(input.nextInt());
        System.out.println("\n");
        System.out.println("Kondisi Jendela diruangan : ");
        System.out.println("1. Bersih \n2. Kotor");
        super.setKon_jendela(input.nextInt());
        System.out.println("\n");

    }

    public String analisisKebersihan() {
        if (super.getKon_lantai()== 1 && super.getKon_dinding() == 1 && super.getKon_atap() == 1 && super.getKon_pintu() == 1 && super.getKon_jendela() == 1) {
            return ("Kebersihan Ruangan = Sesuai");
        } else {
            return ("Kebersihan Ruangan = Tidak Sesuai");
        }
    }

    @Override
    public void tampil_data() {

        LingkunganRuangKelas b = new LingkunganRuangKelas();
        System.out.println("Kondisi Lantai  = " + super.getKon_lantai());
        System.out.println("Kondisi Dinding = " + super.getKon_dinding());
        System.out.println("Kondisi Atap    = " + super.getKon_atap());
        System.out.println("Kondisi Pintu   = " + super.getKon_pintu());
        System.out.println("Kondisi Jendela = " + super.getKon_jendela());
        System.out.println("Analisis Kebersihan : " + b.analisisKebersihan());
        System.out.println("--------------------------------------");

    }

}
