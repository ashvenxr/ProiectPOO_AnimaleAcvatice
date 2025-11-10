package org.ocean;

// Clasa Moluste
class Moluste extends AnimaleAcvatice {
    private boolean areCochilie;
    private int numarTentacule;
    private String tipCochilie;
    private double vitezaMiscare;

    // Constructor fără argumente
    public Moluste() {
        super();
        // Molustele nu sunt mamifere, nu sunt vertebrate și au reproducere ovipară
        super.setMamifer(false);
        super.setVertebrat(false);
        super.setModReproducere("Ovipar");
        this.areCochilie = false;
        this.numarTentacule = 0;
        this.tipCochilie = "Fără cochilie";
        this.vitezaMiscare = 0.0;
    }

    // Constructor cu toate argumentele
    public Moluste(String nume, String specie, double greutate, double lungime, String culoare,
                   int varsta, boolean areCochilie, int numarTentacule,
                   String tipCochilie, double vitezaMiscare) {
        super(nume, specie, greutate, lungime, culoare, false, false, "Ovipar", varsta);
        this.areCochilie = areCochilie;
        this.numarTentacule = numarTentacule;
        this.tipCochilie = tipCochilie;
        this.vitezaMiscare = vitezaMiscare;
    }

    // Constructor de copiere
    public Moluste(Moluste other) {
        super(other);
        this.areCochilie = other.areCochilie;
        this.numarTentacule = other.numarTentacule;
        this.tipCochilie = other.tipCochilie;
        this.vitezaMiscare = other.vitezaMiscare;
    }

    // Getters
    public boolean isAreCochilie() { return areCochilie; }
    public int getNumarTentacule() { return numarTentacule; }
    public String getTipCochilie() { return tipCochilie; }
    public double getVitezaMiscare() { return vitezaMiscare; }

    // Setters
    public void setAreCochilie(boolean areCochilie) { this.areCochilie = areCochilie; }
    public void setNumarTentacule(int numarTentacule) { this.numarTentacule = numarTentacule; }
    public void setTipCochilie(String tipCochilie) { this.tipCochilie = tipCochilie; }
    public void setVitezaMiscare(double vitezaMiscare) { this.vitezaMiscare = vitezaMiscare; }

    @Override
    public String getTipBiologic() {
        return "Nevertebrat marin";
    }

    @Override
    public void emiteComportament() {
        System.out.println(getNume() + " se deplasează lent pe fundul oceanului.");
    }

    @Override
    public String toString() {
        return "Moluste{" +
                "areCochilie=" + areCochilie +
                ", numarTentacule=" + numarTentacule +
                ", tipCochilie='" + tipCochilie + '\'' +
                ", vitezaMiscare=" + vitezaMiscare +
                ", " + super.toString() +
                '}';
    }
}