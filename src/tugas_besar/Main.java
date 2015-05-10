package tugas_besar;

public class Main {

    public static void main(String[] args) {
        Inventaris[] y = new Inventaris[1];
        Kondisi_Ruang_Kelas[] x = new Kondisi_Ruang_Kelas[1];
        JumlahKondisiPosisiSarana[] a = new JumlahKondisiPosisiSarana[1];
        LingkunganRuangKelas[] b = new LingkunganRuangKelas[1];
        KebersihanRuangKelas[] c = new KebersihanRuangKelas[1];
        Kenyamanan_Ruang_Kelas[] d = new Kenyamanan_Ruang_Kelas[1];
        Keamanan_Ruang_Kelas[] e = new Keamanan_Ruang_Kelas[1];
        list_inputan[] f = new list_inputan[1];

        for (int i = 0; i < y.length; i++) {
            y[i] = new Inventaris();
            y[i].Insertdata();
        }
        for (int i = 0; i < x.length; i++) {
            x[i] = new Kondisi_Ruang_Kelas();
            x[i].hitung_data();
            x[i].tampil_data();
            x[i].Hitungluas();
            x[i].BentukRuang();
            x[i].rasio();
            x[i].AnalisaPintu();
            x[i].AnalisaJendela();
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = new JumlahKondisiPosisiSarana();
            a[i].input_data();
            a[i].analisisKelistrikan();
            a[i].analisisLCD();
            a[i].analisislampu();
            a[i].analisisKipasAngin();
            a[i].analisisAC();
            a[i].analisisInternet();
            a[i].analisisCCTV();
            a[i].tampil_data();
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = new LingkunganRuangKelas();
            b[i].input_data();
            b[i].analisisKebersihan();
            b[i].tampil_data();
        }

        for (int i = 0; i < c.length; i++) {
            c[i] = new KebersihanRuangKelas();
            c[i].input_data();
            c[i].analisisSirkulasiUdara();
            c[i].analisisKelembapan();
            c[i].analisisPencahayaan();
            c[i].analisisSirkulasiUdara();
            c[i].analisisSuhu();
            c[i].tampil_data();
        }

        for (int i = 0; i < d.length; i++) {
            d[i] = new Kenyamanan_Ruang_Kelas();
            d[i].input_data();
            d[i].analisisbising();
            d[i].analisisbau();
            d[i].analisisbocor();
            d[i].analisisrusak();
            d[i].analisisaus();
            d[i].tampil_data();
        }
        for (int i = 0; i < e.length; i++) {
            e[i] = new Keamanan_Ruang_Kelas();
            e[i].input_data();
            e[i].analisiskokoh();
            e[i].analisiskuncipintujendela();
            e[i].analisisaman();

        }
        for (int i = 0; i < f.length; i++) {
            f[i] = new list_inputan();
            f[i].listinputan();
        }
    }

}
