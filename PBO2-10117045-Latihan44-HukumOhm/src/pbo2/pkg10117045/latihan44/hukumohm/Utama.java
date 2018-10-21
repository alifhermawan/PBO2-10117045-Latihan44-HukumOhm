package pbo2.pkg10117045.latihan44.hukumohm;

/**
 *
 * @author 
 * NAMA     : Alif hermawan
 * KELAS    : IF-2
 * NIM      : 10117045
 * Deskripsi Program : Program ini berisi perintah untuk mmenghitung besar 
 * tegangan menggunakan hukum Ohm
 */
public class Utama {

    public static void main(String[] args) {
        Baterai batre = new Baterai();
        Baterai batre1 = new Baterai(3, 12);
        System.out.println("Kuat Arus : " + batre1.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + batre1.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + batre1.hitungTegangan() + " volt");
    }

}
