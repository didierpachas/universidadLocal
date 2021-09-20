package univPlataComoCancha;

public class Estudiante {

    private int DNI;
    private String nombre;
    private double promedioEscolar;
    private double notaExamenAdmision;
    private double notaExamenPsicologico;


    public Estudiante(int DNI, String nombre, double promedioEscolar,
                      double notaExamenAdmision, double notaExamenPsicologico) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.promedioEscolar = promedioEscolar;
        this.notaExamenAdmision = notaExamenAdmision;
        this.notaExamenPsicologico = notaExamenPsicologico;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedioEscolar() {
        return promedioEscolar;
    }

    public void setPromedioEscolar(double promedioEscolar) {
        this.promedioEscolar = promedioEscolar;
    }

    public double getNotaExamenAdmision() {
        return notaExamenAdmision;
    }

    public void setNotaExamenAdmision(double notaExamenAdmision) {
        this.notaExamenAdmision = notaExamenAdmision;
    }

    public double getNotaExamenPsicologico() {
        return notaExamenPsicologico;
    }

    public void setNotaExamenPsicologico(double notaExamenPsicologico) {
        this.notaExamenPsicologico = notaExamenPsicologico;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "DNI=" + DNI +
                ", nombre='" + nombre + '\'' +
                ", promedioEscolar=" + promedioEscolar +
                ", notaExamenAdmision=" + notaExamenAdmision +
                ", notaExamenPsicologico=" + notaExamenPsicologico +
                '}' + ", Calificación Final es: " + calificacionFinal();
    }

    public double calificacionFinal () {

        return  (promedioEscolar * 5 * 0.20) + (notaExamenAdmision * 0.60) + (notaExamenPsicologico * 0.20);
    }
}
