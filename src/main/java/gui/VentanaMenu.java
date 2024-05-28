package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaMenu extends JFrame {
    private JButton botonCrearEleccion;
    private JButton botonRegistrarCandidato;
    private JButton botonRegistrarVotante;

    public VentanaMenu() {
        super("Menú Principal");

        JPanel panel = new JPanel();

        botonCrearEleccion = new JButton("Crear Elección");
        panel.add(botonCrearEleccion);

        botonRegistrarCandidato = new JButton("Registrar Candidato");
        panel.add(botonRegistrarCandidato);

        botonRegistrarVotante = new JButton("Registrar Votante");
        panel.add(botonRegistrarVotante);

        add(panel);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public JButton getBotonCrearEleccion() {
        return botonCrearEleccion;
    }

    public JButton getBotonRegistrarCandidato() {
        return botonRegistrarCandidato;
    }

    public JButton getBotonRegistrarVotante() {
        return botonRegistrarVotante;
    }
}