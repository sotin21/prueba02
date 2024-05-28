package model;
public class Voto {
    private Votante votante;
    private Candidato candidatoElegido;
    private String fechaEmision;
    private Eleccion eleccion;

    public Votante getVotante() {
        return votante;
    }

    public void setVotante(Votante votante) {
        this.votante = votante;
    }

    public Candidato getCandidatoElegido() {
        return candidatoElegido;
    }

    public void setCandidatoElegido(Candidato candidatoElegido) {
        this.candidatoElegido = candidatoElegido;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Eleccion getEleccion() {
        return eleccion;
    }

    public void setEleccion(Eleccion eleccion) {
        this.eleccion = eleccion;
    }
}