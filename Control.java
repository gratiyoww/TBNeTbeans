package Inventaris_Kampus;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Control {
	Model call1 = new Model();
	Scanner in = new Scanner(System.in);
	int a,b, steker=0, LCD=0, lampu=0, kipas= 0, AC=0, CCTV=0;
	

	void input() {
		System.out.println('\n'+"------------------- IDENTITAS RUA KELAS --------------------"+'\n');
		System.out.print("Masukkan nama ruang            : ");
		call1.setNama_ruang(in.next());
		System.out.print("Masukkan lokasi ruang          : ");
		call1.setLokasi_ruang(in.next());
		System.out.print("Masukkan fakultas              : ");
		call1.setFakultas(in.next());

		System.out.println('\n'+"-------------------- KONDISI RUANG KELAS ---------------------"+'\n');
		System.out.print("Masukkan panjang ruang         : ");
		call1.setPanjang_ruang(in.nextDouble());
		System.out.print("Masukkan lebar ruang           : ");
		call1.setLebar_ruang(in.nextDouble());
		System.out.print("Masukkan jumlah kursi          : ");
		call1.setJml_kursi(in.nextInt());
		System.out.print("Masukkan jumlah pintu          : ");
		call1.setJml_pintu(in.nextInt());
		System.out.print("Masukkan jumlah jendela        : ");
		call1.setJml_jendela(in.nextInt());

		System.out.println('\n'+"----------- JUMLAH, KONDISI DAN POSISI RUANG KELAS -----------"+'\n');
		System.out.print("Masukkan jumlah steker                 : ");
		call1.setJml_steker(in.nextInt());
		for(a=0; a <call1.getJml_steker(); a++){
			b=a+1;                                                    
			System.out.print(b+". Kondisi steker         [Rusak/Baik] : ");
			call1.setKondisi_steker(in.next());
			if(call1.getKondisi_steker().equalsIgnoreCase("baik")){
				steker++;
			}
		}
		JOptionPane.showMessageDialog(null, "PILIHAN POSISI STEKER"+'\n'+"a. Dipojok ruang dekat dosen"+'\n'+ "b. Dipojok ruang"+'\n'+"c. Dipojok dekat pintu");
		System.out.print("Pilih posisi steker      [ketik huruf] : ");
		call1.setPosisi_steker(in.next());                       
		
		
		System.out.print("Jumlah kabel LCD                       : ");
		call1.setJml_kabelLCD(in.nextInt());
		for(a=0; a <call1.getJml_kabelLCD(); a++){
			b=a+1;
			System.out.print(b+". Kondisi kabel LCD [Berfungsi/Rusak] : ");
			call1.setKondisi_kabelLCD(in.next());
			if(call1.getKondisi_kabelLCD().equalsIgnoreCase("berfungsi")){
				LCD++;
			}
		}
		JOptionPane.showMessageDialog(null,"PILIHAN POSISI KABEL LCD"+'\n'+"a. Dekat dosen"+'\n'+"b. Dekat pintu");
		System.out.print("Pilih posisi kabel LCD   [ketik huruf] : ");
		call1.setPosisi_kabelLCD(in.next());
		
		
		System.out.print("Masukkan jumlah lampu                  : ");
		call1.setJml_lampu(in.nextInt());
		for(a=0; a <call1.getJml_lampu(); a++){
			b=a+1;
			System.out.print(b+". Masukkan kondisi lampu [Rusak/Baik] : ");
			call1.setKondisi_lampu(in.next());
			if(call1.getKondisi_lampu().equalsIgnoreCase("baik")){
				lampu++;
			}
		}
		JOptionPane.showMessageDialog(null,"PILIHAN POSISI LAMPU"+'\n'+"a. Diatap ruangan"+'\n'+"b. Dipojok ruangan");
		System.out.print("Pilih posisi lampu       [ketik huruf] : ");
		call1.setPosisi_lampu(in.next());
		
		
		System.out.print("Masukkan jumlah kipas                  : ");
		call1.setJml_kipas(in.nextInt());
		for(a=0; a <call1.getJml_kipas(); a++){
			b=a+1;
			System.out.print(b+". Masukkan kondisi kipas [Rusak/baik] : ");
			call1.setKondisi_kipas(in.next());
			if(call1.getKondisi_kipas().equalsIgnoreCase("baik")){
				kipas++;
			}
		}
		JOptionPane.showMessageDialog(null,"PILIHAN POSISI KIPAS"+'\n'+"a. Diatap ruangan"+'\n'+"b. Dipojok ruangan");
		System.out.print("Pilih posisi kipas       [ketik huruf] : ");
		call1.setPosisi_kipas(in.next());
		
		
		System.out.print("Masukkan jumlah AC                     : ");
		call1.setJml_AC(in.nextInt());
		for(a=0; a <call1.getJml_AC(); a++){
			b=a+1;                                                    
			System.out.print(b+". Masukkan kondisi AC    [Rusak/baik] : ");
			call1.setKondisi_AC(in.next());
			if(call1.getKondisi_AC().equalsIgnoreCase("baik")){
				AC++;
			}
		}
		JOptionPane.showMessageDialog(null,"PILIHAN POSISI AC"+'\n'+"a. Dibelakang & Didepan"+'\n'+"b. Dibelakang"+'\n'+"c. Didepan"+'\n'+"d. Disamping");
		System.out.print("Pilih posisi AC          [ketik huruf] : ");
		call1.setPosisi_AC(in.next());
		
		
		System.out.println("Pilihan SSID : ");
		System.out.println("a. UMMHotspot "+'\n'+"b. Lab. Informatika ");
		System.out.print("Pilih bandwidth(SSID)    [ketik huruf] :  ");
		call1.setBandwitdth(in.next());
		System.out.print("Login                     [Bisa/Tidak] :  ");
		call1.setLogin(in.next());
		
		
		System.out.print("Masukkan jumlah CCTV                   : ");
		call1.setJml_CCTV(in.nextInt());
		for(a=0; a <call1.getJml_CCTV(); a++){
			b=a+1;
			System.out.print(b+". Masukkan kondisi CCTV  [Rusak/baik] : ");
			call1.setKondisi_CCTV(in.next());
			if(call1.getKondisi_CCTV().equalsIgnoreCase("baik")){
				CCTV++;
			}
		}
		JOptionPane.showMessageDialog(null,"PILIHAN POSISI CCTV"+'\n'+"a. Depan & Belakang"+'\n'+"b. Belakang saja"+'\n'+"c. Depan saja");
		System.out.print("Pilih posisi CCTV        [ketik huruf] : ");
		call1.setPosisi_CCTV(in.next());                         
		
		
		System.out.println('\n'+"------------------- LINGKUNGAN RUANG KELAS -------------------"+'\n');
		JOptionPane.showMessageDialog(null, "Masukkan Bersih atau kotor");
		System.out.print("Masukkan kondisi lantai        : ");
		call1.setKondisi_lantai(in.next());
		System.out.print("Masukkan kondisi dinding       : ");
		call1.setKondisi_dinding(in.next());
		System.out.print("Masukkan kondisi atap          : ");
		call1.setKondisi_atap(in.next());
		System.out.print("Masukkan kondisi pintu         : ");
		call1.setKondisi_pintu(in.next());
		System.out.print("Masukkan kondisi jendela       : ");
		call1.setKondisi_jendela(in.next());
		
		System.out.println('\n'+"------------------- KEBERSIHAN RUANG KELAS -------------------"+'\n');
		JOptionPane.showMessageDialog(null,"PILIHAN SIRKULASI UDARA"+'\n'+"a. Lancar"+'\n'+"b. Tidak Lancar");
		System.out.print("Masukkan sirkulasi udara       : ");
		call1.setSirkulasi_udara(in.next());
		System.out.print("Masukkan nilai pencahayaan     : ");
		call1.setNilai_pencahayaan(in.nextInt());
		System.out.print("Masukkan kelembapan            : ");
		call1.setKelembapan(in.nextInt());
		System.out.print("Masukkan suhu [celcius]        : ");
		call1.setSuhu(in.nextInt());
		
		System.out.println('\n'+"------------------- KENYAMANAN RUANG KELAS -------------------"+'\n');
		System.out.print("Masukkan kebisingan [Bising/Tidak] : ");
		call1.setKebisingan(in.next());
		System.out.print("Masukkan bau           [Bau/Tidak] : ");
		call1.setBau(in.next());
		System.out.print("Masukkan kebocoran   [Bocor/Tidak] : ");
		call1.setKebocoran(in.next());
		System.out.print("Masukkan kerusakan   [Rusak/tidak] : ");
		call1.setKerusakan(in.next());
		System.out.print("Masukkan keausan       [Aus/tidak] : ");
		call1.setKeausan(in.next());
		
		System.out.println('\n'+"-------------------- KEAMANAN RUANG KELAS --------------------"+'\n');
		JOptionPane.showMessageDialog(null, "Masukkan kokoh atau tidak");
		System.out.print("Masukkan kekokohan ruang       : ");
		call1.setKekokohan(in.next());
		JOptionPane.showMessageDialog(null, "Masukkan ada atau tidak");
		System.out.print("Masukkan kunci pintu & jendela : ");
		call1.setKunci_pintujendela(in.next());
		JOptionPane.showMessageDialog(null, "Masukkan aman atau bahaya");
		System.out.print("Masukkan bahaya                : ");
		call1.setBahaya(in.next());

	}

	double hitung_luas() {
		return call1.getPanjang_ruang() * call1.getLebar_ruang();
	}

	void hitung_bentuk() {
		if (call1.getPanjang_ruang() == call1.getLebar_ruang())
			System.out.println("Analisis bentuk ruang          : Ruangan tidak sesuai");
		else
			System.out.println("Analisis bentuk ruang          : Ruangan sesuai");
	}

	double hitung_rasio() {
		return hitung_luas() / call1.getJml_kursi();
	}

	void analisis_pintu_dan_jendela() {
		if (call1.getJml_pintu() >= 2) {
			System.out.println("Analisis Pintu & jendela       : Sesuai");
		} else {
			System.out.println("Analisis Pintu & jendela       : Tidak Sesuai");
		}
	}
	
	void analisis_kelistrikan(){
		if(call1.getPosisi_steker().equalsIgnoreCase("a") && call1.getJml_steker() >= 4 && steker == 4 ){
			System.out.println("Analisis kelistrikan           : Sesuai ");
		}else{
			System.out.println("Analisis kelistrikan           : Tidak sesuai ");
		}
	}
	
	void analisis_LCD(){
		if(call1.getJml_kabelLCD() >= 1 && call1.getKondisi_kabelLCD().equalsIgnoreCase("berfungsi") && call1.getPosisi_kabelLCD().equalsIgnoreCase("a")){
			System.out.println("Analisis LCD                   : Sesuai ");
		}else
			System.out.println("Analisis LCD                   : Tidak sesuai ");
	}
	
	void analisis_lampu(){
		if(call1.getJml_lampu() >= 18 && lampu == 18 && call1.getPosisi_lampu().equalsIgnoreCase("a")){
			System.out.println("Analisis lampu                 : Sesuai ");
		}else{
			System.out.println("Analisis lampu                 : Tidak sesuai ");
		}
	}
	
	void analisis_kipas_angin(){
		if(call1.getJml_kipas() >= 2 && kipas ==2 && call1.getPosisi_kipas().equalsIgnoreCase("a") ){
			System.out.println("Analisis kipas angin           : Sesuai");
		}else{
			System.out.println("Analisis kipas angin           : Tidak sesuai ");
		}
	}
	
	void analisis_AC(){
		if(call1.getJml_AC() >= 1 && AC>=1 && call1.getPosisi_AC().equalsIgnoreCase("a")){
			System.out.println("Analisis AC                    : Sesuai ");
		}else{
			System.out.println("Analisis AC                    : Tidak sesuai ");
		}
	}
	
	void analisis_internet(){
		if(call1.getBandwitdth().equalsIgnoreCase("a") && call1.getLogin().equalsIgnoreCase("baik")){
			System.out.println("Analisis internet              : Sesuai ");
		}else{
			System.out.println("Analisis internet              : Tidak sesuai ");
		}
	}
	
	void analisis_CCTV(){
		if(call1.getJml_CCTV() == 2 && CCTV==2 && call1.getPosisi_CCTV().equalsIgnoreCase("a")){
			System.out.println("Analisis CCTV                  : Sesuai ");
		}else{
			System.out.println("Analisis CCTV                  : Tidak sesuai ");
		}
	}

	void analisis_kebersihan() {
		if (call1.getKondisi_lantai().equalsIgnoreCase("bersih")
				&& call1.getKondisi_dinding().equalsIgnoreCase("bersih")
				&& call1.getKondisi_atap().equalsIgnoreCase("bersih")
				&& call1.getKondisi_pintu().equalsIgnoreCase("bersih")
				&& call1.getKondisi_jendela().equalsIgnoreCase("bersih")) {
			System.out.println("Analisis kebersihan            : Sesuai");
		} else {
			System.out.println("Analisis kebersihan            : Tidak sesuai");
		}
	}
	
	void analisis_sirkulasi_udara(){
		if(call1.getSirkulasi_udara().equalsIgnoreCase("a")){
			System.out.println("Analisis sirkulasi udara       : Sesuai");
		}else{
			System.out.println("Analisis sirkulasi udara       : Tidak sesuai");
		}
	}
	
	void analisis_pencahayaan(){
		if(250>=call1.getNilai_pencahayaan() && call1.getNilai_pencahayaan()>=350){
			System.out.println("Analisis pencahayaan           : Sesuai");
		}else{
			System.out.println("Analisis pencahayaan           : Tidak sesuai");
		}
	}
	
	void analisis_kelembapan(){
		if(70>=call1.getKelembapan() && call1.getKelembapan()<=80){
			System.out.println("Analisis kelembapan            : Sesuai");
		}else{
			System.out.println("Analisis kelembapan            : Tidak sesuai");
		}
	}
	
	void analisis_suhu(){
		if(25>=call1.getKelembapan() && call1.getKelembapan()<=35){
			System.out.println("Analisis suhu                  : Sesuai");
		}else{
			System.out.println("Analisis suhu                  : Tidak sesuai");
		}
	}
	
	void analisis_kebisingan(){
		if(call1.getKebisingan().equalsIgnoreCase("tidak")){
			System.out.println("Analisis kebisingan            : Sesuai");
		}else{
			System.out.println("Analisis kebisingan            : Tidak sesuai");
		}
	}
	
	void analisis_bau(){
		if(call1.getBau().equalsIgnoreCase("tidak")){
			System.out.println("Analisis bau                   : Sesuai");
		}else{
			System.out.println("Analisis bau                   : Tidak sesuai");
		}
	}
	
	void analisis_kebocoran(){
		if(call1.getKebocoran().equalsIgnoreCase("tidak")){
			System.out.println("Analisis kebocoran             : Sesuai");
		}else{
			System.out.println("Analisis kebisingan            : Tidak sesuai");
		}
	}
	
	void analisis_kerusakan(){
		if(call1.getKerusakan().equalsIgnoreCase("tidak")){
			System.out.println("Analisis kerusakan             : Sesuai");
		}else{
			System.out.println("Analisis kerusakan             : Tidak sesuai");
		}
	}
	
	void analisis_keausan(){
		if(call1.getKeausan().equalsIgnoreCase("tidak")){
			System.out.println("Analisis keausan               : Sesuai");
		}else{
			System.out.println("Analisis keausan               : Tidak sesuai");
		}
	}

	void analisis_kekokohan() {
		if (call1.getKekokohan().equalsIgnoreCase("kokoh")) {
			System.out.println("Analisis kekokohan             : Sesuai");
		} else {
			System.out.println("Analisis kekokohan             : Tidak sesuai");
		}
	}

	void analisis_kuncipintu_dan_jendela() {
		if (call1.getKunci_pintujendela().equalsIgnoreCase("ada")) {
			System.out.println("Analisis kunci & jendela       : Sesuai");
		} else {
			System.out.println("Analisis kunci & jendela       : Tidak sesuai");
		}
	}

	void analisis_keamanan_ruang() {
		if (call1.getBahaya().equalsIgnoreCase("aman")) {
			System.out.println("Analisis keamanan              : Sesuai");
		} else {
			System.out.println("Analisis keamanam              : Tidak sesuai");
		}
	}
}
