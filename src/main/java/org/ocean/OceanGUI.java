package org.ocean;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class OceanGUI extends JFrame {
    private ArrayList<Balena> listaBalene;
    private ArrayList<Rechin> listaRechini;
    private ArrayList<PestiTropicali> listaPesti;
    private ArrayList<Moluste> listaMoluste;

    private JTabbedPane tabbedPane;

    public OceanGUI(ArrayList<Balena> balene, ArrayList<Rechin> rechini,
                    ArrayList<PestiTropicali> pesti, ArrayList<Moluste> moluste) {
        this.listaBalene = balene;
        this.listaRechini = rechini;
        this.listaPesti = pesti;
        this.listaMoluste = moluste;

        setTitle("🌊 Sistemul de Management Animale Acvatice");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tabbedPane = new JTabbedPane();
        tabbedPane.setFont(new Font("Arial", Font.BOLD, 14));

        // Adăugăm tab-urile pentru fiecare tip de animal
        tabbedPane.addTab("🐋 Balene", createBalenePanel());
        tabbedPane.addTab("🦈 Rechini", createRechiniPanel());
        tabbedPane.addTab("🐠 Pești Tropicali", createPestiPanel());
        tabbedPane.addTab("🐙 Moluste", createMolustePanel());

        add(tabbedPane);
    }

    // ========== PANOU BALENE ==========
    private JPanel createBalenePanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Panou pentru criterii
        JPanel criteriiPanel = new JPanel(new GridBagLayout());
        criteriiPanel.setBorder(BorderFactory.createTitledBorder("Criterii de Filtrare"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Greutate minimă
        gbc.gridx = 0; gbc.gridy = 0;
        criteriiPanel.add(new JLabel("Greutate minimă (kg):"), gbc);
        gbc.gridx = 1;
        JTextField greutateField = new JTextField(15);
        criteriiPanel.add(greutateField, gbc);

        // Adâncime maximă minimă
        gbc.gridx = 0; gbc.gridy = 1;
        criteriiPanel.add(new JLabel("Adâncime maximă minimă (m):"), gbc);
        gbc.gridx = 1;
        JTextField adancimeField = new JTextField(15);
        criteriiPanel.add(adancimeField, gbc);

        // Butoane
        JPanel butoanePanelBalene = new JPanel(new FlowLayout());
        JButton filtreazaBtn = new JButton("🔍 Filtrează");
        JButton afiseazaToateBtn = new JButton("📋 Afișează Toate");
        JButton resetBtn = new JButton("🔄 Resetează");

        butoanePanelBalene.add(filtreazaBtn);
        butoanePanelBalene.add(afiseazaToateBtn);
        butoanePanelBalene.add(resetBtn);

        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2;
        criteriiPanel.add(butoanePanelBalene, gbc);

        // Tabel pentru rezultate
        String[] coloane = {"Nume", "Specie", "Greutate (kg)", "Lungime (m)", "Culoare", "Vârstă", "Adâncime Max (m)", "Tip Hrană"};
        DefaultTableModel model = new DefaultTableModel(coloane, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        JTable tabel = new JTable(model);
        tabel.setFont(new Font("Arial", Font.PLAIN, 12));
        tabel.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        tabel.setRowHeight(25);
        JScrollPane scrollPane = new JScrollPane(tabel);

        // Event handlers
        filtreazaBtn.addActionListener(e -> {
            try {
                double greutateMin = Double.parseDouble(greutateField.getText().trim());
                int adancimeMin = Integer.parseInt(adancimeField.getText().trim());

                model.setRowCount(0);
                boolean gasit = false;

                for (Balena balena : listaBalene) {
                    if (balena.getGreutate() >= greutateMin && balena.getAdancimeMaxima() >= adancimeMin) {
                        model.addRow(new Object[]{
                                balena.getNume(),
                                balena.getSpecie(),
                                balena.getGreutate(),
                                balena.getLungime(),
                                balena.getCuloare(),
                                balena.getVarsta(),
                                balena.getAdancimeMaxima(),
                                balena.getTipHrana()
                        });
                        gasit = true;
                    }
                }

                if (!gasit) {
                    JOptionPane.showMessageDialog(this,
                            "Nu există balene care satisfac aceste condiții.",
                            "Niciun rezultat", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Vă rugăm introduceți valori numerice valide!",
                        "Eroare", JOptionPane.ERROR_MESSAGE);
            }
        });

        afiseazaToateBtn.addActionListener(e -> {
            model.setRowCount(0);
            for (Balena balena : listaBalene) {
                model.addRow(new Object[]{
                        balena.getNume(),
                        balena.getSpecie(),
                        balena.getGreutate(),
                        balena.getLungime(),
                        balena.getCuloare(),
                        balena.getVarsta(),
                        balena.getAdancimeMaxima(),
                        balena.getTipHrana()
                });
            }
        });

        resetBtn.addActionListener(e -> {
            greutateField.setText("");
            adancimeField.setText("");
            model.setRowCount(0);
        });

        panel.add(criteriiPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        return panel;
    }

    // ========== PANOU RECHINI ==========
    private JPanel createRechiniPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel criteriiPanel = new JPanel(new GridBagLayout());
        criteriiPanel.setBorder(BorderFactory.createTitledBorder("Criterii de Filtrare"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Este periculos
        gbc.gridx = 0; gbc.gridy = 0;
        criteriiPanel.add(new JLabel("Este periculos:"), gbc);
        gbc.gridx = 1;
        JComboBox<String> periculosCombo = new JComboBox<>(new String[]{"Da", "Nu"});
        criteriiPanel.add(periculosCombo, gbc);

        // Număr minim de dinți
        gbc.gridx = 0; gbc.gridy = 1;
        criteriiPanel.add(new JLabel("Număr minim de dinți:"), gbc);
        gbc.gridx = 1;
        JTextField dintiField = new JTextField(15);
        criteriiPanel.add(dintiField, gbc);

        // Butoane
        JPanel butoanePanelRechini = new JPanel(new FlowLayout());
        JButton filtreazaBtn = new JButton("🔍 Filtrează");
        JButton afiseazaToateBtn = new JButton("📋 Afișează Toate");
        JButton resetBtn = new JButton("🔄 Resetează");

        butoanePanelRechini.add(filtreazaBtn);
        butoanePanelRechini.add(afiseazaToateBtn);
        butoanePanelRechini.add(resetBtn);

        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2;
        criteriiPanel.add(butoanePanelRechini, gbc);

        // Tabel
        String[] coloane = {"Nume", "Specie", "Greutate (kg)", "Lungime (m)", "Culoare", "Vârstă", "Nr. Dinți", "Periculos", "Tip Rechin"};
        DefaultTableModel model = new DefaultTableModel(coloane, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        JTable tabel = new JTable(model);
        tabel.setFont(new Font("Arial", Font.PLAIN, 12));
        tabel.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        tabel.setRowHeight(25);
        JScrollPane scrollPane = new JScrollPane(tabel);

        // Event handlers
        filtreazaBtn.addActionListener(e -> {
            try {
                boolean periculos = periculosCombo.getSelectedItem().equals("Da");
                int numarDintiMin = Integer.parseInt(dintiField.getText().trim());

                model.setRowCount(0);
                boolean gasit = false;

                for (Rechin rechin : listaRechini) {
                    if (rechin.isPericulos() == periculos && rechin.getNumarDinti() >= numarDintiMin) {
                        model.addRow(new Object[]{
                                rechin.getNume(),
                                rechin.getSpecie(),
                                rechin.getGreutate(),
                                rechin.getLungime(),
                                rechin.getCuloare(),
                                rechin.getVarsta(),
                                rechin.getNumarDinti(),
                                rechin.isPericulos() ? "Da" : "Nu",
                                rechin.getTipRechin()
                        });
                        gasit = true;
                    }
                }

                if (!gasit) {
                    JOptionPane.showMessageDialog(this,
                            "Nu există rechini care satisfac aceste condiții.",
                            "Niciun rezultat", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Vă rugăm introduceți o valoare numerică validă pentru numărul de dinți!",
                        "Eroare", JOptionPane.ERROR_MESSAGE);
            }
        });

        afiseazaToateBtn.addActionListener(e -> {
            model.setRowCount(0);
            for (Rechin rechin : listaRechini) {
                model.addRow(new Object[]{
                        rechin.getNume(),
                        rechin.getSpecie(),
                        rechin.getGreutate(),
                        rechin.getLungime(),
                        rechin.getCuloare(),
                        rechin.getVarsta(),
                        rechin.getNumarDinti(),
                        rechin.isPericulos() ? "Da" : "Nu",
                        rechin.getTipRechin()
                });
            }
        });

        resetBtn.addActionListener(e -> {
            periculosCombo.setSelectedIndex(0);
            dintiField.setText("");
            model.setRowCount(0);
        });

        panel.add(criteriiPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        return panel;
    }

    // ========== PANOU PEȘTI TROPICALI ==========
    private JPanel createPestiPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel criteriiPanel = new JPanel(new GridBagLayout());
        criteriiPanel.setBorder(BorderFactory.createTitledBorder("Criterii de Filtrare"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Greutate minimă
        gbc.gridx = 0; gbc.gridy = 0;
        criteriiPanel.add(new JLabel("Greutate minimă (kg):"), gbc);
        gbc.gridx = 1;
        JTextField greutateField = new JTextField(15);
        criteriiPanel.add(greutateField, gbc);

        // Lungime minimă
        gbc.gridx = 0; gbc.gridy = 1;
        criteriiPanel.add(new JLabel("Lungime minimă (cm):"), gbc);
        gbc.gridx = 1;
        JTextField lungimeField = new JTextField(15);
        criteriiPanel.add(lungimeField, gbc);

        // Butoane
        JPanel butoanePanelPesti = new JPanel(new FlowLayout());
        JButton filtreazaBtn = new JButton("🔍 Filtrează");
        JButton afiseazaToateBtn = new JButton("📋 Afișează Toate");
        JButton resetBtn = new JButton("🔄 Resetează");

        butoanePanelPesti.add(filtreazaBtn);
        butoanePanelPesti.add(afiseazaToateBtn);
        butoanePanelPesti.add(resetBtn);

        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2;
        criteriiPanel.add(butoanePanelPesti, gbc);

        // Tabel
        String[] coloane = {"Nume", "Specie", "Greutate (kg)", "Lungime (cm)", "Culoare", "Vârstă", "Tip Aripioare", "Veninos", "Temp. Opt. (°C)", "Habitat"};
        DefaultTableModel model = new DefaultTableModel(coloane, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        JTable tabel = new JTable(model);
        tabel.setFont(new Font("Arial", Font.PLAIN, 12));
        tabel.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        tabel.setRowHeight(25);
        JScrollPane scrollPane = new JScrollPane(tabel);

        // Event handlers
        filtreazaBtn.addActionListener(e -> {
            try {
                double greutateMin = Double.parseDouble(greutateField.getText().trim());
                double lungimeMin = Double.parseDouble(lungimeField.getText().trim());

                model.setRowCount(0);
                boolean gasit = false;

                for (PestiTropicali peste : listaPesti) {
                    if (peste.getGreutate() >= greutateMin && peste.getLungime() >= lungimeMin) {
                        model.addRow(new Object[]{
                                peste.getNume(),
                                peste.getSpecie(),
                                peste.getGreutate(),
                                peste.getLungime(),
                                peste.getCuloare(),
                                peste.getVarsta(),
                                peste.getTipAripioare(),
                                peste.isVeninosi() ? "Da" : "Nu",
                                peste.getTemperaturaOptima(),
                                peste.getHabitatRecif()
                        });
                        gasit = true;
                    }
                }

                if (!gasit) {
                    JOptionPane.showMessageDialog(this,
                            "Nu există pești care satisfac aceste condiții.",
                            "Niciun rezultat", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Vă rugăm introduceți valori numerice valide!",
                        "Eroare", JOptionPane.ERROR_MESSAGE);
            }
        });

        afiseazaToateBtn.addActionListener(e -> {
            model.setRowCount(0);
            for (PestiTropicali peste : listaPesti) {
                model.addRow(new Object[]{
                        peste.getNume(),
                        peste.getSpecie(),
                        peste.getGreutate(),
                        peste.getLungime(),
                        peste.getCuloare(),
                        peste.getVarsta(),
                        peste.getTipAripioare(),
                        peste.isVeninosi() ? "Da" : "Nu",
                        peste.getTemperaturaOptima(),
                        peste.getHabitatRecif()
                });
            }
        });

        resetBtn.addActionListener(e -> {
            greutateField.setText("");
            lungimeField.setText("");
            model.setRowCount(0);
        });

        panel.add(criteriiPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        return panel;
    }

    // ========== PANOU MOLUSTE ==========
    private JPanel createMolustePanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel criteriiPanel = new JPanel(new GridBagLayout());
        criteriiPanel.setBorder(BorderFactory.createTitledBorder("Criterii de Filtrare"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Au cochilie
        gbc.gridx = 0; gbc.gridy = 0;
        criteriiPanel.add(new JLabel("Au cochilie:"), gbc);
        gbc.gridx = 1;
        JComboBox<String> cochilieCombo = new JComboBox<>(new String[]{"Da", "Nu"});
        criteriiPanel.add(cochilieCombo, gbc);

        // Număr minim de tentacule
        gbc.gridx = 0; gbc.gridy = 1;
        criteriiPanel.add(new JLabel("Număr minim de tentacule:"), gbc);
        gbc.gridx = 1;
        JTextField tentaculeField = new JTextField(15);
        criteriiPanel.add(tentaculeField, gbc);

        // Butoane
        JPanel butoanePanelMoluste = new JPanel(new FlowLayout());
        JButton filtreazaBtn = new JButton("🔍 Filtrează");
        JButton afiseazaToateBtn = new JButton("📋 Afișează Toate");
        JButton resetBtn = new JButton("🔄 Resetează");

        butoanePanelMoluste.add(filtreazaBtn);
        butoanePanelMoluste.add(afiseazaToateBtn);
        butoanePanelMoluste.add(resetBtn);

        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2;
        criteriiPanel.add(butoanePanelMoluste, gbc);

        // Tabel
        String[] coloane = {"Nume", "Specie", "Greutate (kg)", "Lungime (m)", "Culoare", "Vârstă", "Cochilie", "Nr. Tentacule", "Tip Cochilie", "Viteză (km/h)"};
        DefaultTableModel model = new DefaultTableModel(coloane, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        JTable tabel = new JTable(model);
        tabel.setFont(new Font("Arial", Font.PLAIN, 12));
        tabel.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        tabel.setRowHeight(25);
        JScrollPane scrollPane = new JScrollPane(tabel);

        // Event handlers
        filtreazaBtn.addActionListener(e -> {
            try {
                boolean areCochilie = cochilieCombo.getSelectedItem().equals("Da");
                int numarTentaculeMin = Integer.parseInt(tentaculeField.getText().trim());

                model.setRowCount(0);
                boolean gasit = false;

                for (Moluste molusc : listaMoluste) {
                    if (molusc.isAreCochilie() == areCochilie && molusc.getNumarTentacule() >= numarTentaculeMin) {
                        model.addRow(new Object[]{
                                molusc.getNume(),
                                molusc.getSpecie(),
                                molusc.getGreutate(),
                                molusc.getLungime(),
                                molusc.getCuloare(),
                                molusc.getVarsta(),
                                molusc.isAreCochilie() ? "Da" : "Nu",
                                molusc.getNumarTentacule(),
                                molusc.getTipCochilie(),
                                molusc.getVitezaMiscare()
                        });
                        gasit = true;
                    }
                }

                if (!gasit) {
                    JOptionPane.showMessageDialog(this,
                            "Nu există moluste care satisfac aceste condiții.",
                            "Niciun rezultat", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Vă rugăm introduceți o valoare numerică validă pentru numărul de tentacule!",
                        "Eroare", JOptionPane.ERROR_MESSAGE);
            }
        });

        afiseazaToateBtn.addActionListener(e -> {
            model.setRowCount(0);
            for (Moluste molusc : listaMoluste) {
                model.addRow(new Object[]{
                        molusc.getNume(),
                        molusc.getSpecie(),
                        molusc.getGreutate(),
                        molusc.getLungime(),
                        molusc.getCuloare(),
                        molusc.getVarsta(),
                        molusc.isAreCochilie() ? "Da" : "Nu",
                        molusc.getNumarTentacule(),
                        molusc.getTipCochilie(),
                        molusc.getVitezaMiscare()
                });
            }
        });

        resetBtn.addActionListener(e -> {
            cochilieCombo.setSelectedIndex(0);
            tentaculeField.setText("");
            model.setRowCount(0);
        });

        panel.add(criteriiPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        return panel;
    }
}