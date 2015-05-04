package Inventaris_Kampus;

import java.util.Scanner;

public class Tampil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Control call1 = new Control();

		System.out.println("==============================================================");
		System.out.println("                      INVENTARIS KAMPUS");
		System.out.println("==============================================================");
		call1.input();
		System.out.println("========================HASIL ANALISIS========================");
		System.out.println("luas ruangan                   : "
				+ call1.hitung_luas());
		call1.hitung_bentuk();
		if (call1.hitung_rasio() >= 0.5) {
			System.out.println("rasio luas                     : "
					+ call1.hitung_rasio() + " [Sesuai]");
		} else {
			System.out.println("rasio luas                     : "
					+ call1.hitung_rasio() + " [Tidak sesuai]");
		}
		call1.analisis_pintu_dan_jendela();
		call1.analisis_kelistrikan();
		call1.analisis_LCD();
		call1.analisis_lampu();
		call1.analisis_kipas_angin();
		call1.analisis_AC();
		call1.analisis_internet();
		call1.analisis_CCTV();
		call1.analisis_kebersihan();
		call1.analisis_sirkulasi_udara();
		call1.analisis_pencahayaan();
		call1.analisis_kelembapan();
		call1.analisis_suhu();
		call1.analisis_kebisingan();
		call1.analisis_bau();
		call1.analisis_kebocoran();
		call1.analisis_kerusakan();
		call1.analisis_keausan();
		call1.analisis_kekokohan();
		call1.analisis_kuncipintu_dan_jendela();
		call1.analisis_keamanan_ruang();
		System.out.println("==============================================================");
	}
}
