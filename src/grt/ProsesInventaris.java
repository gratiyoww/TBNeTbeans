/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grt;

import java.util.Scanner;

/**
 *
 * @author GratiyoWahyu
 */
public class ProsesInventaris {

    ControlInventaris ambil = new ControlInventaris();
    Scanner input = new Scanner(System.in);

    public void analisisbising() {

        System.out.println("Masukkan tingkat kebisingan? ");
        ambil.setBising(input.nextLine());

        if (ambil.getBising().equals("Tidak Bising")) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
    }

    public void analisisbau() {
        System.out.println("Masukkan bau? ");
        ambil.setBau(input.nextLine());

        if (ambil.getBising().equals("Tidak Bau")) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
    }
    
    public void analisisbocor(){
        System.out.println("Masukkan kebocoran? ");
        ambil.setBocor(input.nextLine());
        
        if(ambil.getBocor().equals("Tidak Bocor")){
            System.out.println("Sesuai");
        }else{
            System.out.println("Tidak Sesuai");
        }
    }

    public void analisisrusak(){
        System.out.println("Masukkan kerusakan");
        ambil.setRusak(input.nextLine());
        
        if(ambil.getRusak().equals("Tidak Rusak")){
            System.out.println("Sesuai");
        }else{
            System.out.println("Tidak Sesuai");
        }
    }

    public void analisisaus(){
        System.out.println("Masukkan aus? ");
        ambil.setAus(input.nextLine());
        
        if(ambil.getAus().equals("TIdak Aus")){
            System.out.println("Sesuai");
        }else{
            System.out.println("Tidak Sesuai");
        }
    }
    
    public void analisiskokoh(){
        System.out.println("Masukkan Kekokohan? ");
        ambil.setKokoh(input.nextLine());
        
        if(ambil.getKokoh().equals("Kokoh")){
            System.out.println("Sesuai");
    }else{
            System.out.println("TIdak Sesuai");
        }
    }
    
        public void analisiskuncipintujendela(){
            System.out.println("Masukkan Pintu Kursi & Jendela? ");
            ambil.setKuncipintujendela(input.nextLine());
            
            if(ambil.getKuncipintujendela().equals("Ada")){
                System.out.println("Sesuai");
        }else{
                System.out.println("Tidak Sesuai");
                
            }
        }
        
        public void analisisaman(){
            System.out.println("Masukkan Bahaya? ");
            ambil.setBahaya(input.nextLine());
            
            if(ambil.getBahaya().equals("Aman")){
                System.out.println("Sesuai");   
            }else{
                System.out.println("Tidak Sesuai");
            }
        }
        
        public void listinputan(){
            System.out.println("List inputan dari Keamanan Ruang Kelas ");
            System.out.println("Inputan Kokoh : "+ambil.getKokoh());
            System.out.println("Inputan Kunci Pintu & Jendela : "+ambil.getKuncipintujendela());
            System.out.println("Inputan Keamanan Ruang : "+ambil.getBahaya());
        }
        
        public void editan(){
            String dit;
            System.out.println("Ingin Mengedit Inputan? : ");
            dit=input.nextLine();
            if("ya".equals(dit)){
               analisiskokoh();
            } else {
                

            }
        }
        
}    


