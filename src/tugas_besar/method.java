package tugas_besar;

public class method {

    control kontrol = new control();

    public double hitung_luas() {
        return kontrol.getPanjang() * kontrol.getLebar();

    }

    public String hitung_bentuk() {
        if (kontrol.getPanjang() == kontrol.getLebar()) {
            return ("Bentuk Ruangan Persegi");
        } else {
            return ("Bentuk Ruangan Persegi Panjang");
        }

    }

    public double hitung_rasio() {
        return hitung_luas() / kontrol.getJml_kursi();
    }

    public String AnalisaPintu() {
        if (kontrol.getJml_pintu() >= 2) {
            return "Jumlah Pintu = tidak Sesuai";
        } else {
            return "Jumlah Pintu = sesuai";
        }
    }

    public String analisisKelistrikan() {
        if (kontrol.getJml_stop_kontak() >= 4 && kontrol.getKon_stop_kontak() == 1 && kontrol.getKon_stop_kontak() == 2 && kontrol.getPos_stop_kontak() == 1) {
            return ("Jumlah Stopkontak = tidak Sesuai");
        } else {
            return ("Jumlah Stopkontak = sesuai");
        }
    }

    public String analisisLCD() {
        if (kontrol.getJml_kbl_LCD() >= 1 && kontrol.getKon_kbl_LCD() == 1 && kontrol.getPos_kbl_LCD() == 1) {
            return ("Jumlah Kabel LCD = tidak Sesuai");
        } else {
            return ("Jumlah Kabel LCD = sesuai");
        }
    }

    public String analisislampu() {
        if (kontrol.getJml_lampu() >= 18 && kontrol.getKon_lampu() == 1 && kontrol.getPos_lampu() == 1) {
            return ("Jumlah Lampu = tidak Sesuai");
        } else {
            return ("Jumlah Lampu = sesuai");
        }
    }

    public String analisisKipasAngin() {
        if (kontrol.getJml_kipas_angin() >= 2 && kontrol.getKon_kipas_angin() == 1 && kontrol.getPos_kipas_angin() == 1) {
            return ("Jumlah Kipas Angin = tidak Sesuai");
        } else {
            return ("Jumlah Kipas Angin = sesuai");
        }
    }

    public String analisisAC() {
        if (kontrol.getJml_ac() >= 1 && kontrol.getKon_ac() == 1 && kontrol.getPos_ac() == 1 || kontrol.getPos_ac() == 2) {
            return ("Jumlah AC = tidak Sesuai");
        } else {
            return ("Jumlah AC = sesuai");
        }
    }

    public String analisisInternet() {
        if (kontrol.getSsid() == 1 && kontrol.getLogin() == 1) {
            return ("SSID = tidak Sesuai");
        } else {
            return ("SSID = sesuai");
        }
    }

    public String analisisCCTV() {
        if (kontrol.getJml_cctv() == 2 && kontrol.getKon_cctv() == 1 && kontrol.getPos_cctv() == 1 || kontrol.getPos_cctv() == 3) {
            return ("Jumlah CCTV = tidak Sesuai");
        } else {
            return ("Jumlah CCTV = sesuai");
        }
    }

    public String AnalisaJendela() {
        if (kontrol.getJml_jendela() >= 1) {
            return "Jumlah Jendela = tidak Sesuai";
        } else {
            return "Jumlah Jendela = Sesuai";
        }
    }

    public String analisisKebersihan() {
        if (kontrol.getKon_lantai() == 1 && kontrol.getKon_dinding() == 1 && kontrol.getKon_atap() == 1 && kontrol.getKon_pintu() == 1 && kontrol.getKon_jendela() == 1) {
            return ("Kebersihan Ruangan = tidak Sesuai");
        } else {
            return ("Kebersihan Ruangan = Sesuai");
        }
    }

    public String analisisSirkulasiUdara() {
        if (kontrol.getSirkulasi_udara() == 1) {
            return ("Sirkulasi Udara = tidak Sesuai");
        } else {
            return ("Sirkulasi Udara = Sesuai");
        }
    }

    public String analisisPencahayaan() {
        if (kontrol.getNilai_pencahayaan() >= 250 && kontrol.getNilai_pencahayaan() <= 350) {
            return ("Nilai Pencahayaan = tidak Sesuai");
        } else {
            return ("Nilai Pencahayaan = Sesuai");
        }
    }

    public String analisisKelembapan() {
        if (kontrol.getKelembapan() >= 70 && kontrol.getKelembapan() <= 80) {
            return ("Kelembapan = tidak Sesuai");
        } else {
            return ("Kelembapan = Sesuai");
        }
    }

    public String analisisSuhu() {
        if (kontrol.getSuhu() >= 25 && kontrol.getSuhu() <= 35) {
            return ("Suhu = tidak Sesuai");
        } else {
            return ("Suhu = Sesuai");
        }
    }

    public String analisisbising() {
        if (kontrol.getKebisingan() == 1) {
            return ("Tingkat Kebisingan = tidak Sesuai");
        } else {
            return ("Tingkat Kebisingan = sesuai");
        }

    }

    public String analisisbau() {

        if (kontrol.getBau() == 1) {
            return ("Bau Ruangan = tidak Sesuai");
        } else {
            return ("Bau Ruangan = sesuai");
        }
    }

    public String analisisbocor() {

        if (kontrol.getKebocoran() == 2) {
            return ("Tingkat Kebocoran = tidak Sesuai");
        } else {
            return ("Tingkat Kebocoran = sesuai");
        }
    }

    public String analisisrusak() {

        if (kontrol.getKerusakan() == 1) {
            return ("Tingkat Kerusakan = tidak Sesuai");
        } else {
            return ("Tingkat Kerusakan = sesuai");
        }
    }

    public String analisisaus() {

        if (kontrol.getKeausan() == 1) {
            return ("Tingkat Keausan = tidak Sesuai");
        } else {
            return ("Tingkat Keausan = sesuai");
        }
    }

    public String analisiskokoh() {

        if (kontrol.getKekokohan() == 1) {
            return ("Tingkat Kekokohan = tidak Sesuai");
        } else {
            return ("Tingkat Kekokohan = sesuai");
        }
    }

    public String analisiskuncipintujendela() {

        if (kontrol.getKun_pintu() == 1 && kontrol.getKun_jendela() == 1) {
            return ("Kunci pintu = tidak Sesuai");
        } else {
            return ("Kunci pintu = sesuai");
        }
    }

    public String analisisaman() {
        if (kontrol.getBahaya() == 1) {
            return ("Tingkat Keamanan Ruangan = tidak Sesuai");
        } else {
            return ("Tingkat Keamanan Ruangan = sesuai");
        }
    }
}
