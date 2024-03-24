class Segitiga {
    private double alas;
    private double tinggi;
    private double sisi;

    // Konstruktor default
    public Segitiga() {
        alas = 0;
        tinggi = 0;
        sisi = 0;
    }

    // Konstruktor dengan parameter
    public Segitiga(double alasBaru, double tinggiBaru, double sisiBaru) {
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisi = sisiBaru;
    }

    // Method
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    // Method
    public double getKeliling() {
        return alas + sisi + sisi;
    }

    // Setter
    public void setAlas(double alasBaru) {
        alas = alasBaru;
    }

    // Setter
    public void setTinggi(double tinggiBaru) {
        tinggi = tinggiBaru;
    }

    // Setter
    public void setSisi(double sisiBaru) {
        sisi = sisiBaru;
    }
}

public class Main {
    public static void main(String[] args) {
        Segitiga segitiga1 = new Segitiga();

        segitiga1.setAlas(1);
        segitiga1.setTinggi(1);
        segitiga1.setSisi(1);

        System.out.println("Segitiga 1:");
        System.out.println("Luas: " + segitiga1.getLuas());
        System.out.println("Keliling: " + segitiga1.getKeliling());

        Segitiga segitiga2 = new Segitiga(30, 10, 90);

        System.out.println("\nSegitiga 2:");
        System.out.println("Luas: " + segitiga2.getLuas());
        System.out.println("Keliling: " + segitiga2.getKeliling());
        
        Segitiga segitiga3 = new Segitiga(20, 30, 60);

        System.out.println("\nSegitiga 2:");
        System.out.println("Luas: " + segitiga3.getLuas());
        System.out.println("Keliling: " + segitiga3.getKeliling());
    }
}
