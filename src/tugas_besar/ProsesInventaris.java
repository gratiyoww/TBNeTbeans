package tugas_besar;

import java.util.Scanner;

public class ProsesInventaris extends ControlInventaris {

    Scanner input = new Scanner(System.in);
    int luas;

    public void input() {

        System.out.println("          SISTEM INVENTARIS KELAS             ");
        System.out.println("-----------------------------------------");
        System.out.print("Masukkan nama ruang   : ");
        super.setNama(input.nextLine());
        System.out.print("Masukkan lokasi ruang : ");
        super.setLokasi(input.nextLine());
        System.out.print("Masukkan fakultas     : ");
        super.setFakultas(input.nextLine());

        System.out.println("-----------------------------------------");
        System.out.print("Masukkan panjang ruang: ");
        super.setPanjang(input.nextInt());
        System.out.print("Masukkan lebar ruang  : ");
        super.setLebar(input.nextInt());
        System.out.print("Masukkan jumlah kursi : ");
        super.setJml_kursi(input.nextInt());
        System.out.print("Masukkan jumlah pintu : ");
        super.setJml_pintu(input.nextInt());
        System.out.print("Masukkan jumlah jendela : ");
        super.setJml_jendela(input.nextInt());

        System.out.println("-----------------------------------------");
        System.out.print("Masukkan jumlah stop kontak : ");
        super.setJml_skontak(input.nextInt());
        System.out.println("Masukkan kondisi stop kontak : \t1.Baik \t2.Buruk  ");
        super.setKondisiskontak(input.next());
        System.out.print("Masukkan posisi stop kontak : \t1.Dipojok ruang \t2.Dekat Dosen \t");
        super.setPosisi_skontak(input.next());
        System.out.println("\t");
        System.out.print("Masukkan jumlah kabel LCD : ");
        super.setJml_kLCD(input.nextInt());
        System.out.println("\t");
        System.out.print("Masukkan kondisi kabel LCD : \t1.Berfungsi \t2.Tidak Burfungsi");
        super.setKondisikLCD(input.next());
        System.out.println("\t");
        System.out.print("Masukkan posisi kabel LCD : \t1.Dekat Dosen \t2.Di Atas");
        super.setPosisi_kLCD(input.next());
        System.out.println("\t");
        System.out.print("Masukkan jumlah lampu : ");
        super.setJml_lampu(input.nextInt());
        System.out.println("\t");
        System.out.print("Masukkan kondisi lampu : \t1.Baik \t2.Buruk");
        super.setKondisilampu(input.next());
        System.out.println("\t");
        System.out.print("Masukkan posisi lampu : \t1.Atap ruangan \t2.Pojok Ruangan");
        super.setPosisi_lampu(input.next());
        System.out.println("\t");
        System.out.println("Input Jumlah Kipas Angin : ");
        super.setJumlahkipasangin(input.nextInt());
        System.out.println("\t");
        System.out.println("Input Kondisi Kipas Angin : \t1.Baik \t2.Buruk");
        super.setKondisikipasangin(input.next());
        System.out.println("\t");
        System.out.println("Input Posisi Kipas Angin : \t1.Atap ruangan \t2.Pojok Ruangan");
        super.setPosisikipasangin(input.next());
        System.out.println("\t");
        System.out.println("Input Jumlah AC  : ");
        super.setJumlahAC(input.nextInt());
        System.out.println("\t");
        System.out.println("Input Kondisi AC : \t1.Baik \t2.Buruk");
        super.setKondisiAC(input.next());
        System.out.println("\t");
        System.out.println("Input Posisi AC  : \t1.Dibelakang/Disamping \t2.Dipojok/Di atap");
        super.setPosisiAC(input.next());
        System.out.println("\t");
        System.out.println("Input SSID      : \t1.UMM Hotspot \t2.UMM Dome");
        super.setSSID(input.next());
        System.out.println("\t");
        System.out.println("Input Bandwidth : \t1.Bisa \t2.Tidak Bisa ");
        super.setBandwidth(input.next());
        System.out.println("\t");
        System.out.println("Input Jumlah CCTV  : ");
        super.setJumlahCCTV(input.nextInt());
        System.out.println("\t");
        System.out.println("Input Kondisi CCTV : \t1.Baik \t2.Buruk");
        super.setKondisiCCTV(input.next());
        System.out.println("\t");
        System.out.println("Input Posisi CCTV  : \t1.Depan/Belakang \t2.Atas/Bawah");
        super.setPosisiCCTV(input.next());
        System.out.println("\t");

        System.out.println("-----------------------------------------");
        System.out.println("Input Kondisi Lantai  : \t1.Bersih \t2.Kotor");
        super.setKondisilantai(input.next());
        System.out.println("\t");
        System.out.println("Input Kondisi Dinding : \t1.Bersih \t2.Kotor");
        super.setKondisidinding(input.next());
        System.out.println("\t");
        System.out.println("Input Kondisi Atap    : \t1.Bersih \t2.Kotor");
        super.setKondisiatap(input.next());
        System.out.println("\t");
        System.out.println("Input Kondisi Pintu   : \t1.Bersih \t2.Kotor");
        super.setKondisipintu(input.next());
        System.out.println("\t");
        System.out.println("Input Kondisi Jendela : \t1.Bersih \t2.Kotor");
        super.setKondisijendela(input.next());
        System.out.println("\t");

        System.out.println("-----------------------------------------");
        System.out.println("Input Sirkulasi Udara   : \t1.Lancar \t2.Tidak Lancar");
        super.setSirkulasiudara(input.next());
        System.out.println("\t");
        System.out.println("Input Nilai Pencahayaan : ");
        super.setNilaipencahayaan(input.nextInt());
        System.out.println("\t");
        System.out.println("Input Kelembapan        : ");
        super.setKelembapan(input.nextInt());
        System.out.println("\t");
        System.out.println("Input Suhu              : ");
        super.setSuhu(input.nextInt());
        System.out.println("\t");

        System.out.println("-----------------------------------------");
        System.out.println("Masukkan tingkat kebisingan?    : \t1.Tidak Bising \t2.Bising");
        super.setBising(input.next());
        System.out.println("\t");
        System.out.println("Masukkan bau? \t1.Tidak BAu \t2.Bau");
        super.setBau(input.next());
        System.out.println("\t");
        System.out.println("Masukkan kebocoran?             : \t1.Tidak Bocor \t2.Bocor");
        super.setBocor(input.next());
        System.out.println("\t");
        System.out.println("Masukkan kerusakan?             : \t1.Tidak Rusak \t2.Rusak");
        super.setRusak(input.next());
        System.out.println("\t");
        System.out.println("Masukkan aus?                   : \t1.Tidak Aus \t2.Aus");
        super.setAus(input.next());
        System.out.println("\t");

        System.out.println("-----------------------------------------");
        System.out.println("Masukkan Kekokohan?             : \t1.Kokoh? \t2.Tidak Kokoh");
        super.setKokoh(input.next());
        System.out.println("\t");
        System.out.println("Masukkan Pintu Kursi & Jendela? : \t1.Ada \t2.Tidak ada");
        super.setKuncipintujendela(input.next());
        System.out.println("\t");
        System.out.println("Masukkan Bahaya?                : \t1.Aman \t2.Bahaya");
        super.setBahaya(input.next());
        System.out.println("\t");

        System.out.println("-----------------------------------------");

    }

    public void tampil() {
        System.out.println("Nama ruang          : " + super.getNama());
        System.out.println("Lokasi ruang        : " + super.getLokasi());
        System.out.println("Fakultas            : " + super.getFakultas());

        System.out.println("-----------------------------------------");
        System.out.println("Panjang ruang       : " + super.getPanjang());
        System.out.println("Lebar ruang         : " + super.getLebar());
        System.out.println("Jumlah kursi        : " + super.getJml_kursi());
        System.out.println("Jumlah pintu        : " + super.getJml_pintu());
        System.out.println("Jumlah jendela      : " + super.getJml_jendela());

        System.out.println("-----------------------------------------");
        System.out.println("Jumlah stop kontak  : " + super.getJml_skontak());
        System.out.println("Kondisi stop kontak : " + super.getKondisiskontak());
        System.out.println("Posisi stop kontak  : " + super.getPosisi_skontak());
        System.out.println("Jumlah kabel LCD    : " + super.getJml_kLCD());
        System.out.println("Kondisi kabel LCD   : " + super.getKondisikLCD());
        System.out.println("Posisi kabel LCD    : " + super.getPosisi_kLCD());
        System.out.println("Jumlah lampu        : " + super.getJml_lampu());
        System.out.println("Kondisi lampu       : " + super.getKondisilampu());
        System.out.println("Posisi lampu        : " + super.getPosisi_lampu());
        System.out.println("Jumlah Kipas Angin  : " + super.getJumlahkipasangin());
        System.out.println("Kondisi kipas angin : " + super.getKondisikipasangin());
        System.out.println("Posisi kipas angin  : " + super.getPosisikipasangin());
        System.out.println("Jumlah AC           : " + super.getJumlahAC());
        System.out.println("Kondisi AC          : " + super.getKondisiAC());
        System.out.println("Posisi AC           : " + super.getPosisiAC());
        System.out.println("SSID                : " + super.getSSID());
        System.out.println("Bandwidth           : " + super.getBandwidth());
        System.out.println("Jumlah CCTV         : " + super.getJumlahCCTV());
        System.out.println("Kondisi CCTV        : " + super.getKondisiCCTV());
        System.out.println("Posisi CCTV         : " + super.getPosisiCCTV());

        System.out.println("-----------------------------------------");
        System.out.println("Kondisi Lantai      : " + super.getKondisilantai());
        System.out.println("Kondisi Dinding     : " + super.getKondisidinding());
        System.out.println("Kondisi Atap        : " + super.getKondisiatap());
        System.out.println("Kondisi Pintu       : " + super.getKondisipintu());
        System.out.println("Kondisi Jendela     : " + super.getKondisijendela());

        System.out.println("-----------------------------------------");
        System.out.println("Sirkulasi Udara     : " + super.getSirkulasiudara());
        System.out.println("Nilai Pencahayaan   : " + super.getNilaipencahayaan());
        System.out.println("Kelembapan          : " + super.getKelembapan());
        System.out.println("Suhu                : " + super.getSuhu());

        System.out.println("-----------------------------------------");
        System.out.println("Tingkat kebisingan  : " + super.getBising());
        System.out.println("Bau                 : " + super.getBau());
        System.out.println("Kebocoran           : " + super.getBocor());
        System.out.println("Kerusakan           : " + super.getRusak());
        System.out.println("Keausan             : " + super.getAus());

        System.out.println("-----------------------------------------");
        System.out.println("Kekokohan               : " + super.getKokoh());
        System.out.println("Kunci Pintu dan Jendela : " + super.getKuncipintujendela());
        System.out.println("Bahaya                  : " + super.getBahaya());

        System.out.println("-----------------------------------------");
    }

    public double hitung_luas_ruang() {
        return super.getPanjang() * super.getLebar();
    }

    public void hitung_bentuk_ruang() {
        String bentuk = "persegi panjang";;
        if (super.getPanjang() != super.getLebar()) {
            System.out.println(bentuk);
            if (bentuk == "persegi panjang") {
                System.out.println("Kriteria sesuai");
            }
        } else {
            System.out.println("Bentuk bukan persegi panjang");
        }
    }

    public double hitung_rasio_luas() {
        double rasio;
        rasio = hitung_luas_ruang() / super.getJml_kursi();
        if (rasio >= 0.5) {
            System.out.println("Kriteria sesuai");
        } else {
            System.out.println("Kriteria tidak sesuai");
        }
        return rasio;
    }

    public void analisis_pintu_dan_jendela() {

        if (super.getJml_pintu() >= 2 && super.getJml_jendela() >= 1) {
            System.out.println("-----------------------------------------");
            System.out.println("Kriteria sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Kriteria tidak sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public String analisis_kelistrikan() {

        if (super.getJml_skontak()>= 4 && super.getKondisiskontak().equals("baik") || super.getKondisiskontak().equals("buruk")&&super.getPosisi_skontak().equals("pojok")||super.getPosisi_skontak().equals("dekat")){
        return ("Kriteria sesuai");}
        else{
        return ("kriteria tidak sesuai");}
    }

    public void analisis_LCD() {

        if (super.getJml_kLCD() >= 1 && super.getKondisikLCD().equals("baik") || super.getKondisikLCD().equals("buruk")&& super.getPosisi_kLCD().equals("dekat")||super.getPosisi_kLCD().equals("jauh")) {
            System.out.println("-----------------------------------------");
            System.out.println("Kriteria sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Kriteria tidak sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisis_lampu() {

        if (super.getJml_lampu() >= 18 && super.getPosisi_lampu().equals("atap")||super.getPosisi_lampu().equals("pojok")&&super.getKondisilampu().equals("baik")||super.getKondisilampu().equals("buruk")) {
            System.out.println("-----------------------------------------");
            System.out.println("Kriteria sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Kriteria tidak sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisiskipasangin() {

        if (super.getJumlahkipasangin() <= 2 && super.getKondisikipasangin().equals("baik")||super.getKondisikipasangin().equals("buruk") && super.getPosisikipasangin().equals("atap")||super.getPosisikipasangin().equals("pojok")) {
            System.out.println("-----------------------------------------");
            System.out.println("Sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Tidak Sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisisAC() {
        if (super.getJumlahAC() <= 1 && super.getKondisiAC().equals("baik")||super.getKondisiAC().equals("buruk") && super.getPosisiAC().equals("belakang")||super.getPosisiAC().equals("atas")) {
            System.out.println("-----------------------------------------");
            System.out.println("Sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Tidak Sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisisinternet() {
        if (super.getSSID().equals("sesuai") && super.getBandwidth().equals("bisa")) {
            System.out.println("-----------------------------------------");
            System.out.println("Sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Tidak Sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisisCCTV() {
        if (super.getJumlahCCTV() == 2 && super.getKondisiCCTV().equals("baik") || super.getKondisiCCTV().equals("buruk") && super.getPosisiCCTV().equals("depan") || super.getPosisiCCTV().equals("bawah")) {
            System.out.println("-----------------------------------------");
            System.out.println("Sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("\tTidak Sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisiskebersihan() {
        if (super.getKondisilantai().equals("baik")||super.getKondisilantai().equals("buruk") && super.getKondisidinding().equals("baik")||super.getKondisidinding().equals("buruk") && super.getKondisiatap().equals("baik")||super.getKondisiatap().equals("buruk") && super.getKondisipintu().equals("baik")||super.getKondisipintu().equals("buruk") && super.getKondisijendela().equals("baik")||super.getKondisijendela().equals("buruk")) {
            System.out.println("-----------------------------------------");
            System.out.println("Sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Tidak Sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisissirkulasiudara() {
        if (super.getSirkulasiudara().equals("lancar")||super.getSirkulasiudara().equals("terhambat")) {
            System.out.println("-----------------------------------------");
            System.out.println("Sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Tidak Sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisispencahayaan() {

        if (super.getNilaipencahayaan() >= 250 && super.getNilaipencahayaan() <= 350) {
            System.out.println("-----------------------------------------");
            System.out.println("Sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Tidak Sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisiskelembapan() {
        if (super.getKelembapan() >= 70 && super.getKelembapan() <= 80) {
            System.out.println("-----------------------------------------");
            System.out.println("Sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Tidak Sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisis_Suhu() {
        if ((super.getSuhu() >= 25) && super.getSuhu() <= 35) {
            System.out.println("-----------------------------------------");
            System.out.println("sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("tidak sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisisbising() {

        if (super.getBising().equals("tidak")) {
            System.out.println("-----------------------------------------");
            System.out.println("Sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Tidak Sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisisbau() {

        if (super.getBau().equals("tidak")) {
            System.out.println("-----------------------------------------");
            System.out.println("Sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Tidak Sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisisbocor() {

        if (super.getBocor().equals("tidak")) {
            System.out.println("-----------------------------------------");
            System.out.println("Sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Tidak Sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisisrusak() {

        if (super.getRusak().equals("tidak")) {
            System.out.println("-----------------------------------------");
            System.out.println("Sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Tidak Sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisisaus() {

        if (super.getAus().equals("tidak")) {
            System.out.println("-----------------------------------------");
            System.out.println("Sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Tidak Sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisiskokoh() {

        if (super.getKokoh().equals("kokoh")) {
            System.out.println("-----------------------------------------");
            System.out.println("Sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("TIdak Sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisiskuncipintujendela() {

        if (super.getKuncipintujendela().equals("ada")) {
            System.out.println("-----------------------------------------");
            System.out.println("Sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Tidak Sesuai");
            System.out.println("-----------------------------------------");

        }
    }

    public void analisisaman() {

        if (super.getBahaya().equals("aman")) {
            System.out.println("-----------------------------------------");
            System.out.println("Sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Tidak Sesuai");
            System.out.println("-----------------------------------------");
        }
    }

}
