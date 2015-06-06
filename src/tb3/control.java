package tb3;

import java.io.*;

public class control implements Serializable {

    //------identitas ruang kelas------
    private String namaruang;
    private String lokasiruang;
    private String studi;
    private String fakultas;
    //------kondisi ruang kelas------
    private double panjang;
    private double lebar;
    private int jml_kursi;
    private int jml_pintu;
    private int jml_jendela;
    //------jumlah, kondisi, dan posisi sarana------
    private int jml_stop_kontak;
    private int kon_stop_kontak;
    private int pos_stop_kontak;
    private int jml_kbl_LCD;
    private int kon_kbl_LCD;
    private int pos_kbl_LCD;
    private int jml_lampu;
    private int kon_lampu;
    private int pos_lampu;
    private int jml_kipas_angin;
    private int kon_kipas_angin;
    private int pos_kipas_angin;
    private int jml_ac;
    private int kon_ac;
    private int pos_ac;
    private int ssid;
    private int login;
    private int bandwith;
    private int jml_cctv;
    private int kon_cctv;
    private int pos_cctv;
    //------lingkungan ruang kelas------
    private int kon_lantai;
    private int kon_dinding;
    private int kon_atap;
    private int kon_pintu;
    private int kon_jendela;
    //------kebersihan ruang kelas------
    private double sirkulasi_udara;
    private int nilai_pencahayaan;
    private int kelembapan;
    private int suhu;
    //------kenyamanan ruang kelas------
    private double kebisingan;
    private int bau;
    private int kebocoran;
    private int kerusakan;
    private int keausan;
    //------keamanan ruang kelas------
    private int kekokohan;
    private int kun_pintu;
    private int kun_jendela;
    private int bahaya;

    public control() {
    }

    public control(String nama, String lokasi, String studi, String fakultas) {
//        setNamaruang(nama);
//        setLokasiruang(lokasi);
//        setStudi(studi);
//        setFakultas(fakultas);
        this.namaruang = nama;
        this.lokasiruang = lokasi;
        this.studi = studi;
        this.fakultas = fakultas;
    }

    public control(double panjang, double lebar, int jml_kursi, int jml_pintu, int jml_jendela) {
//        setPanjang(panjang);
//        setLebar(lebar);
//        setJml_kursi(jml_kursi);
//        setJml_pintu(jml_pintu);
//        setJml_jendela(jml_jendela);
        this.panjang = panjang;
        this.lebar = lebar;
        this.jml_kursi = jml_kursi;
        this.jml_pintu = jml_pintu;
        this.jml_jendela = jml_jendela;
    }

    public control(int jml_steker, int kon_steker, int pos_steker, int jml_kbl_lcd,
            int kon_kbl_lcd, int pos_kbl_lcd, int jml_lampu, int kon_lampu, int pos_lampu,
            int jml_kipas, int kon_kipas, int pos_kipas, int jml_ac, int kon_ac, int pos_ac,
            int login, int bandwith, int jml_cctv, int kon_cctv, int pos_cctv) {
//        setJml_stop_kontak(jml_steker);
//        setKon_stop_kontak(kon_steker);
//        setPos_stop_kontak(pos_steker);
//        setJml_kbl_LCD(jml_kbl_lcd);
//        setKon_kbl_LCD(kon_kbl_lcd);
//        setPos_kbl_LCD(pos_kbl_lcd);
//        setJml_lampu(jml_lampu);
//        setKon_lampu(kon_lampu);
//        setPos_lampu(pos_lampu);
//        setJml_kipas_angin(jml_kipas);
//        setKon_kipas_angin(kon_kipas);
//        setPos_kipas_angin(pos_kipas);
//        setJml_ac(jml_ac);
//        setKon_ac(kon_ac);
//        setPos_ac(pos_ac);
//        setLogin(login);
//        setBandwith(bandwith);
//        setJml_cctv(jml_cctv);
//        setKon_cctv(kon_cctv);
//        setPos_cctv(pos_cctv);
        this.jml_stop_kontak = jml_steker;
        this.kon_stop_kontak = kon_steker;
        this.pos_stop_kontak = pos_steker;
        this.jml_kbl_LCD = jml_kbl_lcd;
        this.kon_kbl_LCD = kon_kbl_lcd;
        this.pos_kbl_LCD = pos_kbl_lcd;
        this.jml_lampu = jml_lampu;
        this.kon_lampu = kon_lampu;
        this.pos_lampu = pos_lampu;
        this.jml_kipas_angin = jml_kipas;
        this.kon_kipas_angin = kon_kipas;
        this.pos_kipas_angin = pos_kipas;
        this.jml_ac = jml_ac;
        this.kon_ac = kon_ac;
        this.pos_ac = pos_ac;
        this.login = login;
        this.bandwith = bandwith;
        this.jml_cctv = jml_cctv;
        this.kon_cctv = kon_cctv;
        this.pos_cctv = pos_cctv;
    }

    public control(int kon_lantai, int kon_dinding, int kon_atap, int pintu,
            int jendela) {
//        setKon_lantai(kon_lantai);
//        setKon_dinding(kon_dinding);
//        setKon_atap(kon_atap);
//        setKon_pintu(pintu);
        this.kon_lantai = kon_lantai;
        this.kon_dinding = kon_dinding;
        this.kon_atap = kon_atap;
        this.kon_pintu = pintu;
        this.kon_jendela = jendela;
    }

    public control(double sirkulasi_udara, int nilai_pencahayaan, int kelembapan, int suhu) {
//        setSirkulasi_udara(sirkulasi_udara);
//        setNilai_pencahayaan(nilai_pencahayaan);
//        setKelembapan(kelembapan);
//        setSuhu(suhu);
        this.sirkulasi_udara = sirkulasi_udara;
        this.nilai_pencahayaan = nilai_pencahayaan;
        this.kelembapan = kelembapan;
        this.suhu = suhu;
    }

    public control(double kebisingan, int bau, int kebocoran, int kerusakan, int keausan) {
//        setKebisingan(kebisingan);
//        setBau(bau);
//        setKebocoran(kebocoran);
//        setKerusakan(kerusakan);
//        setKeausan(keausan);
        this.kebisingan = kebisingan;
        this.bau = bau;
        this.kebocoran = kebocoran;
        this.kerusakan = kerusakan;
        this.keausan = keausan;
    }

    public control(int kekokohan, int kun_pintu, int kun_jendela, int bahaya) {
//        setKekokohan(kekokohan);
//        setKun_pintu(kun_pintu);
//        setKun_jendela(kun_jendela);
//        setBahaya(bahaya);
        this.kekokohan = kekokohan;
        this.kun_pintu = kun_pintu;
        this.kun_jendela = kun_jendela;
        this.bahaya = bahaya;
    }

    public String getNamaruang() {
        return namaruang;
    }

    public void setNamaruang(String namaruang) {
        this.namaruang = namaruang;
    }

    public String getLokasiruang() {
        return lokasiruang;
    }

    public void setLokasiruang(String lokasiruang) {
        this.lokasiruang = lokasiruang;
    }

    public String getStudi() {
        return studi;
    }

    public void setStudi(String studi) {
        this.studi = studi;
    }

    public int getBahaya() {
        return bahaya;
    }

    public void setBahaya(int bahaya) {
        this.bahaya = bahaya;
    }

    public int getBandwith() {
        return bandwith;
    }

    public void setBandwith(int bandwith) {
        this.bandwith = bandwith;
    }

    public int getBau() {
        return bau;
    }

    public void setBau(int bau) {
        this.bau = bau;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public int getJml_ac() {
        return jml_ac;
    }

    public void setJml_ac(int jml_ac) {
        this.jml_ac = jml_ac;
    }

    public int getJml_cctv() {
        return jml_cctv;
    }

    public void setJml_cctv(int jml_cctv) {
        this.jml_cctv = jml_cctv;
    }

    public int getJml_jendela() {
        return jml_jendela;
    }

    public void setJml_jendela(int jml_jendela) {
        this.jml_jendela = jml_jendela;
    }

    public int getJml_kbl_LCD() {
        return jml_kbl_LCD;
    }

    public void setJml_kbl_LCD(int jml_kbl_LCD) {
        this.jml_kbl_LCD = jml_kbl_LCD;
    }

    public int getJml_kipas_angin() {
        return jml_kipas_angin;
    }

    public void setJml_kipas_angin(int jml_kipas_angin) {
        this.jml_kipas_angin = jml_kipas_angin;
    }

    public int getJml_kursi() {
        return jml_kursi;
    }

    public void setJml_kursi(int jml_kursi) {
        this.jml_kursi = jml_kursi;
    }

    public int getJml_lampu() {
        return jml_lampu;
    }

    public void setJml_lampu(int jml_lampu) {
        this.jml_lampu = jml_lampu;
    }

    public int getJml_pintu() {
        return jml_pintu;
    }

    public void setJml_pintu(int jml_pintu) {
        this.jml_pintu = jml_pintu;
    }

    public int getJml_stop_kontak() {
        return jml_stop_kontak;
    }

    public void setJml_stop_kontak(int jml_stop_kontak) {
        this.jml_stop_kontak = jml_stop_kontak;
    }

    public int getKeausan() {
        return keausan;
    }

    public void setKeausan(int keausan) {
        this.keausan = keausan;
    }

    public double getKebisingan() {
        return kebisingan;
    }

    public void setKebisingan(double kebisingan) {
        this.kebisingan = kebisingan;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getKebocoran() {
        return kebocoran;
    }

    public void setKebocoran(int kebocoran) {
        this.kebocoran = kebocoran;
    }

    public int getKekokohan() {
        return kekokohan;
    }

    public void setKekokohan(int kekokohan) {
        this.kekokohan = kekokohan;
    }

    public int getKelembapan() {
        return kelembapan;
    }

    public void setKelembapan(int kelembapan) {
        this.kelembapan = kelembapan;
    }

    public int getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(int kerusakan) {
        this.kerusakan = kerusakan;
    }

    public int getKon_ac() {
        return kon_ac;
    }

    public void setKon_ac(int kon_ac) {
        this.kon_ac = kon_ac;
    }

    public int getKon_atap() {
        return kon_atap;
    }

    public void setKon_atap(int kon_atap) {
        this.kon_atap = kon_atap;
    }

    public int getKon_cctv() {
        return kon_cctv;
    }

    public void setKon_cctv(int kon_cctv) {
        this.kon_cctv = kon_cctv;
    }

    public int getKon_dinding() {
        return kon_dinding;
    }

    public void setKon_dinding(int kon_dinding) {
        this.kon_dinding = kon_dinding;
    }

    public int getKon_jendela() {
        return kon_jendela;
    }

    public void setKon_jendela(int kon_jendela) {
        this.kon_jendela = kon_jendela;
    }

    public int getKon_kbl_LCD() {
        return kon_kbl_LCD;
    }

    public void setKon_kbl_LCD(int kon_kbl_LCD) {
        this.kon_kbl_LCD = kon_kbl_LCD;
    }

    public int getKon_kipas_angin() {
        return kon_kipas_angin;
    }

    public void setKon_kipas_angin(int kon_kipas_angin) {
        this.kon_kipas_angin = kon_kipas_angin;
    }

    public int getKon_lampu() {
        return kon_lampu;
    }

    public void setKon_lampu(int kon_lampu) {
        this.kon_lampu = kon_lampu;
    }

    public int getKon_lantai() {
        return kon_lantai;
    }

    public void setKon_lantai(int kon_lantai) {
        this.kon_lantai = kon_lantai;
    }

    public int getKon_pintu() {
        return kon_pintu;
    }

    public void setKon_pintu(int kon_pintu) {
        this.kon_pintu = kon_pintu;
    }

    public int getKon_stop_kontak() {
        return kon_stop_kontak;
    }

    public void setKon_stop_kontak(int kon_stop_kontak) {
        this.kon_stop_kontak = kon_stop_kontak;
    }

    public int getKun_pintu() {
        return kun_pintu;
    }

    public void setKun_pintu(int kun_pintu) {
        this.kun_pintu = kun_pintu;
    }

    public int getKun_jendela() {
        return kun_jendela;
    }

    public void setKun_jendela(int kun_jendela) {
        this.kun_jendela = kun_jendela;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public int getNilai_pencahayaan() {
        return nilai_pencahayaan;
    }

    public void setNilai_pencahayaan(int nilai_pencahayaan) {
        this.nilai_pencahayaan = nilai_pencahayaan;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public int getPos_ac() {
        return pos_ac;
    }

    public void setPos_ac(int pos_ac) {
        this.pos_ac = pos_ac;
    }

    public int getPos_cctv() {
        return pos_cctv;
    }

    public void setPos_cctv(int pos_cctv) {
        this.pos_cctv = pos_cctv;
    }

    public int getPos_kbl_LCD() {
        return pos_kbl_LCD;
    }

    public void setPos_kbl_LCD(int pos_kbl_LCD) {
        this.pos_kbl_LCD = pos_kbl_LCD;
    }

    public int getPos_kipas_angin() {
        return pos_kipas_angin;
    }

    public void setPos_kipas_angin(int pos_kipas_angin) {
        this.pos_kipas_angin = pos_kipas_angin;
    }

    public int getPos_lampu() {
        return pos_lampu;
    }

    public void setPos_lampu(int pos_lampu) {
        this.pos_lampu = pos_lampu;
    }

    public int getPos_stop_kontak() {
        return pos_stop_kontak;
    }

    public void setPos_stop_kontak(int pos_stop_kontak) {
        this.pos_stop_kontak = pos_stop_kontak;
    }

    public double getSirkulasi_udara() {
        return sirkulasi_udara;
    }

    public void setSirkulasi_udara(double sirkulasi_udara) {
        this.sirkulasi_udara = sirkulasi_udara;
    }

    public int getSsid() {
        return ssid;
    }

    public void setSsid(int ssid) {
        this.ssid = ssid;
    }

    public int getSuhu() {
        return suhu;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }
}

