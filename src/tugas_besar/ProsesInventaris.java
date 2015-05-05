package tugas_besar;

import java.util.Scanner;

public class ProsesInventaris extends ControlInventaris {

    ControlInventaris ambil = new ControlInventaris();
    Scanner input = new Scanner(System.in);
    int luas;

    public void input() {

        System.out.println("          SISTEM INVENTARIS KELAS             ");
        System.out.println("-----------------------------------------");
        System.out.print("Masukkan nama ruang   : ");
        ambil.setNama(input.nextLine());
        System.out.print("Masukkan lokasi ruang : ");
        ambil.setLokasi(input.nextLine());
        System.out.print("Masukkan fakultas     : ");
        ambil.setFakultas(input.nextLine());

        System.out.println("-----------------------------------------");
        System.out.print("Masukkan panjang ruang: ");
        ambil.setPanjang(input.nextInt());
        System.out.print("Masukkan lebar ruang  : ");
        ambil.setLebar(input.nextInt());
        System.out.print("Masukkan jumlah kursi : ");
        ambil.setJml_kursi(input.nextInt());
        System.out.print("Masukkan jumlah pintu : ");
        ambil.setJml_pintu(input.nextInt());
        System.out.print("Masukkan jumlah jendela : ");
        ambil.setJml_jendela(input.nextInt());

        System.out.println("-----------------------------------------");
        System.out.print("Masukkan jumlah stop kontak : ");
        ambil.setJml_skontak(input.nextInt());
        System.out.println("Masukkan kondisi stop kontak : \t1.Baik \t2.Buruk  ");
        ambil.setKondisiskontak(input.next());
        System.out.print("Masukkan posisi stop kontak : \t1.Dipojok ruang \t2.Dekat Dosen \t");
        ambil.setPosisi_skontak(input.next());
        System.out.println("\t");
        System.out.print("Masukkan jumlah kabel LCD : ");
        ambil.setJml_kLCD(input.nextInt());
        System.out.println("\t");
        System.out.print("Masukkan kondisi kabel LCD : \t1.Berfungsi \t2.Tidak Burfungsi");
        ambil.setKondisikLCD(input.next());
        System.out.println("\t");
        System.out.print("Masukkan posisi kabel LCD : \t1.Dekat Dosen \t2.Di Atas");
        ambil.setPosisi_kLCD(input.next());
        System.out.println("\t");
        System.out.print("Masukkan jumlah lampu : ");
        ambil.setJml_lampu(input.nextInt());
        System.out.println("\t");
        System.out.print("Masukkan kondisi lampu : \t1.Baik \t2.Buruk");
        ambil.setKondisilampu(input.next());
        System.out.println("\t");
        System.out.print("Masukkan posisi lampu : \t1.Atap ruangan \t2.Pojok Ruangan");
        ambil.setPosisi_lampu(input.next());
        System.out.println("\t");
        System.out.println("Input Jumlah Kipas Angin : ");
        ambil.setJumlahkipasangin(input.nextInt());
        System.out.println("\t");
        System.out.println("Input Kondisi Kipas Angin : \t1.Baik \t2.Buruk");
        ambil.setKondisikipasangin(input.next());
        System.out.println("\t");
        System.out.println("Input Posisi Kipas Angin : \t1.Atap ruangan \t2.Pojok Ruangan");
        ambil.setPosisikipasangin(input.next());
        System.out.println("\t");
        System.out.println("Input Jumlah AC  : ");
        ambil.setJumlahAC(input.nextInt());
        System.out.println("\t");
        System.out.println("Input Kondisi AC : \t1.Baik \t2.Buruk");
        ambil.setKondisiAC(input.next());
        System.out.println("\t");
        System.out.println("Input Posisi AC  : \t1.Dibelakang/Disamping \t2.Dipojok/Di atap");
        ambil.setPosisiAC(input.next());
        System.out.println("\t");
        System.out.println("Input SSID      : \t1.UMM Hotspot \t2.UMM Dome");
        ambil.setSSID(input.next());
        System.out.println("\t");
        System.out.println("Input Bandwidth : \t1.Bisa \t2.Tidak Bisa ");
        ambil.setBandwidth(input.next());
        System.out.println("\t");
        System.out.println("Input Jumlah CCTV  : ");
        ambil.setJumlahCCTV(input.nextInt());
        System.out.println("\t");
        System.out.println("Input Kondisi CCTV : \t1.Baik \t2.Buruk");
        ambil.setKondisiCCTV(input.next());
        System.out.println("\t");
        System.out.println("Input Posisi CCTV  : \t1.Depan/Belakang \t2.Atas/Bawah");
        ambil.setPosisiCCTV(input.next());
        System.out.println("\t");

        System.out.println("-----------------------------------------");
        System.out.println("Input Kondisi Lantai  : \t1.Bersih \t2.Kotor");
        ambil.setKondisilantai(input.next());
        System.out.println("\t");
        System.out.println("Input Kondisi Dinding : \t1.Bersih \t2.Kotor");
        ambil.setKondisidinding(input.next());
        System.out.println("\t");
        System.out.println("Input Kondisi Atap    : \t1.Bersih \t2.Kotor");
        ambil.setKondisiatap(input.next());
        System.out.println("\t");
        System.out.println("Input Kondisi Pintu   : \t1.Bersih \t2.Kotor");
        ambil.setKondisipintu(input.next());
        System.out.println("\t");
        System.out.println("Input Kondisi Jendela : \t1.Bersih \t2.Kotor");
        ambil.setKondisijendela(input.next());
        System.out.println("\t");

        System.out.println("-----------------------------------------");
        System.out.println("Input Sirkulasi Udara   : \t1.Lancar \t2.Tidak Lancar");
        ambil.setSirkulasiudara(input.next());
        System.out.println("\t");
        System.out.println("Input Nilai Pencahayaan : ");
        ambil.setNilaipencahayaan(input.nextInt());
        System.out.println("\t");
        System.out.println("Input Kelembapan        : ");
        ambil.setKelembapan(input.nextInt());
        System.out.println("\t");
        System.out.println("Input Suhu              : ");
        ambil.setSuhu(input.nextInt());
        System.out.println("\t");

        System.out.println("-----------------------------------------");
        System.out.println("Masukkan tingkat kebisingan?    : \t1.Tidak Bising \t2.Bising");
        ambil.setBising(input.next());
        System.out.println("\t");
        System.out.println("Masukkan bau? \t1.Tidak BAu \t2.Bau");
        ambil.setBau(input.next());
        System.out.println("\t");
        System.out.println("Masukkan kebocoran?             : \t1.Tidak Bocor \t2.Bocor");
        ambil.setBocor(input.next());
        System.out.println("\t");
        System.out.println("Masukkan kerusakan?             : \t1.Tidak Rusak \t2.Rusak");
        ambil.setRusak(input.next());
        System.out.println("\t");
        System.out.println("Masukkan aus?                   : \t1.Tidak Aus \t2.Aus");
        ambil.setAus(input.next());
        System.out.println("\t");

        System.out.println("-----------------------------------------");
        System.out.println("Masukkan Kekokohan?             : \t1.Kokoh? \t2.Tidak Kokoh");
        ambil.setKokoh(input.next());
        System.out.println("\t");
        System.out.println("Masukkan Pintu Kursi & Jendela? : \t1.Ada \t2.Tidak ada");
        ambil.setKuncipintujendela(input.next());
        System.out.println("\t");
        System.out.println("Masukkan Bahaya?                : \t1.Aman \t2.Bahaya");
        ambil.setBahaya(input.next());
        System.out.println("\t");

        System.out.println("-----------------------------------------");

    }

    public void tampil() {
        System.out.println("Nama ruang          : " + ambil.getNama());
        System.out.println("Lokasi ruang        : " + ambil.getLokasi());
        System.out.println("Fakultas            : " + ambil.getFakultas());

        System.out.println("-----------------------------------------");
        System.out.println("Panjang ruang       : " + ambil.getPanjang());
        System.out.println("Lebar ruang         : " + ambil.getLebar());
        System.out.println("Jumlah kursi        : " + ambil.getJml_kursi());
        System.out.println("Jumlah pintu        : " + ambil.getJml_pintu());
        System.out.println("Jumlah jendela      : " + ambil.getJml_jendela());

        System.out.println("-----------------------------------------");
        System.out.println("Jumlah stop kontak  : " + ambil.getJml_skontak());
        System.out.println("Kondisi stop kontak : " + ambil.getKondisiskontak());
        System.out.println("Posisi stop kontak  : " + ambil.getPosisi_skontak());
        System.out.println("Jumlah kabel LCD    : " + ambil.getJml_kLCD());
        System.out.println("Kondisi kabel LCD   : " + ambil.getKondisikLCD());
        System.out.println("Posisi kabel LCD    : " + ambil.getPosisi_kLCD());
        System.out.println("Jumlah lampu        : " + ambil.getJml_lampu());
        System.out.println("Kondisi lampu       : " + ambil.getKondisilampu());
        System.out.println("Posisi lampu        : " + ambil.getPosisi_lampu());
        System.out.println("Jumlah Kipas Angin  : " + ambil.getJumlahkipasangin());
        System.out.println("Kondisi kipas angin : " + ambil.getKondisikipasangin());
        System.out.println("Posisi kipas angin  : " + ambil.getPosisikipasangin());
        System.out.println("Jumlah AC           : " + ambil.getJumlahAC());
        System.out.println("Kondisi AC          : " + ambil.getKondisiAC());
        System.out.println("Posisi AC           : " + ambil.getPosisiAC());
        System.out.println("SSID                : " + ambil.getSSID());
        System.out.println("Bandwidth           : " + ambil.getBandwidth());
        System.out.println("Jumlah CCTV         : " + ambil.getJumlahCCTV());
        System.out.println("Kondisi CCTV        : " + ambil.getKondisiCCTV());
        System.out.println("Posisi CCTV         : " + ambil.getPosisiCCTV());

        System.out.println("-----------------------------------------");
        System.out.println("Kondisi Lantai      : " + ambil.getKondisilantai());
        System.out.println("Kondisi Dinding     : " + ambil.getKondisidinding());
        System.out.println("Kondisi Atap        : " + ambil.getKondisiatap());
        System.out.println("Kondisi Pintu       : " + ambil.getKondisipintu());
        System.out.println("Kondisi Jendela     : " + ambil.getKondisijendela());

        System.out.println("-----------------------------------------");
        System.out.println("Sirkulasi Udara     : " + ambil.getSirkulasiudara());
        System.out.println("Nilai Pencahayaan   : " + ambil.getNilaipencahayaan());
        System.out.println("Kelembapan          : " + ambil.getKelembapan());
        System.out.println("Suhu                : " + ambil.getSuhu());

        System.out.println("-----------------------------------------");
        System.out.println("Tingkat kebisingan  : " + ambil.getBising());
        System.out.println("Bau                 : " + ambil.getBau());
        System.out.println("Kebocoran           : " + ambil.getBocor());
        System.out.println("Kerusakan           : " + ambil.getRusak());
        System.out.println("Keausan             : " + ambil.getAus());

        System.out.println("-----------------------------------------");
        System.out.println("Kekokohan               : " + ambil.getKokoh());
        System.out.println("Kunci Pintu dan Jendela : " + ambil.getKuncipintujendela());
        System.out.println("Bahaya                  : " + ambil.getBahaya());

        System.out.println("-----------------------------------------");
    }

    public double hitung_luas_ruang() {
        return ambil.getPanjang() * ambil.getLebar();
    }

    public void hitung_bentuk_ruang() {
        String bentuk = "persegi panjang";;
        if (ambil.getPanjang() != ambil.getLebar()) {
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
        rasio = hitung_luas_ruang() / ambil.getJml_kursi();
        if (rasio >= 0.5) {
            System.out.println("Kriteria sesuai");
        } else {
            System.out.println("Kriteria tidak sesuai");
        }
        return rasio;
    }

    public void analisis_pintu_dan_jendela() {

        if (ambil.getJml_pintu() >= 2 && ambil.getJml_jendela() >= 1) {
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

        if (ambil.getJml_skontak()>= 4 && ambil.getKondisiskontak().equals("baik") || ambil.getKondisiskontak().equals("buruk")&&ambil.getPosisi_skontak().equals("pojok")||ambil.getPosisi_skontak().equals("dekat")){
        return ("Kriteria sesuai");}
        else{
        return ("kriteria tidak sesuai");}
    }

    public void analisis_LCD() {

        if (ambil.getJml_kLCD() >= 1 && ambil.getKondisikLCD().equals("baik") || ambil.getKondisikLCD().equals("buruk")&& ambil.getPosisi_kLCD().equals("dekat")||ambil.getPosisi_kLCD().equals("jauh")) {
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

        if (ambil.getJml_lampu() >= 18 && ambil.getPosisi_lampu().equals("atap")||ambil.getPosisi_lampu().equals("pojok")&&ambil.getKondisilampu().equals("baik")||ambil.getKondisilampu().equals("buruk")) {
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

        if (ambil.getJumlahkipasangin() <= 2 && ambil.getKondisikipasangin().equals("baik")||ambil.getKondisikipasangin().equals("buruk") && ambil.getPosisikipasangin().equals("atap")||ambil.getPosisikipasangin().equals("pojok")) {
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
        if (ambil.getJumlahAC() <= 1 && ambil.getKondisiAC().equals("baik")||ambil.getKondisiAC().equals("buruk") && ambil.getPosisiAC().equals("belakang")||ambil.getPosisiAC().equals("atas")) {
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
        if (ambil.getSSID().equals("sesuai") && ambil.getBandwidth().equals("bisa")) {
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
        if (ambil.getJumlahCCTV() == 2 && ambil.getKondisiCCTV().equals("baik") || ambil.getKondisiCCTV().equals("buruk") && ambil.getPosisiCCTV().equals("depan") || ambil.getPosisiCCTV().equals("bawah")) {
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
        if (ambil.getKondisilantai().equals("baik")||ambil.getKondisilantai().equals("buruk") && ambil.getKondisidinding().equals("baik")||ambil.getKondisidinding().equals("buruk") && ambil.getKondisiatap().equals("baik")||ambil.getKondisiatap().equals("buruk") && ambil.getKondisipintu().equals("baik")||ambil.getKondisipintu().equals("buruk") && ambil.getKondisijendela().equals("baik")||ambil.getKondisijendela().equals("buruk")) {
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
        if (ambil.getSirkulasiudara().equals("lancar")||ambil.getSirkulasiudara().equals("terhambat")) {
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

        if (ambil.getNilaipencahayaan() >= 250 && ambil.getNilaipencahayaan() <= 350) {
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
        if (ambil.getKelembapan() >= 70 && ambil.getKelembapan() <= 80) {
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
        if ((ambil.getSuhu() >= 25) && ambil.getSuhu() <= 35) {
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

        if (ambil.getBising().equals("tidak")) {
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

        if (ambil.getBau().equals("tidak")) {
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

        if (ambil.getBocor().equals("tidak")) {
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

        if (ambil.getRusak().equals("tidak")) {
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

        if (ambil.getAus().equals("tidak")) {
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

        if (ambil.getKokoh().equals("kokoh")) {
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

        if (ambil.getKuncipintujendela().equals("ada")) {
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

        if (ambil.getBahaya().equals("aman")) {
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
