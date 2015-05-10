package tugas_besar;

import java.util.Scanner;

public class JumlahKondisiPosisiSarana extends Identitas_Ruang_Kelas {

    Scanner input = new Scanner(System.in);

    @Override
    public void input_data() {

        System.out.println("Masukkan jumlah stop kontak(steker) : ");
        super.setJml_stop_kontak(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih kondisi stop kontak(steker) : ");
        System.out.println("1. Baik semua \n2. Rusak sebagian \n3. Rusak semua \n4. Tidak ada");
        super.setKon_stop_kontak(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih posisi stop kontak(steker) : ");
        System.out.println("1. Dipojok Ruang \n2.Dekat Dosen \n3.Diatap \n4.Dibawah");
        super.setPos_stop_kontak(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan jumlah kabel LCD : ");
        super.setJml_kbl_LCD(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih kondisi kabel LCD : ");
        System.out.println("1. Berfungsi \n2. Rusak sebagian \n3. Rusak semua \n4. Tidak ada");
        super.setKon_kbl_LCD(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih posisi kabel LCD : ");
        System.out.println("1. Dekat dosen \n2. Jauh dari dosen");
        super.setKon_kbl_LCD(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan jumlah lampu : ");
        super.setJml_lampu(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih kondisi lampu : ");
        System.out.println("1. Baik \n2.Rusak sebagian \n3.Rusak Semua \n4.Tidak Ada");
        super.setKon_lampu(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih posisi lampu : ");
        System.out.println("1. Atap ruang \n2. Belakang ruang \n3.Samping Ruang");
        super.setJml_kipas_angin(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan jumlah kipas angin : ");
        super.setJml_kipas_angin(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih kondisi kipas angin : ");
        System.out.println("1. Baik semua \n2. Rusak sebagian \n3. Rusak semua \n4. Tidak ada");
        super.setKon_kipas_angin(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih posisi kipas angin : ");
        System.out.println("1. Atap \n2. Dinding \n3. Kipas berdiri");
        super.setPos_kipas_angin(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan jumlah AC : ");
        super.setJml_ac(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih kondisi AC dalam ruangan : ");
        System.out.println("1. Baik \n2. Rusak sebagian \n3. Rusak semua \n4. Tidak ada");
        super.setKon_ac(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih posisi AC : ");
        System.out.println("1. Dibelakang \n2. Samping \n3. Depan");
        super.setPos_ac(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih SSID : ");
        System.out.println("1. UMM Hotspot \n2. Lab informatika ");
        super.setSsid(input.nextInt());
        System.out.println("\n");
        System.out.println("Apakah anda bisa Login ? ");
        System.out.println("1. Ya \n2. Tidak");
        super.setLogin(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan Bandwidth : ");
        super.setBandwith(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan jumlah CCTV : ");
        super.setJml_cctv(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih kondisi CCTV : ");
        System.out.println("1. Baik \n2. Rusak sebagian \n3.Rusak semua \n4. Tidak ada");
        super.setKon_cctv(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih posisi CCTV : ");
        System.out.println("1. Depan \n2. Samping \n3. Belakangan \n4. Tidak ada");
        super.setPos_cctv(input.nextInt());
        System.out.println("\n");

    }

    public String analisisKelistrikan() {
        if (super.getJml_stop_kontak()>=4 && super.getKon_stop_kontak() == 1 && super.getKon_stop_kontak() == 2 && super.getPos_stop_kontak() == 1 ){
            return ("Jumlah Stopkontak = Sesuai");  
        } else {
            return ("Jumlah Stopkontak = tidak sesuai");
        }
    }
    
    public String analisisLCD(){
        if (super.getJml_kbl_LCD()>=1 && super.getKon_kbl_LCD() ==1 && super.getPos_kbl_LCD() == 1){
            return ("Jumlah Kabel LCD = Sesuai");
        } else{
            return ("Jumlah Kabel LCD = tidak sesuai");
        }
    }
    
    public String analisislampu(){
        if (super.getJml_lampu() >= 18 && super.getKon_lampu() == 1 && super.getPos_lampu() == 1 ){
            return ("Jumlah Lampu = Sesuai");
        } else{
            return ("Jumlah Lampu = tidak sesuai");
        }
    }
    
    public String analisisKipasAngin() {
        if (super.getJml_kipas_angin()>= 2 && super.getKon_kipas_angin() == 1 && super.getPos_kipas_angin() == 1) {
            return ("Jumlah Kipas Angin = Sesuai");
        } else {
            return ("Jumlah Kipas Angin = tidak sesuai");
        }
    }

    public String analisisAC() {
        if (super.getJml_ac() >= 1 && super.getKon_ac() == 1 && super.getPos_ac() == 1 || super.getPos_ac() == 2) {
            return ("Jumlah AC = Sesuai");
        } else {
            return ("Jumlah AC = tidak sesuai");
        }
    }

    public String analisisInternet() {
        if (super.getSsid()== 1 && super.getLogin() == 1) {
            return ("SSID = Sesuai");
        } else {
            return ("SSID = tidak sesuai");
        }
    }

    public String analisisCCTV() {
        if (super.getJml_cctv()== 2 && super.getKon_cctv() == 1 && super.getPos_cctv() == 1 || super.getPos_cctv() == 3) {
            return ("Jumlah CCTV = Sesuai");
        } else {
            return ("Jumlah CCTV = tidak sesuai");
        }
    }

    @Override
    public void tampil_data() {

        JumlahKondisiPosisiSarana a = new JumlahKondisiPosisiSarana();
        System.out.println("Jumlah Stopkontak = " + super.getJml_stop_kontak());
        System.out.println("Kondisi Stopkontak = " + super.getKon_stop_kontak());
        System.out.println("Posisi Stopkontak = " + super.getPos_stop_kontak());
        System.out.println("Analisis Kelistrikan : " + a.analisisKelistrikan());
        System.out.println("--------------------------------------");
        System.out.println("Jumlah Kabel LCD = " + super.getJml_kbl_LCD());
        System.out.println("Kondisi Kabel LCD = " + super.getKon_kbl_LCD());
        System.out.println("Posisi Kabel LCD = " + super.getPos_kbl_LCD());
        System.out.println("Analisis LCD : " + a.analisisLCD());
        System.out.println("--------------------------------------");
        System.out.println("Jumlah Lampu = " + super.getJml_lampu());
        System.out.println("Kondisi Lampu = " + super.getKon_lampu());
        System.out.println("Posisi Lampu = " + super.getPos_lampu());
        System.out.println("Analisis Lampu : " + a.analisislampu());
        System.out.println("Jumlah Kipas Angin  = " + super.getJml_kipas_angin());
        System.out.println("Kondisi Kipas Angin = " + super.getKon_kipas_angin());
        System.out.println("Posisi Kipas Angin  = " + super.getPos_kipas_angin());
        System.out.println("Analisis Kipas Angin : " + a.analisisKipasAngin());
        System.out.println("--------------------------------------");
        System.out.println("Jumlah AC  = " + super.getJml_ac());
        System.out.println("Kondisi AC = " + super.getKon_ac());
        System.out.println("Posisi AC  = " + super.getPos_ac());
        System.out.println("Analisis AC : " + a.analisisAC());
        System.out.println("--------------------------------------");
        System.out.println("SSID      = " + super.getSsid());
        System.out.println("Bandwidth = " + super.getBandwith());
        System.out.println("Analisis Internet : " + a.analisisInternet());
        System.out.println("--------------------------------------");
        System.out.println("Jumlah CCTV   = " + super.getJml_cctv());
        System.out.println("Kondisi CCTV  = " + super.getKon_cctv());
        System.out.println("Posisi CCTV   = " + super.getPos_cctv());
        System.out.println("Analisis CCTV : " + a.analisisCCTV());
        System.out.println("--------------------------------------");

    }

}