package org.ocean;

// Clasa Balena
class Balena extends AnimaleAcvatice {
    private double cantitateApaExpulzata;
    private String tipHrana;
    private int adancimeMaxima;

    // Constructor fără argumente
    public Balena() {
        super();
        // Balenele sunt mamifere vertebrate cu reproducere vivipară
        super.setMamifer(true);
        super.setVertebrat(true);
        super.setModReproducere("Vivipar");
        this.cantitateApaExpulzata = 0.0;
        this.tipHrana = "Necunoscută";
        this.adancimeMaxima = 0;
    }

    // Constructor cu toate argumentele
    public Balena(String nume, String specie, double greutate, double lungime, String culoare,
                  int varsta, double cantitateApaExpulzata, String tipHrana, int adancimeMaxima) {
        // Balenele sunt mamifere vertebrate cu reproducere vivipară
        super(nume, specie, greutate, lungime, culoare, true, true, "Vivipar", varsta);
        this.cantitateApaExpulzata = cantitateApaExpulzata;
        this.tipHrana = tipHrana;
        this.adancimeMaxima = adancimeMaxima;
    }

    // Constructor de copiere
    public Balena(Balena other) {
        super(other);
        this.cantitateApaExpulzata = other.cantitateApaExpulzata;
        this.tipHrana = other.tipHrana;
        this.adancimeMaxima = other.adancimeMaxima;
    }

    // Getters
    public double getCantitateApaExpulzata() { return cantitateApaExpulzata; }
    public String getTipHrana() { return tipHrana; }
    public int getAdancimeMaxima() { return adancimeMaxima; }

    // Setters
    public void setCantitateApaExpulzata(double cantitateApaExpulzata) {
        this.cantitateApaExpulzata = cantitateApaExpulzata;
    }
    public void setTipHrana(String tipHrana) { this.tipHrana = tipHrana; }
    public void setAdancimeMaxima(int adancimeMaxima) { this.adancimeMaxima = adancimeMaxima; }

    @Override
    public String getTipBiologic() {
        return "Mamifer marin";
    }

    @Override
    public void emiteComportament() {
        System.out.println(getNume() + " iese la suprafață pentru a respira aer.");
    }

    @Override
    public String toString() {
        return "Balena{" +
                "cantitateApaExpulzata=" + cantitateApaExpulzata +
                ", tipHrana='" + tipHrana + '\'' +
                ", adancimeMaxima=" + adancimeMaxima +
                ", " + super.toString() +
                '}';
    }
}