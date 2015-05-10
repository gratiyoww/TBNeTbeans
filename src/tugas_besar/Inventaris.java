package tugas_besar;

import java.util.Scanner;

public class Inventaris extends Identitas_Ruang_Kelas{
	Scanner input = new Scanner(System.in);
	
	public void Insertdata(){
		System.out.println("Masukkan Identitas : \n1.Nama Ruang \n2.Letak \n3.Fakultas \n4.Jurusan");
		super.setInventaris(input.next(), input.next(), input.next(), input.next());
		
	}
	public Inventaris(){
		
	}
}
		
	