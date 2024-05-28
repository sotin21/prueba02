package model.data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Voto;

public class VotoDAO {
    private Connection conexion;

    public VotoDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public void agregarVoto(Voto voto) throws SQLException {
        String query = "INSERT INTO voto (votante_nombre, candidato_nombre, fecha_emision, eleccion_nombre) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setString(1, voto.getVotante().getNombre());
            stmt.setString(2, voto.getCandidatoElegido().getNombre());
            stmt.setString(3, voto.getFechaEmision());
            stmt.setString(4, voto.getEleccion().getNombreEleccion());
            stmt.executeUpdate();
        }
    }
}