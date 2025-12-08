package org.ocean;

// Clasa PestiTropicali
class PestiTropicali extends AnimaleAcvatice {

    private String tipAripioare;
    private boolean veninosi;
    private double temperaturaOptima;
    private String habitatRecif;

    public PestiTropicali() {
        super();
        super.setMamifer(false);
        super.setVertebrat(true);
        super.setModReproducere("Ovipar");
        this.tipAripioare = "Necunoscut";
        this.veninosi = false;
        this.temperaturaOptima = 25.0;
        this.habitatRecif = "Necunoscut";
    }

    public PestiTropicali(String nume, String specie, double greutate, double lungime, String culoare,
                          int varsta, String tipAripioare, boolean veninosi,
                          double temperaturaOptima, String habitatRecif) {
        super(nume, specie, greutate, lungime, culoare, false, true, "Ovipar", varsta);
        this.tipAripioare = tipAripioare;
        this.veninosi = veninosi;
        this.temperaturaOptima = temperaturaOptima;
        this.habitatRecif = habitatRecif;
    }

    public PestiTropicali(PestiTropicali other) {
        super(other);
        this.tipAripioare = other.tipAripioare;
        this.veninosi = other.veninosi;
        this.temperaturaOptima = other.temperaturaOptima;
        this.habitatRecif = other.habitatRecif;
    }

    public String getTipAripioare() { return tipAripioare; }
    public boolean isVeninosi() { return veninosi; }
    public double getTemperaturaOptima() { return temperaturaOptima; }
    public String getHabitatRecif() { return habitatRecif; }

    public void setTipAripioare(String tipAripioare) { this.tipAripioare = tipAripioare; }
    public void setVeninosi(boolean veninosi) { this.veninosi = veninosi; }
    public void setTemperaturaOptima(double temperaturaOptima) { this.temperaturaOptima = temperaturaOptima; }
    public void setHabitatRecif(String habitatRecif) { this.habitatRecif = habitatRecif; }

    @Override
    public String getTipBiologic() {
        return "Pește tropical de recif";
    }

    @Override
    public void emiteComportament() {
        System.out.println(getNume() + " înoată printre corali în căutare de hrană.");
    }

    @Override
    public String toString() {
        return "PestiTropicali{" +
                "tipAripioare='" + tipAripioare + '\'' +
                ", veninosi=" + veninosi +
                ", temperaturaOptima=" + temperaturaOptima +
                ", habitatRecif='" + habitatRecif + '\'' +
                ", " + super.toString() +
                '}';
    }
}
