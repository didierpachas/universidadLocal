package univPlataComoCancha;

public class Ejecutora {

    public static void main(String[] args) {

        UniversidadPlataComoCancha universidad = new UniversidadPlataComoCancha();

        universidad.registrarEstudiante(new EgresadoColegioPrivado(11345678, "A", 15.5,
                                                                    80.4, 84.5 ));
        universidad.registrarEstudiante(new EgresadoColegioPrivado(22234567, "B", 17.5,
                75.4, 68.9 ));
        universidad.registrarEstudiante(new EgresadoColegioNacional(33345678, "C", 18,
                62.35, 98.6 ));
        universidad.registrarEstudiante(new EgresadoColegioNacional(44345678, "D", 13.0,
                50.8, 48.7 ));
        //Estps dos estudiantes tienen las mismas notas para poder apreciar que el que sí pertenece al quinto superior
        //tiene 5 puntos más.
        universidad.registrarEstudiante(new Traslado(55345678, "E", 15.5,
                80.4, 84.5, "Univ 1", true ));
        universidad.registrarEstudiante(new Traslado(66345678, "F", 15.5,
                80.4, 84.5, "Univ 2", false));

        System.out.println("Lista de todos estudiantes");
        universidad.listarEstudiantes();
        System.out.println("***************************************");

        //Comprobar DNI correcto
        try {
            universidad.encontrarEstudiante(55345678);
        } catch (ExcepcionNoEncuentraEstudiante | ExcepcionDNIesInvalido ex) {
            System.out.println(ex.getMessage());
        }
        //Comprobar DNI incorrecto
        try {
            universidad.encontrarEstudiante(10456789);
        } catch (ExcepcionNoEncuentraEstudiante | ExcepcionDNIesInvalido ex) {
            System.out.println(ex.getMessage());
        }

        //Comprobar DNI más de 8 cifras
        try {
            universidad.encontrarEstudiante(104567819);
        } catch (ExcepcionNoEncuentraEstudiante | ExcepcionDNIesInvalido ex) {
            System.out.println(ex.getMessage());
        }



    }
}
