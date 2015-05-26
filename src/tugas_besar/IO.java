package tugas_besar;

import java.util.Scanner;
import java.io.*;

public class IO extends identitas implements myinterface {

    Scanner input = new Scanner(System.in);
    control konstruktor1 = new control();
    control konstruktor2 = new control();
    control konstruktor3 = new control();
    control konstruktor4 = new control();
    control konstruktor5 = new control();
    control konstruktor6 = new control();
    control konstruktor7 = new control();
    control kontrol = new control();

    @Override
    public void input_identitas() {

        System.out.println("Masukkan nama ruang : ");
        kontrol.setNamaruang(input.next());
        System.out.println("Masukkan lokasi ruang : ");
        kontrol.setLokasiruang(input.next());
        System.out.println("Masukkan jurusan : ");
        kontrol.setStudi(input.next());
        System.out.println("Masukkan fakultas : ");
        kontrol.setFakultas(input.next());
        konstruktor1 = new control(kontrol.getNamaruang(), kontrol.getLokasiruang(), kontrol.getStudi(),
                kontrol.getFakultas());

        //membuat/menyimpan data di identitas.ser
//        try {
//            ObjectOutputStream objek = new ObjectOutputStream(new FileOutputStream("identitas.ser"));
//            objek.writeObject(konstruktor);
//            objek.close();
//        } catch (IOException ex) {
//            System.out.println("Maaf tidak bisa dijalankan " + ex);
//        }
//        konstruktor = null;
//        
//        //membaca data yg telah disimpan di identitas.ser
//        try {
//            ObjectInputStream baca = new ObjectInputStream(new FileInputStream("identitas.ser"));
//            control restore = (control) baca.readObject();
//            System.out.println("Nama ruang : " + restore.getNamaruang());
//            System.out.println("Lokasi : " + restore.getLokasiruang());
//            System.out.println("Jurusan : " + restore.getStudi());
//            System.out.println("Fakultas : " + restore.getFakultas());
//        } catch (Exception ex) {
//            System.out.println("Maaf data tidak bisa dibaca" + ex);
//        }
    }

    @Override
    public void input_data() {
        System.out.println("Kondisi Ruang Kelas\n");
        System.out.println("Masukkan panjang ruangan : ");
        kontrol.setPanjang(input.nextDouble());
        System.out.println("\n");
        System.out.println("Masukkan lebar ruangan : ");
        kontrol.setLebar(input.nextDouble());
        System.out.println("\n");
        System.out.println("masukan jumlah kursi : ");
        kontrol.setJml_kursi(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan jumlah pintu : ");
        kontrol.setJml_pintu(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan jumlah jendela : ");
        kontrol.setJml_jendela(input.nextInt());
        System.out.println("\n");
        konstruktor2 = new control(kontrol.getPanjang(), kontrol.getLebar(), kontrol.getJml_kursi(),
                kontrol.getJml_pintu(), kontrol.getJml_jendela());

        System.out.println("Masukkan jumlah stop kontak(steker) : ");
        kontrol.setJml_stop_kontak(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih kondisi stop kontak(steker) : ");
        System.out.println("1. Baik semua \n2. Rusak sebagian \n3. Rusak semua \n4. Tidak ada");
        kontrol.setKon_stop_kontak(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih posisi stop kontak(steker) : ");
        System.out.println("1. Dipojok Ruang \n2.Dekat Dosen \n3.Diatap \n4.Dibawah");
        kontrol.setPos_stop_kontak(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan jumlah kabel LCD : ");
        kontrol.setJml_kbl_LCD(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih kondisi kabel LCD : ");
        System.out.println("1. Berfungsi \n2. Rusak sebagian \n3. Rusak semua \n4. Tidak ada");
        kontrol.setKon_kbl_LCD(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih posisi kabel LCD : ");
        System.out.println("1. Dekat dosen \n2. Jauh dari dosen");
        kontrol.setKon_kbl_LCD(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan jumlah lampu : ");
        kontrol.setJml_lampu(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih kondisi lampu : ");
        System.out.println("1. Baik \n2.Rusak sebagian \n3.Rusak Semua \n4.Tidak Ada");
        kontrol.setKon_lampu(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih posisi lampu : ");
        System.out.println("1. Atap ruang \n2. Belakang ruang \n3.Samping Ruang");
        kontrol.setJml_kipas_angin(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan jumlah kipas angin : ");
        kontrol.setJml_kipas_angin(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih kondisi kipas angin : ");
        System.out.println("1. Baik semua \n2. Rusak sebagian \n3. Rusak semua \n4. Tidak ada");
        kontrol.setKon_kipas_angin(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih posisi kipas angin : ");
        System.out.println("1. Atap \n2. Dinding \n3. Kipas berdiri");
        kontrol.setPos_kipas_angin(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan jumlah AC : ");
        kontrol.setJml_ac(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih kondisi AC dalam ruangan : ");
        System.out.println("1. Baik \n2. Rusak sebagian \n3. Rusak semua \n4. Tidak ada");
        kontrol.setKon_ac(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih posisi AC : ");
        System.out.println("1. Dibelakang \n2. Samping \n3. Depan");
        kontrol.setPos_ac(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih SSID : ");
        System.out.println("1. UMM Hotspot \n2. Lab informatika ");
        kontrol.setSsid(input.nextInt());
        System.out.println("\n");
        System.out.println("Apakah anda bisa Login ? ");
        System.out.println("1. Ya \n2. Tidak");
        kontrol.setLogin(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan Bandwidth : ");
        kontrol.setBandwith(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan jumlah CCTV : ");
        kontrol.setJml_cctv(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih kondisi CCTV : ");
        System.out.println("1. Baik \n2. Rusak sebagian \n3.Rusak semua \n4. Tidak ada");
        kontrol.setKon_cctv(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih posisi CCTV : ");
        System.out.println("1. Depan \n2. Samping \n3. Belakangan \n4. Tidak ada");
        kontrol.setPos_cctv(input.nextInt());
        System.out.println("\n");
        konstruktor3 = new control(kontrol.getJml_stop_kontak(), kontrol.getKon_stop_kontak(),
                kontrol.getPos_stop_kontak(), kontrol.getJml_kbl_LCD(), kontrol.getKon_kbl_LCD(),
                kontrol.getPos_kbl_LCD(), kontrol.getJml_lampu(), kontrol.getKon_lampu(),
                kontrol.getPos_lampu(), kontrol.getJml_kipas_angin(), kontrol.getKon_kipas_angin(),
                kontrol.getPos_kipas_angin(), kontrol.getJml_ac(), kontrol.getKon_ac(), kontrol.getPos_ac(),
                kontrol.getLogin(), kontrol.getBandwith(), kontrol.getJml_cctv(), kontrol.getKon_cctv(),
                kontrol.getPos_cctv());

        System.out.println("Kondisi lantai diruangan : ");
        System.out.println("1. Bersih \n2. Kotor");
        kontrol.setKon_lantai(input.nextInt());
        System.out.println("\n");
        System.out.println("Kondisi dinding diruangan : ");
        System.out.println("1. Bersih \n2. Kotor");
        kontrol.setKon_dinding(input.nextInt());
        System.out.println("\n");
        System.out.println("Kondisi Atap diruangan : ");
        System.out.println("1. Bersih \n2. Kotor");
        kontrol.setKon_atap(input.nextInt());
        System.out.println("\n");
        System.out.println("Kondisi pintu diruangan : ");
        System.out.println("1. Bersih \n2. Kotor");
        kontrol.setKon_pintu(input.nextInt());
        System.out.println("\n");
        System.out.println("Kondisi Jendela diruangan : ");
        System.out.println("1. Bersih \n2. Kotor");
        kontrol.setKon_jendela(input.nextInt());
        System.out.println("\n");
        konstruktor4 = new control(kontrol.getKon_lantai(), kontrol.getKon_dinding(),
                kontrol.getKon_atap(), kontrol.getKon_pintu(), kontrol.getKon_jendela());

        System.out.println("Input kondisi sirkulasi udara : ");
        System.out.println("1. Lancar \n2. Tidak lancar");
        kontrol.setSirkulasi_udara(input.nextDouble());
        System.out.println("\n");
        System.out.println("Masukkan nilai pencahayaan : ");
        kontrol.setNilai_pencahayaan(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan kelembapan : ");
        kontrol.setKelembapan(input.nextInt());
        System.out.println("\n");
        System.out.println("Masukkan suhu : ");
        kontrol.setSuhu(input.nextInt());
        System.out.println("\n");
        konstruktor5 = new control(kontrol.getSirkulasi_udara(), kontrol.getNilai_pencahayaan(),
                kontrol.getKelembapan(), kontrol.getSuhu());

        System.out.println("Pilih Kondisi Kebisingan : ");
        System.out.println("1. bising \n2. tidak bising");
        System.out.print("Pilihan anda : ");
        kontrol.setKebisingan(input.nextDouble());
        System.out.println("\n");
        System.out.println("Pilih Kondisi Bau Ruangan : ");
        System.out.println("1. bau \n2. tidak bau");
        System.out.print("Pilihan anda : ");
        kontrol.setBau(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih Kondisi Kebocoran Ruangan : ");
        System.out.println("1. bocor \n2. tidak bocor");
        System.out.print("Pilihan anda : ");
        kontrol.setKebocoran(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih Konsisi Kerusakan Ruangan : ");
        System.out.println("1. rusak \n2. tidak rusak");
        System.out.print("Pilihan anda : ");
        kontrol.setKerusakan(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih Kondisi Keausan Ruangan : ");
        System.out.println("1. aus \n2. tidak aus");
        System.out.print("Pilihan anda : ");
        kontrol.setKeausan(input.nextInt());
        System.out.println("\n");
        konstruktor6 = new control(kontrol.getKebisingan(), kontrol.getBau(), kontrol.getKebocoran(),
                kontrol.getKerusakan(), kontrol.getKeausan());

        System.out.println("Pilih kekokohan ruangan : ");
        System.out.println("1. kokoh \n2. tidak kokoh");
        System.out.print("Pilihan anda : ");
        kontrol.setKekokohan(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih kunci pintu ruangan : ");
        System.out.println("1. ada \n2. tidak ada");
        System.out.print("Pilihan anda : ");
        kontrol.setKun_pintu(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih kunci jendela ruangan : ");
        System.out.println("1. ada \n2. tidak ada");
        System.out.print("Pilihan anda : ");
        kontrol.setKun_jendela(input.nextInt());
        System.out.println("\n");
        System.out.println("Pilih kondisi bahaya ruangan : ");
        System.out.println("1.aman \n2. tidak aman");
        System.out.print("Pilihan anda : ");
        kontrol.setBahaya(input.nextInt());
        System.out.println("\n");
        konstruktor7 = new control(kontrol.getKekokohan(), kontrol.getKun_pintu(), kontrol.getKun_jendela(),
                kontrol.getBahaya());

    }

    @Override
    public void tampil_data() {
//        method x = new method();
//        System.out.println("Nama ruang : " + kontrol.getNamaruang());
//        System.out.println("Lokasi ruang : " + kontrol.getLokasiruang());
//        System.out.println("Jurusan : " + kontrol.getStudi());
//        System.out.println("Fakultas : " + kontrol.getFakultas());
//        System.out.println("--------------------------------------");
//
//        System.out.println("Luas Ruang = " + x.hitung_luas());
//        System.out.println("Bentuk Ruang = " + x.hitung_bentuk());
//        System.out.println("Rasio Luas = " + x.hitung_rasio());
//        System.out.println("Analisis Pintu = " + x.AnalisaPintu());
//        System.out.println("Analisis Jendela =  " + x.AnalisaJendela());
//        System.out.println("--------------------------------------");
//
//        System.out.println("Jumlah Stopkontak = " + kontrol.getJml_stop_kontak());
//        System.out.println("Kondisi Stopkontak = " + kontrol.getKon_stop_kontak());
//        System.out.println("Posisi Stopkontak = " + kontrol.getPos_stop_kontak());
//        System.out.println("Analisis Kelistrikan : " + x.analisisKelistrikan());
//        System.out.println("--------------------------------------");
//        System.out.println("Jumlah Kabel LCD = " + kontrol.getJml_kbl_LCD());
//        System.out.println("Kondisi Kabel LCD = " + kontrol.getKon_kbl_LCD());
//        System.out.println("Posisi Kabel LCD = " + kontrol.getPos_kbl_LCD());
//        System.out.println("Analisis LCD : " + x.analisisLCD());
//        System.out.println("--------------------------------------");
//        System.out.println("Jumlah Lampu = " + kontrol.getJml_lampu());
//        System.out.println("Kondisi Lampu = " + kontrol.getKon_lampu());
//        System.out.println("Posisi Lampu = " + kontrol.getPos_lampu());
//        System.out.println("Analisis Lampu : " + x.analisislampu());
//        System.out.println("Jumlah Kipas Angin  = " + kontrol.getJml_kipas_angin());
//        System.out.println("Kondisi Kipas Angin = " + kontrol.getKon_kipas_angin());
//        System.out.println("Posisi Kipas Angin  = " + kontrol.getPos_kipas_angin());
//        System.out.println("Analisis Kipas Angin : " + x.analisisKipasAngin());
//        System.out.println("--------------------------------------");
//        System.out.println("Jumlah AC  = " + kontrol.getJml_ac());
//        System.out.println("Kondisi AC = " + kontrol.getKon_ac());
//        System.out.println("Posisi AC  = " + kontrol.getPos_ac());
//        System.out.println("Analisis AC : " + x.analisisAC());
//        System.out.println("--------------------------------------");
//        System.out.println("SSID      = " + kontrol.getSsid());
//        System.out.println("Bandwidth = " + kontrol.getBandwith());
//        System.out.println("Analisis Internet : " + x.analisisInternet());
//        System.out.println("--------------------------------------");
//        System.out.println("Jumlah CCTV   = " + kontrol.getJml_cctv());
//        System.out.println("Kondisi CCTV  = " + kontrol.getKon_cctv());
//        System.out.println("Posisi CCTV   = " + kontrol.getPos_cctv());
//        System.out.println("Analisis CCTV : " + x.analisisCCTV());
//        System.out.println("--------------------------------------");
//
//        System.out.println("Kondisi Lantai  = " + kontrol.getKon_lantai());
//        System.out.println("Kondisi Dinding = " + kontrol.getKon_dinding());
//        System.out.println("Kondisi Atap    = " + kontrol.getKon_atap());
//        System.out.println("Kondisi Pintu   = " + kontrol.getKon_pintu());
//        System.out.println("Kondisi Jendela = " + kontrol.getKon_jendela());
//        System.out.println("Analisis Kebersihan : " + x.analisisKebersihan());
//        System.out.println("--------------------------------------");
//
//        System.out.println("Sirkulasi Udara   = " + kontrol.getSirkulasi_udara());
//        System.out.println("Analisis Nilai Pencahayaan : " + x.analisisPencahayaan());
//        System.out.println("--------------------------------------");
//        System.out.println("Analisis Kelembapan        : " + x.analisisKelembapan());
//        System.out.println("--------------------------------------");
//        System.out.println("Analisis Suhu              : " + x.analisisSuhu());
//        System.out.println("--------------------------------------");
//
//        System.out.println("Kondisi Kebisingan        = " + kontrol.getKebisingan());
//        System.out.println("Kondisi Bau Ruangan       = " + kontrol.getBau());
//        System.out.println("Kondisi Kebocoran Ruangan = " + kontrol.getKebocoran());
//        System.out.println("Konsisi kerusakan Ruangan = " + kontrol.getKerusakan());
//        System.out.println("Kondisi Keausan Ruangan   = " + kontrol.getKeausan());
//        System.out.println("Analisis Kenyamanan : " + x.analisisbising() + x.analisisbau() + x.analisisbocor() + x.analisisrusak() + x.analisisaus());
//        System.out.println("--------------------------------------");
//
//        System.out.println("Kekokohan ruangan      : " + kontrol.getKekokohan());
//        System.out.println("Kunci pintu ruangan    : " + kontrol.getKun_pintu());
//        System.out.println("Kunci jendela ruangan  : " + kontrol.getKun_jendela());
//        System.out.println("Kondisi bahaya ruangan : " + kontrol.getBahaya());
//        System.out.println("Analisis Keamanan : " + x.analisiskokoh() + x.analisiskuncipintujendela() + x.analisisaman());
//        System.out.println("--------------------------------------");

        //membuat/menyimpan data di identitas.ser
        try {
            ObjectOutputStream objek = new ObjectOutputStream(new FileOutputStream("identitas.ser"));
            objek.writeObject(konstruktor1);
            objek.writeObject(konstruktor2);
            objek.writeObject(konstruktor3);
            objek.writeObject(konstruktor4);
            objek.writeObject(konstruktor5);
            objek.writeObject(konstruktor6);
            objek.writeObject(konstruktor7);
            objek.close();
        } catch (IOException ex) {
            System.out.println("Maaf tidak bisa dijalankan " + ex);
        }
        konstruktor1 = null;
        konstruktor2 = null;
        konstruktor3 = null;
        konstruktor4 = null;
        konstruktor5 = null;
        konstruktor6 = null;
        konstruktor7 = null;

        //membaca data yg telah disimpan di identitas.ser
        try {
            ObjectInputStream baca = new ObjectInputStream(new FileInputStream("identitas.ser"));
            control restore1 = (control) baca.readObject();
            control restore2 = (control) baca.readObject();
            control restore3 = (control) baca.readObject();
            control restore4 = (control) baca.readObject();
            control restore5 = (control) baca.readObject();
            control restore6 = (control) baca.readObject();
            control restore7 = (control) baca.readObject();

            method x = new method();

            System.out.println("Nama ruang : " + restore1.getNamaruang());
            System.out.println("Lokasi : " + restore1.getLokasiruang());
            System.out.println("Jurusan : " + restore1.getStudi());
            System.out.println("Fakultas : " + restore1.getFakultas());
            System.out.println("--------------------------------------");

            System.out.println("Panjang : " + restore2.getPanjang());
            System.out.println("Lebar : " + restore2.getLebar());
            System.out.println("Jumlah kursi : " + restore2.getJml_kursi());
            System.out.println("Jumlah pintu : " + restore2.getJml_pintu());
            System.out.println("Jumlah jendela : " + restore2.getJml_jendela());
            System.out.println("Luas Ruang = " + x.hitung_luas());
            System.out.println("Bentuk Ruang = " + x.hitung_bentuk());
            System.out.println("Rasio Luas = " + x.hitung_rasio());
            System.out.println("Analisis Pintu = " + x.AnalisaPintu());
            System.out.println("Analisis Jendela =  " + x.AnalisaJendela());
            System.out.println("--------------------------------------");

            System.out.println("Jumlah Stopkontak = " + restore3.getJml_stop_kontak());
            System.out.println("Kondisi Stopkontak = " + restore3.getKon_stop_kontak());
            System.out.println("Posisi Stopkontak = " + restore3.getPos_stop_kontak());
            System.out.println("Analisis Kelistrikan : " + x.analisisKelistrikan());
            System.out.println("--------------------------------------");
            System.out.println("Jumlah Kabel LCD = " + restore3.getJml_kbl_LCD());
            System.out.println("Kondisi Kabel LCD = " + restore3.getKon_kbl_LCD());
            System.out.println("Posisi Kabel LCD = " + restore3.getPos_kbl_LCD());
            System.out.println("Analisis LCD : " + x.analisisLCD());
            System.out.println("--------------------------------------");
            System.out.println("Jumlah Lampu = " + restore3.getJml_lampu());
            System.out.println("Kondisi Lampu = " + restore3.getKon_lampu());
            System.out.println("Posisi Lampu = " + restore3.getPos_lampu());
            System.out.println("Analisis Lampu : " + x.analisislampu());
            System.out.println("Jumlah Kipas Angin  = " + restore3.getJml_kipas_angin());
            System.out.println("Kondisi Kipas Angin = " + restore3.getKon_kipas_angin());
            System.out.println("Posisi Kipas Angin  = " + restore3.getPos_kipas_angin());
            System.out.println("Analisis Kipas Angin : " + x.analisisKipasAngin());
            System.out.println("--------------------------------------");
            System.out.println("Jumlah AC  = " + restore3.getJml_ac());
            System.out.println("Kondisi AC = " + restore3.getKon_ac());
            System.out.println("Posisi AC  = " + restore3.getPos_ac());
            System.out.println("Analisis AC : " + x.analisisAC());
            System.out.println("--------------------------------------");
            System.out.println("SSID      = " + restore3.getSsid());
            System.out.println("Bandwidth = " + restore3.getBandwith());
            System.out.println("Analisis Internet : " + x.analisisInternet());
            System.out.println("--------------------------------------");
            System.out.println("Jumlah CCTV   = " + restore3.getJml_cctv());
            System.out.println("Kondisi CCTV  = " + restore3.getKon_cctv());
            System.out.println("Posisi CCTV   = " + restore3.getPos_cctv());
            System.out.println("Analisis CCTV : " + x.analisisCCTV());
            System.out.println("--------------------------------------");

            System.out.println("Kondisi Lantai  = " + restore4.getKon_lantai());
            System.out.println("Kondisi Dinding = " + restore4.getKon_dinding());
            System.out.println("Kondisi Atap    = " + restore4.getKon_atap());
            System.out.println("Kondisi Pintu   = " + restore4.getKon_pintu());
            System.out.println("Kondisi Jendela = " + restore4.getKon_jendela());
            System.out.println("Analisis Kebersihan : " + x.analisisKebersihan());
            System.out.println("--------------------------------------");

            System.out.println("Sirkulasi Udara   = " + restore5.getSirkulasi_udara());
            System.out.println("Analisis Nilai Pencahayaan : " + x.analisisPencahayaan());
            System.out.println("--------------------------------------");
            System.out.println("Analisis Kelembapan        : " + x.analisisKelembapan());
            System.out.println("--------------------------------------");
            System.out.println("Analisis Suhu              : " + x.analisisSuhu());
            System.out.println("--------------------------------------");

            System.out.println("Kondisi Kebisingan        = " + restore6.getKebisingan());
            System.out.println("Kondisi Bau Ruangan       = " + restore6.getBau());
            System.out.println("Kondisi Kebocoran Ruangan = " + restore6.getKebocoran());
            System.out.println("Konsisi kerusakan Ruangan = " + restore6.getKerusakan());
            System.out.println("Kondisi Keausan Ruangan   = " + restore6.getKeausan());
            System.out.println("Analisis Kenyamanan : " + x.analisisbising() + x.analisisbau() + x.analisisbocor() + x.analisisrusak() + x.analisisaus());
            System.out.println("--------------------------------------");

            System.out.println("Kekokohan ruangan      : " + restore7.getKekokohan());
            System.out.println("Kunci pintu ruangan    : " + restore7.getKun_pintu());
            System.out.println("Kunci jendela ruangan  : " + restore7.getKun_jendela());
            System.out.println("Kondisi bahaya ruangan : " + restore7.getBahaya());
            System.out.println("Analisis Keamanan : " + x.analisiskokoh() + x.analisiskuncipintujendela() + x.analisisaman());
            System.out.println("--------------------------------------");
        } catch (Exception ex) {
            System.out.println("Maaf data tidak bisa dibaca" + ex);
        }
    }
}
