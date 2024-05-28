package model;
import java.util.List;

public class Votante {
    private String nombre;
    private String email;
    private String preferenciaPolitica;
    private List<Eleccion> eleccionesParticipadas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPreferenciaPolitica() {
        return preferenciaPolitica;
    }

    public void setPreferenciaPolitica(String preferenciaPolitica) {
        this.preferenciaPolitica = preferenciaPolitica;
    }

    public List<Eleccion> getEleccionesParticipadas() {
        return eleccionesParticipadas;
    }

    public void setEleccionesParticipadas(List<Eleccion> eleccionesParticipadas) {
        this.eleccionesParticipadas = eleccionesParticipadas;
    }
}