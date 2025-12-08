package org.ocean;

import javax.swing.*;
import java.util.ArrayList;

public class MainGUI {
    // ArrayList pentru cele 4 clase
    private static ArrayList<Balena> listaBalene = new ArrayList<>();
    private static ArrayList<Rechin> listaRechini = new ArrayList<>();
    private static ArrayList<PestiTropicali> listaPesti = new ArrayList<>();
    private static ArrayList<Moluste> listaMoluste = new ArrayList<>();

    public static void main(String[] args) {
        // Populăm listele cu date
        initializeazaBalene();
        initializeazaRechini();
        initializeazaPesti();
        initializeazaMoluste();

        // Cerinta 5: Lansăm interfața grafică
        SwingUtilities.invokeLater(() -> {
            OceanGUI gui = new OceanGUI(listaBalene, listaRechini, listaPesti, listaMoluste);
            gui.setVisible(true);
        });
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
}