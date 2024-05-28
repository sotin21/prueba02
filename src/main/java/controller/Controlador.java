package controller;

import gui.VentanaCrearEleccion;
import gui.VentanaMenu;
import gui.VentanaRegistrarCandidato;
import gui.VentanaRegistrarVotante;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private VentanaMenu ventanaMenu;
    private VentanaRegistrarCandidato ventanaRegistrarCandidato;
    private VentanaRegistrarVotante ventanaRegistrarVotante;
    private VentanaCrearEleccion ventanaCrearEleccion;

    public Controlador() {
        ventanaMenu = new VentanaMenu();
        ventanaRegistrarCandidato = new VentanaRegistrarCandidato();
        ventanaRegistrarVotante = new VentanaRegistrarVotante();
        ventanaCrearEleccion = new VentanaCrearEleccion();

        ventanaMenu.getBotonCrearEleccion().addActionListener(this);
        ventanaMenu.getBotonRegistrarCandidato().addActionListener(this);
        ventanaMenu.getBotonRegistrarVotante().addActionListener(this);

        ventanaCrearEleccion.getBotonCrear().addActionListener(this);
        ventanaRegistrarCandidato.getBotonRegistrar().addActionListener(this);
        ventanaRegistrarVotante.getBotonRegistrar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ventanaMenu.getBotonCrearEleccion()) {
            ventanaCrearEleccion.setVisible(true);
        } else if (e.getSource() == ventanaMenu.getBotonRegistrarCandidato()) {
            ventanaRegistrarCandidato.setVisible(true);
        } else if (e.getSource() == ventanaMenu.getBotonRegistrarVotante()) {
            ventanaRegistrarVotante.setVisible(true);
        } else if (e.getSource() == ventanaCrearEleccion.getBotonCrear()) {
            // Lógica para crear la elección
        } else if (e.getSource() == ventanaRegistrarCandidato.getBotonRegistrar()) {
            // Lógica para registrar un candidato
        } else if (e.getSource() == ventanaRegistrarVotante.getBotonRegistrar()) {
            // Lógica para registrar un votante
        }
    }

    public static void main(String[] args) {
        Controlador controlador = new Controlador();
    }
}