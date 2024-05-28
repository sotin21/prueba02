package model.data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Votante;

public class VotanteDAO {
    private Connection conexion;

    public VotanteDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public void agregarVotante(Votante votante) throws SQLException {
        String query = "INSERT INTO votante (nombre, email, preferencia_politica) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setString(1, votante.getNombre());
            stmt.setString(2, votante.getEmail());
            stmt.setString(3, votante.getPreferenciaPolitica());
            stmt.executeUpdate();
        }
    }
}