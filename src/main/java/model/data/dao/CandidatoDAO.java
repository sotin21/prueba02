package model.data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Candidato;

public class CandidatoDAO {
    private Connection conexion;

    public CandidatoDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public void agregarCandidato(Candidato candidato) throws SQLException {
        String query = "INSERT INTO candidato (nombre, partido_politico, cargo) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setString(1, candidato.getNombre());
            stmt.setString(2, candidato.getPartidoPolitico());
            stmt.setString(3, candidato.getCargo());
            stmt.executeUpdate();
        }
    }
}