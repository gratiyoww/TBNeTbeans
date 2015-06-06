package tb3;

public class main {

    public static void main(String[] args) {
        IO ambil = new IO();
        System.out.println("==============================================================");
        System.out.println("                      INVENTARIS KAMPUS");
        System.out.println("==============================================================");

        ambil.input_identitas();
        ambil.input_data();

        System.out.println("\n========================HASIL ANALISIS========================");
        ambil.tampil_data();
        System.out.println("==============================================================");
    }
}
