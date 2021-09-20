# universidadLocal
Segunda práctica del curso Programación Orientada a Objetos de la UPC

	
Una universidad local desea desarrollar un pequeño programa para gestionar los datos y resultados del proceso de admisión 2020-2. 
 
Los postulantes pueden ser: egresados de colegio nacional, egresados de colegio particular y traslados de otra universidad.  
Todo postulante es registrado con su número de DNI, nombre, calificación escolar promedio (valor entre 0 y 20), calificación del examen de conocimientos (valor entre 0 y 100) y calificación de examen psicológico (valor entre 0 y 100). 
 
La calificación final de los postulantes se calcula así: 
Calificación = (PE * 5 * 0.20) + (EC * 0.60) + (EP * 0.20) 
 
Donde: 
PE: Calificación escolar promedio 
EC: Calificación del examen de conocimientos 
EP: Calificación del examen psicológico 
Solamente en el caso de los postulantes de traslado se requiere registrar el nombre de la universidad de procedencia y si perteneció al quinto superior en su universidad de origen. Si perteneció al quinto superior se adicionarán 5 puntos a la calificación final. 
 
Aplicando herencia, polimorfismo y excepciones, desarrolla un programa que permita realizar lo siguiente:
Diseñe su dagrama de clases Solución. (3 puntos)
Registre al menos 6 postulantes, 2 de cada tipo. (2 puntos). 
Desarrolle un método que liste los postulantes registrados y que informe todos sus atributos y la calificación final obtenida. (2 puntos). 
Desarrollo un método que permita buscar un postulante por DNI y muestre sus datos y su calificación final.  En caso no se encuentre debe mostrar el mensaje “No encontrado”. (3 puntos). 
Usar una Excepción para mostrar en pantalla el mensaje de error “Dni invalido” en caso se ingrese un valor de DNI mayor a 8 dígitos o menor a 8 en el enunciado, el cual deberá ser aplicado en el punto (d). (2 puntos)
