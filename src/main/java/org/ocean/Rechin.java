package org.ocean;

// Clasa Rechin
class Rechin extends AnimaleAcvatice {
    private int numarDinti;
    private boolean periculos;
    private String tipRechin;

    // Constructor fără argumente
    public Rechin() {
        super();
        // Rechinii sunt vertebrate, nu mamifere, cu reproducere ovovivipară
        super.setMamifer(false);
        super.setVertebrat(true);
        super.setModReproducere("Ovovivipar");
        this.numarDinti = 0;
        this.periculos = false;
        this.tipRechin = "Necunoscut";
    }

    // Constructor cu toate argumentele
    public Rechin(String nume, String specie, double greutate, double lungime, String culoare,
                  int varsta, int numarDinti, boolean periculos, String tipRechin) {
        // Rechinii sunt vertebrate, nu mamifere, cu reproducere ovovivipară
        super(nume, specie, greutate, lungime, culoare, false, true, "Ovovivipar", varsta);
        this.numarDinti = numarDinti;
        this.periculos = periculos;
        this.tipRechin = tipRechin;
    }

    // Constructor de copiere
    public Rechin(Rechin other) {
        super(other);
        this.numarDinti = other.numarDinti;
        this.periculos = other.periculos;
        this.tipRechin = other.tipRechin;
    }

    // Getters
    public int getNumarDinti() { return numarDinti; }
    public boolean isPericulos() { return periculos; }
    public String getTipRechin() { return tipRechin; }

    // Setters
    public void setNumarDinti(int numarDinti) { this.numarDinti = numarDinti; }
    public void setPericulos(boolean periculos) { this.periculos = periculos; }
    public void setTipRechin(String tipRechin) { this.tipRechin = tipRechin; }

    @Override
    public String getTipBiologic() {
        return "Pește cartilaginos";
    }

    @Override
    public void emiteComportament() {
        System.out.println(getNume() + " înoată rapid și agil în căutarea prăzii.");
    }

    @Override
    public String toString() {
        return "Rechin{" +
                "numarDinti=" + numarDinti +
                ", periculos=" + periculos +
                ", tipRechin='" + tipRechin + '\'' +
                ", " + super.toString() +
                '}';
    }
}