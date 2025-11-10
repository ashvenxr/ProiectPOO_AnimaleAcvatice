package org.ocean;

// Clasa de test
public class Main {
    public static void main(String[] args) {
        System.out.println("~TEST CONSTRUCTORI - ANIMALE ACVATICE~");

        // ========== TEST CONSTRUCTORI BALENA ==========
        System.out.println("========== BALENA ==========\n");

        // Constructor fără argumente
        System.out.println("1. Constructor fără argumente:");
        Balena balena1 = new Balena();
        System.out.println(balena1);
        System.out.println();

        // Constructor cu toate argumentele
        System.out.println("2. Constructor cu toate argumentele:");
        Balena balena2 = new Balena("Bubu", "Balena Albastră", 120000.0, 25.0, "Albastru-gri",
                50, 400.0, "plancton", 500);
        System.out.println(balena2);
        System.out.println();

        // Constructor de copiere
        System.out.println("3. Constructor de copiere:");
        Balena balena3 = new Balena(balena2);
        System.out.println(balena3);
        System.out.println();

        // ========== TEST CONSTRUCTORI RECHIN ==========
        System.out.println("\n========== RECHIN ==========\n");

        // Constructor fără argumente
        System.out.println("1. Constructor fără argumente:");
        Rechin rechin1 = new Rechin();
        System.out.println(rechin1);
        System.out.println();

        // Constructor cu toate argumentele
        System.out.println("2. Constructor cu toate argumentele:");
        Rechin rechin2 = new Rechin("Jinu", "Rechin Alb", 1500.0, 6.0, "Gri",
                25, 300, true, "Alb");
        System.out.println(rechin2);
        System.out.println();

        // Constructor de copiere
        System.out.println("3. Constructor de copiere:");
        Rechin rechin3 = new Rechin(rechin2);
        System.out.println(rechin3);
        System.out.println();

        // ========== TEST CONSTRUCTORI PEȘTI TROPICALI ==========
        System.out.println("\n========== PEȘTI TROPICALI ==========\n");

        // Constructor fără argumente
        System.out.println("1. Constructor fără argumente:");
        PestiTropicali peste1 = new PestiTropicali();
        System.out.println(peste1);
        System.out.println();

        // Constructor cu toate argumentele
        System.out.println("2. Constructor cu toate argumentele:");
        PestiTropicali peste2 = new PestiTropicali("Nemo", "Pește Clovn", 0.3, 0.11, "Portocaliu cu alb",
                3, "Rotunjite", false, 26.0, "Recif de corali");
        System.out.println(peste2);
        System.out.println();

        // Constructor de copiere
        System.out.println("3. Constructor de copiere:");
        PestiTropicali peste3 = new PestiTropicali(peste2);
        System.out.println(peste3);
        System.out.println();

        // ========== TEST CONSTRUCTORI MOLUȘTE ==========
        System.out.println("\n========== MOLUȘTE ==========\n");

        // Constructor fără argumente
        System.out.println("1. Constructor fără argumente:");
        Moluste mollusca1 = new Moluste();
        System.out.println(mollusca1);
        System.out.println();

        // Constructor cu toate argumentele
        System.out.println("2. Constructor cu toate argumentele:");
        Moluste mollusca2 = new Moluste("Octavia", "Caracatiță comună", 15.0, 0.9, "Maro-roșcat",
                4, false, 8, "Fără cochilie", 40.0);
        System.out.println(mollusca2);
        System.out.println();

        // Constructor de copiere
        System.out.println("3. Constructor de copiere:");
        Moluste mollusca3 = new Moluste(mollusca2);
        System.out.println(mollusca3);
        System.out.println();

        // ========== TEST METODE ABSTRACTE ==========

        System.out.println("\n~TEST METODE ABSTRACTE (COMPORTAMENT)~");

        System.out.println("=== BALENA ===");
        System.out.println("Tip Biologic: " + balena2.getTipBiologic());
        balena2.emiteComportament();

        System.out.println("\n=== RECHIN ===");
        System.out.println("Tip Biologic: " + rechin2.getTipBiologic());
        rechin2.emiteComportament();

        System.out.println("\n=== PEȘTE TROPICAL ===");
        System.out.println("Tip Biologic: " + peste2.getTipBiologic());
        peste2.emiteComportament();

        System.out.println("\n=== MOLUSCĂ ===");
        System.out.println("Tip Biologic: " + mollusca2.getTipBiologic());
        mollusca2.emiteComportament();

        // ========== TEST CARACTERISTICI BIOLOGICE ==========
        System.out.println("\n~TEST CARACTERISTICI BIOLOGICE~");

        System.out.println("=== BALENA (Bubu) ===");
        System.out.println("  - Nume: " + balena2.getNume());
        System.out.println("  - Specie: " + balena2.getSpecie());
        System.out.println("  - Este mamifer? " + (balena2.isMamifer() ? "Da" : "Nu"));
        System.out.println("  - Este vertebrat? " + (balena2.isVertebrat() ? "Da" : "Nu"));
        System.out.println("  - Mod reproducere: " + balena2.getModReproducere());
        System.out.println("  - Vârsta: " + balena2.getVarsta() + " ani");
        System.out.println("  - Greutate: " + balena2.getGreutate() + " kg");
        System.out.println("  - Lungime: " + balena2.getLungime() + " m");
        System.out.println("  - Culoare: " + balena2.getCuloare());
        System.out.println("  - Cantitate apă expulzată: " + balena2.getCantitateApaExpulzata() + " litri");
        System.out.println("  - Tip hrană: " + balena2.getTipHrana());
        System.out.println("  - Adâncime maximă: " + balena2.getAdancimeMaxima() + " m");

        System.out.println("\n=== RECHIN (Jinu) ===");
        System.out.println("  - Nume: " + rechin2.getNume());
        System.out.println("  - Specie: " + rechin2.getSpecie());
        System.out.println("  - Este mamifer? " + (rechin2.isMamifer() ? "Da" : "Nu"));
        System.out.println("  - Este vertebrat? " + (rechin2.isVertebrat() ? "Da" : "Nu"));
        System.out.println("  - Mod reproducere: " + rechin2.getModReproducere());
        System.out.println("  - Vârsta: " + rechin2.getVarsta() + " ani");
        System.out.println("  - Greutate: " + rechin2.getGreutate() + " kg");
        System.out.println("  - Lungime: " + rechin2.getLungime() + " m");
        System.out.println("  - Culoare: " + rechin2.getCuloare());
        System.out.println("  - Număr dinți: " + rechin2.getNumarDinti());
        System.out.println("  - Este periculos? " + (rechin2.isPericulos() ? "Da" : "Nu"));
        System.out.println("  - Tip rechin: " + rechin2.getTipRechin());

        System.out.println("\n=== PEȘTE TROPICAL (Nemo) ===");
        System.out.println("  - Nume: " + peste2.getNume());
        System.out.println("  - Specie: " + peste2.getSpecie());
        System.out.println("  - Este mamifer? " + (peste2.isMamifer() ? "Da" : "Nu"));
        System.out.println("  - Este vertebrat? " + (peste2.isVertebrat() ? "Da" : "Nu"));
        System.out.println("  - Mod reproducere: " + peste2.getModReproducere());
        System.out.println("  - Vârsta: " + peste2.getVarsta() + " ani");
        System.out.println("  - Greutate: " + peste2.getGreutate() + " kg");
        System.out.println("  - Lungime: " + peste2.getLungime() + " m");
        System.out.println("  - Culoare: " + peste2.getCuloare());
        System.out.println("  - Tip aripioare: " + peste2.getTipAripioare());
        System.out.println("  - Este veninos? " + (peste2.isVeninosi() ? "Da" : "Nu"));
        System.out.println("  - Temperatură optimă: " + peste2.getTemperaturaOptima() + "°C");
        System.out.println("  - Habitat: " + peste2.getHabitatRecif());

        System.out.println("\n=== MOLUSCĂ (Octavia) ===");
        System.out.println("  - Nume: " + mollusca2.getNume());
        System.out.println("  - Specie: " + mollusca2.getSpecie());
        System.out.println("  - Este mamifer? " + (mollusca2.isMamifer() ? "Da" : "Nu"));
        System.out.println("  - Este vertebrat? " + (mollusca2.isVertebrat() ? "Da" : "Nu"));
        System.out.println("  - Mod reproducere: " + mollusca2.getModReproducere());
        System.out.println("  - Vârsta: " + mollusca2.getVarsta() + " ani");
        System.out.println("  - Greutate: " + mollusca2.getGreutate() + " kg");
        System.out.println("  - Lungime: " + mollusca2.getLungime() + " m");
        System.out.println("  - Culoare: " + mollusca2.getCuloare());
        System.out.println("  - Are cochilie? " + (mollusca2.isAreCochilie() ? "Da" : "Nu"));
        System.out.println("  - Număr tentacule: " + mollusca2.getNumarTentacule());
        System.out.println("  - Tip cochilie: " + mollusca2.getTipCochilie());
        System.out.println("  - Viteză mișcare: " + mollusca2.getVitezaMiscare() + " km/h");

    }

}