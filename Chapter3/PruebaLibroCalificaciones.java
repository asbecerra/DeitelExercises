import java.util.Scanner;

public class PruebaLibroCalificaciones {
	public static void main (String[] args){
		//crea objeto Libro Calificaciones
		LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones("C5101 INTRODUCCIÓN A LA PROGRAMACIÓN CON JAVA", "Juan");
		//LibroCalificaciones miLibroCalificaciones2 = new LibroCalificaciones("C5102 ESTRUCTURA DE DATOS EN JAVA", "Pedro");
		System.out.printf("El nombre del curso LibroCalificaciones es: %s\n", miLibroCalificaciones.obtenerNombreDelCurso());		
		//System.out.printf("El nombre del curso LibroCalificaciones es: %s\n, dirigido por: %s\n", miLibroCalificaciones2.obtenerNombreDelCurso(), miLibroCalificaciones2.obtenerNombreInstructor());
		miLibroCalificaciones.mostrarMensaje();
		miLibroCalificaciones.determinarPromedioClase();
	}

}
