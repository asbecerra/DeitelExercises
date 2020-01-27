import java.util.Scanner;

public class PruebaLibroCalificaciones {
	public static void main (String[] args){
		//crea objeto Libro Calificaciones
		LibroCalificaciones miLibroCalificaciones1 = new LibroCalificaciones("C5101 INTRODUCCIÓN A LA PROGRAMACIÓN CON JAVA");
		LibroCalificaciones miLibroCalificaciones2 = new LibroCalificaciones("C5102 ESTRUCTURA DE DATOS EN JAVA");
		System.out.printf("El nombre del curso LibroCalificaciones es: %s\n\n", miLibroCalificaciones1.obtenerNombreDelCurso());		
		System.out.printf("El nombre del curso LibroCalificaciones es: %s\n\n", miLibroCalificaciones2.obtenerNombreDelCurso());
	}
}
