package org.ocean;

import java.io.*;
import java.util.ArrayList;

// Cerinta 6

public class FileManager {
    // Căile către fișierele unde se salvează datele
    private static final String FISIER_BALENE = "balene.dat";
    private static final String FISIER_RECHINI = "rechini.dat";
    private static final String FISIER_PESTI = "pesti_tropicali.dat";
    private static final String FISIER_MOLUSTE = "moluste.dat";

    public void salveazaInFisier(String filepath, ArrayList<?> lista) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(lista);
            objectOut.close();
            fileOut.close();

            System.out.println("✓ Lista a fost salvată cu succes în fișierul: " + filepath);
            System.out.println("  Număr de elemente salvate: " + lista.size());

        } catch (IOException ex) {
            System.err.println("✗ Eroare la salvarea în fișier: " + filepath);
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public ArrayList<?> citestedinFisier(String filepath) {
        try {
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            ArrayList<?> lista = (ArrayList<?>) objectIn.readObject();
            objectIn.close();
            fileIn.close();

            System.out.println("✓ Lista a fost citită cu succes din fișierul: " + filepath);
            System.out.println("  Număr de elemente citite: " + lista.size());

            return lista;

        } catch (FileNotFoundException ex) {
            System.out.println("ℹ Fișierul " + filepath + " nu există încă.");
            return null;
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println("✗ Eroare la citirea din fișier: " + filepath);
            ex.printStackTrace();
            return null;
        }
    }

    //Salvează toate listele de animale în fișiere separate
    public void salveazaToateDatele(ArrayList<Balena> balene,
                                    ArrayList<Rechin> rechini,
                                    ArrayList<PestiTropicali> pesti,
                                    ArrayList<Moluste> moluste) {
        System.out.println("\n========== SALVARE DATE ÎN FIȘIERE ==========");
        salveazaInFisier(FISIER_BALENE, balene);
        salveazaInFisier(FISIER_RECHINI, rechini);
        salveazaInFisier(FISIER_PESTI, pesti);
        salveazaInFisier(FISIER_MOLUSTE, moluste);
        System.out.println("=============================================\n");
    }

    //Citește toate listele de animale din fișiere
    @SuppressWarnings("unchecked")
    public void citesteToateDatele() {
        System.out.println("\n========== CITIRE DATE DIN FIȘIERE ==========");

        ArrayList<Balena> balene = (ArrayList<Balena>) citestedinFisier(FISIER_BALENE);
        if (balene != null) {
            System.out.println("Balene citite:");
            for (Balena b : balene) {
                System.out.println("  - " + b.getNume() + " (" + b.getSpecie() + ")");
            }
        }

        ArrayList<Rechin> rechini = (ArrayList<Rechin>) citestedinFisier(FISIER_RECHINI);
        if (rechini != null) {
            System.out.println("Rechini citiți:");
            for (Rechin r : rechini) {
                System.out.println("  - " + r.getNume() + " (" + r.getSpecie() + ")");
            }
        }

        ArrayList<PestiTropicali> pesti = (ArrayList<PestiTropicali>) citestedinFisier(FISIER_PESTI);
        if (pesti != null) {
            System.out.println("Pești tropicali citiți:");
            for (PestiTropicali p : pesti) {
                System.out.println("  - " + p.getNume() + " (" + p.getSpecie() + ")");
            }
        }

        ArrayList<Moluste> moluste = (ArrayList<Moluste>) citestedinFisier(FISIER_MOLUSTE);
        if (moluste != null) {
            System.out.println("Moluste citite:");
            for (Moluste m : moluste) {
                System.out.println("  - " + m.getNume() + " (" + m.getSpecie() + ")");
            }
        }

        System.out.println("=============================================\n");
    }

    // Getters pentru căile fișierelor (dacă sunt necesare)
    public String getFisierBalene() { return FISIER_BALENE; }
    public String getFisierRechini() { return FISIER_RECHINI; }
    public String getFisierPesti() { return FISIER_PESTI; }
    public String getFisierMoluste() { return FISIER_MOLUSTE; }
}