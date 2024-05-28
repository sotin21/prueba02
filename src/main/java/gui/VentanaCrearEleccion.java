package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaCrearEleccion extends JFrame {
    private JButton botonCrear;

    public VentanaCrearEleccion() {
        super("Crear Elección");

        JPanel panel = new JPanel();

        botonCrear = new JButton("Crear");
        panel.add(botonCrear);

        add(panel);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public JButton getBotonCrear() {
        return botonCrear;
    }
}