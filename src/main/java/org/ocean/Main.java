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

        //.

        // ========== TEST METODE ABSTRACTE ==========

        System.out.println("\n~TEST METODE ABSTRACTE (COMPORTAMENT)~");

        System.out.println("=== BALENA ===");
        System.out.println("Tip Biologic: " + balena2.getTipBiologic());
        balena2.emiteComportament();

        System.out.println("\n=== RECHIN ===");
        System.out.println("Tip Biologic: " + rechin2.getTipBiologic());
        rechin2.emiteComportament();

       //.



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

//.

    }
}