package org.ocean;

// Clasa Balena
class Balena extends AnimaleAcvatice {
    private int varsta;
    private String tipHrana;
    private int adancimeMaxima;

    // Constructor fără argumente
    public Balena() {
        super();
        // Balenele sunt mamifere vertebrate cu reproducere vivipară
        super.setMamifer(true);
        super.setVertebrat(true);
        super.setModReproducere("Vivipar");
        this.varsta = 0;
        this.tipHrana = "Necunoscută";
        this.adancimeMaxima = 0;
    }

    // Constructor cu toate argumentele
    public Balena(String nume, String specie, double greutate, double lungime, String culoare,
                  int varsta, String tipHrana, int adancimeMaxima) {
        // Balenele sunt mamifere vertebrate cu reproducere vivipară
        super(nume, specie, greutate, lungime, culoare, true, true, "Vivipar");
        this.varsta = varsta;
        this.tipHrana = tipHrana;
        this.adancimeMaxima = adancimeMaxima;
    }

    // Constructor de copiere
    public Balena(Balena other) {
        super(other);
        this.varsta = other.varsta;
        this.tipHrana = other.tipHrana;
        this.adancimeMaxima = other.adancimeMaxima;
    }

    // Getters
    public int getVarsta() { return varsta; }
    public String getTipHrana() { return tipHrana; }
    public int getAdancimeMaxima() { return adancimeMaxima; }

    // Setters
    public void setVarsta(int varsta) { this.varsta = varsta; }
    public void setTipHrana(String tipHrana) { this.tipHrana = tipHrana; }
    public void setAdancimeMaxima(int adancimeMaxima) { this.adancimeMaxima = adancimeMaxima; }

    @Override
    public String getTipComportament() {
        return "Mamifer marin";
    }

    @Override
    public void emiteComportament() {
        System.out.println(getNume() + " iese la suprafață pentru a respira aer.");
    }

    @Override
    public String toString() {
        return "Balena{" +
                "varsta=" + varsta +
                ", tipHrana='" + tipHrana + '\'' +
                ", adancimeMaxima=" + adancimeMaxima +
                ", " + super.toString() +
                '}';
    }
}
