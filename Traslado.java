package univPlataComoCancha;

public class Traslado extends Estudiante {

    private String universidadOrigen;
    private boolean quintoSuperior;

    public Traslado(int DNI, String nombre, double promedioEscolar, double notaExamenAdmision,
                    double notaExamenPsicologico, String universidadOrigen, boolean quintoSuperior) {
        super(DNI, nombre, promedioEscolar, notaExamenAdmision, notaExamenPsicologico);
        this.universidadOrigen = universidadOrigen;
        this.quintoSuperior = quintoSuperior;
    }

    public String getUniversidadOrigen() {
        return universidadOrigen;
    }

    public void setUniversidadOrigen(String universidadOrigen) {
        this.universidadOrigen = universidadOrigen;
    }

    public boolean isQuintoSuperior() {
        return quintoSuperior;
    }

    public void setQuintoSuperior(boolean quintoSuperior) {
        this.quintoSuperior = quintoSuperior;
    }

    @Override
    public double calificacionFinal () {

        if (quintoSuperior) {
            return super.calificacionFinal() + 5;
        } else {
            return  super.calificacionFinal();
        }

    }

}
