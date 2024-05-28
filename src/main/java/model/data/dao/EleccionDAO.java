package model.data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Eleccion;

public class EleccionDAO {
    private Connection conexion;

    public EleccionDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public void agregarEleccion(Eleccion eleccion) throws SQLException {
        String query = "INSERT INTO eleccion (nombre, fecha, lugar) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setString(1, eleccion.getNombre());
            stmt.setString(2, eleccion.getFecha());
            stmt.setString(3, eleccion.getLugar());
            stmt.executeUpdate();
        }
    }
}