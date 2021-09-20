package univPlataComoCancha;

import java.util.ArrayList;

public class UniversidadPlataComoCancha {

    ArrayList <Estudiante> estudiantes;

    public UniversidadPlataComoCancha() {
        this.estudiantes = new ArrayList<>();
    }

    public void registrarEstudiante (Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    //Desarrolle un método que liste los postulantes registrados
    // y que informe todos sus atributos y la calificación final obtenida. (2 puntos).
    public void listarEstudiantes () {
        for (Estudiante e: estudiantes) {
            System.out.println(e);
        }
    }

    //Desarrollo un método que permita buscar un postulante por DNI y muestre sus datos y su calificación final.
    // En caso no se encuentre debe mostrar el mensaje “No encontrado”. (3 puntos).
    public void encontrarEstudiante (int DNI) throws ExcepcionNoEncuentraEstudiante, ExcepcionDNIesInvalido {
        boolean encontrado = false;

        //Comprobamos si el DNI ingresado es válido llamando al método que creamos abajo
        verificarDniEsInvalido(DNI);

        for (Estudiante e : estudiantes) {
            if (DNI == e.getDNI()) {
                System.out.println( "Se han encontrado los datos para el estudiante con DNI "
                        + DNI + " y son los siguientes \n" + e.toString());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            throw new ExcepcionNoEncuentraEstudiante(
                    "El DNI " + DNI + " no está registrado"
            );
        }
    }

    //Usar una Excepción para mostrar en pantalla el mensaje de error “Dni invalido”
    // en caso se ingrese un valor de DNI mayor a 8 dígitos o menor a 8 en el enunciado,
    // el cual deberá ser aplicado en el punto (d). (2 puntos)
    public void verificarDniEsInvalido (int DNI) throws ExcepcionDNIesInvalido {
        int contador = 0;

        //aplicamos la trquiñuela 55 para obtener el número de dígitos del DNI
        while (DNI != 0) {
            DNI /= 10;
            contador++;
        }

        if (contador != 8) {
            throw new ExcepcionDNIesInvalido(
                    "El DNI ingresado es incorrecto ya que no posee 8 cifras");
        }

    }


}
