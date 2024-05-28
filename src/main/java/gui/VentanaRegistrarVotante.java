package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaRegistrarVotante extends JFrame {
    private JButton botonRegistrar;

    public VentanaRegistrarVotante() {
        super("Registrar Votante");

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