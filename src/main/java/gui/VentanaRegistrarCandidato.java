package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaRegistrarCandidato extends JFrame {
    private JButton botonRegistrar;

    public VentanaRegistrarCandidato() {
        super("Registrar Candidato");

        JPanel panel = new JPanel();

        botonRegistrar = new JButton("Registrar");
        panel.add(botonRegistrar);

        add(panel);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public JButton getBotonRegistrar() {
        return botonRegistrar;
    }
}