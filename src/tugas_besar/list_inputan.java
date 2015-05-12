package tugas_besar;

public class list_inputan extends Identitas_Ruang_Kelas{
    public void listinputan(){
        
        //Inventaris y = new Inventaris();
        //System.out.println(""+y.Insertdata());
        //System.out.println("-----------------------------");
        
        Kondisi_Ruang_Kelas x = new Kondisi_Ruang_Kelas();
        System.out.println(""+super.getPanjang());
        System.out.println(""+super.getLebar());
        System.out.println(""+x.Hitungluas());
        System.out.println(""+x.BentukRuang());
        System.out.println("-----------------------------");
        System.out.println(""+super.getJml_kursi());
        System.out.println(""+x.rasio());
        System.out.println("-----------------------------");
        System.out.println(""+super.getJml_pintu());
        System.out.println(""+super.getJml_jendela());
        System.out.println(""+x.AnalisaPintu());
        System.out.println(""+x.AnalisaJendela());
        System.out.println("-----------------------------");
        
        JumlahKondisiPosisiSarana a = new JumlahKondisiPosisiSarana();
        System.out.println(""+super.getJml_stop_kontak());
        System.out.println(""+super.getKon_stop_kontak());
        System.out.println(""+super.getPos_stop_kontak());
        System.out.println(""+a.analisisKelistrikan());
        System.out.println("-----------------------------");
        System.out.println(""+super.getJml_kbl_LCD());
        System.out.println(""+super.getKon_kbl_LCD());
        System.out.println(""+super.getPos_kbl_LCD());
        System.out.println(""+a.analisisLCD());
        System.out.println("-----------------------------");
        System.out.println(""+super.getJml_lampu());
        System.out.println(""+super.getKon_lampu());
        System.out.println(""+super.getPos_lampu());
        System.out.println(""+a.analisislampu());
        System.out.println("-----------------------------");
        System.out.println(""+super.getJml_kipas_angin());
        System.out.println(""+super.getKon_kipas_angin());
        System.out.println(""+super.getPos_kipas_angin());
        System.out.println(""+a.analisisKipasAngin());
        System.out.println("-----------------------------");
        System.out.println(""+super.getJml_ac());
        System.out.println(""+super.getKon_ac());
        System.out.println(""+super.getPos_ac());
        System.out.println(""+a.analisisAC());
        System.out.println("-----------------------------");
        System.out.println(""+super.getSsid());
        System.out.println(""+super.getBandwith());
        System.out.println(""+a.analisisInternet());
        System.out.println("-----------------------------");
        System.out.println(""+super.getJml_cctv());
        System.out.println(""+super.getKon_cctv());
        System.out.println(""+super.getPos_cctv());
        System.out.println(""+a.analisisCCTV());
        System.out.println("-----------------------------");
        
        
        
        LingkunganRuangKelas b = new LingkunganRuangKelas();
        System.out.println(""+super.getKon_lantai());
        System.out.println(""+super.getKon_dinding());
        System.out.println(""+super.getKon_atap());
        System.out.println(""+super.getKon_pintu());
        System.out.println(""+super.getKon_jendela());
        System.out.println(""+b.analisisKebersihan());
        System.out.println("-----------------------------");
        
        KebersihanRuangKelas c = new KebersihanRuangKelas();
        System.out.println(""+super.getSirkulasi_udara());
        System.out.println(""+c.analisisSirkulasiUdara());
        System.out.println(""+super.getNilai_pencahayaan());
        System.out.println(""+c.analisisPencahayaan());
        System.out.println("-----------------------------");
        System.out.println(""+super.getKelembapan());
        System.out.println(""+c.analisisKelembapan());
        System.out.println(""+super.getSuhu());
        System.out.println(""+c.analisisSuhu());
        System.out.println("-----------------------------");
        
        
        
        Kenyamanan_Ruang_Kelas d = new Kenyamanan_Ruang_Kelas();
        System.out.println(""+super.getKebisingan());
        System.out.println(""+d.analisisbising());
        System.out.println("-----------------------------");
        System.out.println(""+super.getBau());
        System.out.println(""+d.analisisbau());
        System.out.println("-----------------------------");
        System.out.println(""+super.getKebocoran());
        System.out.println(""+d.analisisbocor());
        System.out.println("-----------------------------");
        System.out.println(""+super.getKerusakan());
        System.out.println(""+d.analisisrusak());
        System.out.println("-----------------------------");
        System.out.println(""+super.getKeausan());
        System.out.println(""+d.analisisaus());
        System.out.println("-----------------------------");
        
        Keamanan_Ruang_Kelas e = new Keamanan_Ruang_Kelas();
        System.out.println(""+super.getKekokohan());
        System.out.println(""+e.analisiskokoh());
        System.out.println("-----------------------------");
        System.out.println(""+super.getKun_pintu());
        System.out.println(""+e.analisiskuncipintujendela());
        System.out.println("-----------------------------");
        System.out.println(""+super.getKun_jendela());
        System.out.println(""+e.analisiskuncipintujendela());
        System.out.println("-----------------------------");
        System.out.println(""+super.getBahaya());
        System.out.println(""+e.analisisaman());
        System.out.println("-----------------------------");
    }
}
