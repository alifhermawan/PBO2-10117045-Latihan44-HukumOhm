package pbo2.pkg10117045.latihan44.hukumohm;


public class Baterai {

    private float kuatArus;
    private float hambatan;

    public Baterai() {
        System.out.println("=====Hukum Ohm=====\nKuat arus yang mengalir pada"
                + " suatu kawat penghantar \nakan berbanding lurus dengan beda "
                + "potensial \npada ujung-ujung kawat penghantar tersebut /n"
                + "asalkan suhu kawat dijaga konstan \n");
    }

    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public float hitungTegangan() {
        return kuatArus * hambatan;

    }
}
