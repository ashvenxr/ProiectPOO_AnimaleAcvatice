package org.ocean;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // ArrayList pentru cele 4 clase
    private static ArrayList<Balena> listaBalene = new ArrayList<>();
    private static ArrayList<Rechin> listaRechini = new ArrayList<>();

    private static ArrayList<PestiTropicali> listaPesti = new ArrayList<>();
    private static ArrayList<Moluste> listaMoluste = new ArrayList<>();

    public static void main(String[] args) {
        /*

        // ~ TESTARE CERINTE 1-2 ~

        System.out.println("~ TEST CONSTRUCTORI - ANIMALE ACVATICE ~\n");

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

        System.out.println("\n~ TEST METODE ABSTRACTE (COMPORTAMENT) ~");

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

        System.out.println("\n~ TEST CARACTERISTICI BIOLOGICE ~");

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

        */

        // ~ TESTARE CERINTE 3-4 ~

        // Populam vectorii cu 10 instanțe fiecare
        initializeazaBalene();
        initializeazaRechini();
        initializeazaPesti();
        initializeazaMoluste();

        // Afisare instante

        System.out.println("=== LISTA BALENE ===");
        afiseazaBalene();

        System.out.println("\n=== LISTA RECHINI ===");
        afiseazaRechini();

        System.out.println("=== LISTA PEȘTI TROPICALI ===");
        afiseazaPesti();

        System.out.println("\n=== LISTA MOLUSTE ===");
        afiseazaMoluste();


        // Filtrare cu conditii de la utilizator
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== FILTRARE BALENE ===");
        filtreazaBalene(scanner);

        System.out.println("\n=== FILTRARE RECHINI ===");
        filtreazaRechini(scanner);

        System.out.println("\n=== FILTRARE PEȘTI TROPICALI ===");
        filtreazaPesti(scanner);

        System.out.println("\n=== FILTRARE MOLUSTE ===");
        filtreazaMoluste(scanner);

        scanner.close();
    }

    // Inițializare vector balene cu 10 instanțe
    private static void initializeazaBalene() {
        listaBalene.add(new Balena("Bubu", "Physeter macrocephalus", 45000.0, 1600.0, "Gri închis",
                25, 300.0, "Calmari giganți", 2000));
        listaBalene.add(new Balena("Mira", "Balaenoptera musculus", 150000.0, 2500.0, "Albastru-cenușiu",
                40, 400.0, "Krill", 500));
        listaBalene.add(new Balena("Rumi", "Megaptera novaeangliae", 30000.0, 1500.0, "Negru cu alb",
                15, 250.0, "Pești mici și krill", 200));
        listaBalene.add(new Balena("Pochita", "Orcinus orca", 5500.0, 800.0, "Negru cu alb",
                30, 150.0, "Pești, foci, balene mici", 300));
        listaBalene.add(new Balena("Yuuji", "Delphinapterus leucas", 1500.0, 500.0, "Alb",
                20, 80.0, "Pești, crustacee", 700));
        listaBalene.add(new Balena("Nobara", "Eschrichtius robustus", 35000.0, 1400.0, "Gri cu pete",
                35, 200.0, "Amfipode", 120));
        listaBalene.add(new Balena("Power", "Balaenoptera acutorostrata", 10000.0, 900.0, "Gri închis",
                18, 100.0, "Krill și pești mici", 350));
        listaBalene.add(new Balena("Eren", "Monodon monoceros", 1600.0, 500.0, "Gri cu pete",
                25, 70.0, "Pești arctici", 800));
        listaBalene.add(new Balena("Denji", "Balaena mysticetus", 100000.0, 2000.0, "Negru",
                100, 350.0, "Krill și copepode", 200));
        listaBalene.add(new Balena("Reze", "Eubalaena glacialis", 70000.0, 1500.0, "Negru",
                50, 300.0, "Zooplancton", 300));
    }

    // Inițializare vector rechini cu 10 instanțe
    private static void initializeazaRechini() {
        listaRechini.add(new Rechin("Jinu", "Carcharodon carcharias", 2000.0, 600.0, "Gri cu burta albă",
                15, 300, true, "Rechin alb"));
        listaRechini.add(new Rechin("Abby", "Sphyrna mokarran", 450.0, 500.0, "Gri-maroniu",
                20, 280, true, "Rechin ciocan"));
        listaRechini.add(new Rechin("Baby", "Galeocerdo cuvier", 900.0, 500.0, "Gri cu dungi",
                25, 350, true, "Rechin tigru"));
        listaRechini.add(new Rechin("Joseph", "Rhincodon typus", 20000.0, 1200.0, "Gri cu pete albe",
                70, 300, false, "Rechin balenă"));
        listaRechini.add(new Rechin("Caesar", "Carcharhinus leucas", 300.0, 350.0, "Gri",
                16, 320, true, "Rechin taur"));
        listaRechini.add(new Rechin("Mikasa", "Isurus oxyrinchus", 250.0, 400.0, "Albastru metalic",
                12, 250, true, "Rechin mako"));
        listaRechini.add(new Rechin("Himeno-senpai", "Cetorhinus maximus", 5000.0, 1000.0, "Gri-maroniu",
                50, 400, false, "Rechin uriaș"));
        listaRechini.add(new Rechin("Aki", "Ginglymostoma cirratum", 150.0, 300.0, "Galben-maroniu",
                25, 200, false, "Rechin doică"));
        listaRechini.add(new Rechin("Beam", "Prionace glauca", 200.0, 380.0, "Albastru intens",
                20, 280, true, "Rechin albastru"));
        listaRechini.add(new Rechin("Reno", "Alopias vulpinus", 350.0, 600.0, "Gri-albăstrui",
                18, 240, false, "Rechin vulpe"));
    }

    // Inițializare vector pești tropicali cu 10 instanțe
    private static void initializeazaPesti() {
        listaPesti.add(new PestiTropicali("Nemo", "Amphiprion ocellaris", 0.05, 8.0, "Portocaliu cu alb",
                2, "Rotunjite", false, 26.0, "Recif de corali"));
        listaPesti.add(new PestiTropicali("Dory", "Paracanthurus hepatus", 0.6, 30.0, "Albastru și negru",
                5, "Triunghiulare", false, 25.0, "Recif tropical"));
        listaPesti.add(new PestiTropicali("Scorpion", "Pterois volitans", 1.2, 38.0, "Roșu cu alb",
                3, "Lungi și veninoase", true, 27.0, "Recif stâncos"));
        listaPesti.add(new PestiTropicali("Angel", "Pomacanthus imperator", 1.5, 40.0, "Albastru cu galben",
                8, "Înalte", false, 26.5, "Recif adânc"));
        listaPesti.add(new PestiTropicali("Butterfly", "Chaetodon auriga", 0.15, 20.0, "Galben cu negru",
                4, "Rotunjite", false, 25.5, "Recif de corali"));
        listaPesti.add(new PestiTropicali("Tang", "Zebrasoma flavescens", 0.25, 20.0, "Galben strălucitor",
                6, "Triunghiulare", false, 26.0, "Recif tropical"));
        listaPesti.add(new PestiTropicali("Mandarin", "Synchiropus splendidus", 0.08, 6.0, "Multicolor",
                1, "Mici și colorate", false, 24.0, "Recif cu alge"));
        listaPesti.add(new PestiTropicali("Blenny", "Ecsenius bicolor", 0.03, 10.0, "Portocaliu și albastru",
                3, "Lungi și subțiri", false, 25.0, "Recif stâncos"));
        listaPesti.add(new PestiTropicali("Puffer", "Arothron meleagris", 2.0, 50.0, "Negru cu puncte albe",
                7, "Rotunjite", true, 27.0, "Recif adânc"));
        listaPesti.add(new PestiTropicali("Wrasse", "Thalassoma lunare", 0.5, 25.0, "Verde și albastru",
                4, "Lungi", false, 26.0, "Recif de corali"));
    }

    // Inițializare vector moluste cu 10 instanțe
    private static void initializeazaMoluste() {
        listaMoluste.add(new Moluste("Octavia", "Octopus vulgaris", 3.0, 60.0, "Maro-roșcat",
                2, false, 8, "Fără cochilie", 5.0));
        listaMoluste.add(new Moluste("Squidward", "Loligo vulgaris", 1.5, 40.0, "Alb transparent",
                3, false, 10, "Fără cochilie", 8.0));
        listaMoluste.add(new Moluste("Gary", "Helix pomatia", 0.03, 5.0, "Maro cu spirală",
                1, true, 4, "Spiralată", 0.05));
        listaMoluste.add(new Moluste("Shelley", "Pecten maximus", 0.5, 15.0, "Roz cu alb",
                5, true, 0, "Bivalvă striată", 0.2));
        listaMoluste.add(new Moluste("Clamy", "Mercenaria mercenaria", 0.2, 10.0, "Alb-cenușiu",
                4, true, 0, "Bivalvă netedă", 0.1));
        listaMoluste.add(new Moluste("Cuttlebert", "Sepia officinalis", 2.0, 45.0, "Maro variabil",
                2, false, 10, "Fără cochilie", 6.5));
        listaMoluste.add(new Moluste("Nautilus", "Nautilus pompilius", 1.0, 20.0, "Alb cu maro",
                10, true, 90, "Spiralată camerată", 3.0));
        listaMoluste.add(new Moluste("Sluggy", "Aplysia californica", 0.8, 30.0, "Roșu-maro",
                1, false, 4, "Fără cochilie", 1.5));
        listaMoluste.add(new Moluste("Mussel", "Mytilus edulis", 0.1, 8.0, "Negru-albăstrui",
                3, true, 0, "Bivalvă alungită", 0.05));
        listaMoluste.add(new Moluste("Conch", "Strombus gigas", 2.5, 35.0, "Roz și alb",
                8, true, 2, "Spiralată mare", 0.3));
    }

    // Afișare balene
    private static void afiseazaBalene() {
        for (int i = 0; i < listaBalene.size(); i++) {
            System.out.println((i + 1) + ". " + listaBalene.get(i));
        }
    }

    // Afișare rechini
    private static void afiseazaRechini() {
        for (int i = 0; i < listaRechini.size(); i++) {
            System.out.println((i + 1) + ". " + listaRechini.get(i));
        }
    }

    // Afișare pești tropicali
    private static void afiseazaPesti() {
        for (int i = 0; i < listaPesti.size(); i++) {
            System.out.println((i + 1) + ". " + listaPesti.get(i));
        }
    }

    // Afișare moluste
    private static void afiseazaMoluste() {
        for (int i = 0; i < listaMoluste.size(); i++) {
            System.out.println((i + 1) + ". " + listaMoluste.get(i));
        }
    }

    // Filtrare balene după 2 condiții
    private static void filtreazaBalene(Scanner scanner) {
        System.out.println("Introduceți criteriile de filtrare pentru balene:");

        System.out.print("1. Greutate minimă (kg): ");
        double greutateMin = scanner.nextDouble();

        System.out.print("2. Adâncime maximă minimă (m): ");
        int adancimeMin = scanner.nextInt();

        System.out.println("\n--- Balene care satisfac ambele condiții ---");
        boolean gasit = false;

        for (Balena balena : listaBalene) {
            if (balena.getGreutate() >= greutateMin && balena.getAdancimeMaxima() >= adancimeMin) {
                System.out.println("✓ " + balena.getNume() + " - Greutate: " + balena.getGreutate() +
                        "kg, Adâncime max: " + balena.getAdancimeMaxima() + "m");
                gasit = true;
            }
        }

        if (!gasit) {
            System.out.println("Nu există balene care satisfac aceste condiții.");
        }
    }

    // Filtrare rechini după 2 condiții
    private static void filtreazaRechini(Scanner scanner) {
        System.out.println("Introduceți criteriile de filtrare pentru rechini:");

        System.out.print("1. Este periculos? (true/false): ");
        boolean periculos = scanner.nextBoolean();

        System.out.print("2. Număr minim de dinți: ");
        int numarDintiMin = scanner.nextInt();

        System.out.println("\n--- Rechini care satisfac ambele condiții ---");
        boolean gasit = false;

        for (Rechin rechin : listaRechini) {
            if (rechin.isPericulos() == periculos && rechin.getNumarDinti() >= numarDintiMin) {
                System.out.println("✓ " + rechin.getNume() + " - Periculos: " + rechin.isPericulos() +
                        ", Număr dinți: " + rechin.getNumarDinti());
                gasit = true;
            }
        }

        if (!gasit) {
            System.out.println("Nu există rechini care satisfac aceste condiții.");
        }
    }


    // Filtrare pești tropicali după 2 condiții
    private static void filtreazaPesti(Scanner scanner) {
        System.out.println("Introduceți criteriile de filtrare pentru pești:");

        System.out.print("1. Greutate minimă (kg): ");
        double greutateMin = scanner.nextDouble();

        System.out.print("2. Lungime minimă (cm): ");
        double lungimeMin = scanner.nextDouble();

        System.out.println("\n--- Pești care satisfac ambele condiții ---");
        boolean gasit = false;

        for (PestiTropicali peste : listaPesti) {
            if (peste.getGreutate() >= greutateMin && peste.getLungime() >= lungimeMin) {
                System.out.println("✓ " + peste.getNume() + " - Greutate: " + peste.getGreutate() +
                        "kg, Lungime: " + peste.getLungime() + "cm");
                gasit = true;
            }
        }

        if (!gasit) {
            System.out.println("Nu există pești care satisfac aceste condiții.");
        }
    }

    // Filtrare moluste după 2 condiții
    private static void filtreazaMoluste(Scanner scanner) {
        System.out.println("Introduceți criteriile de filtrare pentru moluste:");

        System.out.print("1. Au cochilie? (true/false): ");
        boolean areCochilie = scanner.nextBoolean();

        System.out.print("2. Număr minim de tentacule: ");
        int numarTentaculeMin = scanner.nextInt();

        System.out.println("\n--- Moluste care satisfac ambele condiții ---");
        boolean gasit = false;

        for (Moluste molusc : listaMoluste) {
            if (molusc.isAreCochilie() == areCochilie && molusc.getNumarTentacule() >= numarTentaculeMin) {
                System.out.println("✓ " + molusc.getNume() + " - Cochilie: " + molusc.isAreCochilie() +
                        ", Tentacule: " + molusc.getNumarTentacule());
                gasit = true;
            }
        }

        if (!gasit) {
            System.out.println("Nu există moluste care satisfac aceste condiții.");
        }
    }
}
