package org.ocean;

import java.io.Serializable;

// Clasa abstractă AnimaleAcvatice
abstract class AnimaleAcvatice implements Serializable {
    private String nume;
    private String specie;
    private double greutate;
    private double lungime;
    private String culoare;
    private boolean mamifer;
    private boolean vertebrat;
    private String modReproducere;
    private int varsta;

    // Constructor fără argumente
    public AnimaleAcvatice() {
        this.nume = "Necunoscut";
        this.specie = "Necunoscută";
        this.greutate = 0.0;
        this.lungime = 0.0;
        this.culoare = "Necunoscută";
        this.mamifer = false;
        this.vertebrat = false;
        this.modReproducere = "Necunoscut";
        this.varsta = 0;
    }

    // Constructor cu toate argumentele
    public AnimaleAcvatice(String nume, String specie, double greutate, double lungime,
                           String culoare, boolean mamifer, boolean vertebrat, String modReproducere, int varsta) {
        this.nume = nume;
        this.specie = specie;
        this.greutate = greutate;
        this.lungime = lungime;
        this.culoare = culoare;
        this.mamifer = mamifer;
        this.vertebrat = vertebrat;
        this.modReproducere = modReproducere;
        this.varsta = varsta;
    }

    // Constructor de copiere
    public AnimaleAcvatice(AnimaleAcvatice other) {
        this.nume = other.nume;
        this.specie = other.specie;
        this.greutate = other.greutate;
        this.lungime = other.lungime;
        this.culoare = other.culoare;
        this.mamifer = other.mamifer;
        this.vertebrat = other.vertebrat;
        this.modReproducere = other.modReproducere;
        this.varsta = other.varsta;
    }

    // Metode abstracte care vor fi implementate în clasele derivate
    public abstract String getTipBiologic();
    public abstract void emiteComportament();

    // Getters
    public String getNume() { return nume; }
    public String getSpecie() { return specie; }
    public double getGreutate() { return greutate; }
    public double getLungime() { return lungime; }
    public String getCuloare() { return culoare; }
    public boolean isMamifer() { return mamifer; }
    public boolean isVertebrat() { return vertebrat; }
    public String getModReproducere() { return modReproducere; }
    public int getVarsta() { return varsta; }

    // Setters
    public void setNume(String nume) { this.nume = nume; }
    public void setSpecie(String specie) { this.specie = specie; }
    public void setGreutate(double greutate) { this.greutate = greutate; }
    public void setLungime(double lungime) { this.lungime = lungime; }
    public void setCuloare(String culoare) { this.culoare = culoare; }
    public void setMamifer(boolean mamifer) { this.mamifer = mamifer; }
    public void setVertebrat(boolean vertebrat) { this.vertebrat = vertebrat; }
    public void setModReproducere(String modReproducere) { this.modReproducere = modReproducere; }
    public void setVarsta(int varsta) { this.varsta = varsta; }

    @Override
    public String toString() {
        return "AnimaleAcvatice{" +
                "nume='" + nume + '\'' +
                ", specie='" + specie + '\'' +
                ", greutate=" + greutate +
                ", lungime=" + lungime +
                ", culoare='" + culoare + '\'' +
                ", mamifer=" + mamifer +
                ", vertebrat=" + vertebrat +
                ", modReproducere='" + modReproducere + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}