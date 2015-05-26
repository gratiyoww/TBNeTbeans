/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class query {
    private koneksi aplikasi_inventaris = new koneksi();
    control kontrol = new control();
    
    public query(){
        aplikasi_inventaris.konekkeDatabase();
    }
    public void simpan_identitas() {

        try {
            Statement st = aplikasi_inventaris.config.getConnection().createStatement();
            st.executeUpdate(
                    "insert into identitas_kelas"
                    + "(nama, lokasi, jurusan, fakultas) values ('" + kontrol.getNamaruang() + "','" + kontrol.getLokasiruang() + "','" + kontrol.getStudi() + "','" + kontrol.getFakultas() + "')");


            System.out.println("data berhasil disimpan");

        } catch (SQLException ex) {
            System.out.println("data gagal disimpan " + ex);
        }
    }
    private void delete_indentitas(){
        try {
            Statement st = aplikasi_inventaris.config.getConnection().createStatement();
            st.executeUpdate(
                    " delete from identitas_kelas where nama ='" + kontrol.getNamaruang() + "'");

            System.out.println("data berhasil dihapus");
        } catch (SQLException ex) {
            System.out.println("data tidak dapat dihapus" +ex);
        }
    }
    
    private void input_kondisi_ruang(){
        
    }
}
