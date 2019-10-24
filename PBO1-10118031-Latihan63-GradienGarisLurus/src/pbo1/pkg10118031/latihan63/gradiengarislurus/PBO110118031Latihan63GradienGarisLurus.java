package pbo1.pkg10118031.latihan63.gradiengarislurus;

/**
 *
 * @author Vendetta 
 * NAMA : RIZKI ARIA PUTRA 
 * KELAS : PBO1 
 * NIM : 10118031
 * Deskripsi Program : Program ini berisi program untuk membuat tampilan gradien garis lurus
 *                     menggunakan interface.
 */
public class PBO110118031Latihan63GradienGarisLurus {

    public static void main(String[] args) {

        Koordinat koordinat1 = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik (" + koordinat1.getX1() + ","
                + koordinat1.getY1() + ") dan (" + koordinat1.getX2() + ","
                + koordinat1.getY2() + ")");
        System.out.println("memiliki gradien sebesar "
                + koordinat1.hitungGradien());

        Koordinat koordinat2 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik (" + koordinat2.getX1() + ","
                + koordinat2.getY1() + ") dan (" + koordinat2.getX2() + ","
                + koordinat2.getY2() + ")");
        System.out.println("memiliki gradien sebesar "
                + koordinat2.hitungGradien());
    }

}
