import java.util.Scanner;

public class LibroCalificaciones {
	 //declaracion linea de instacia
	private String nombreDelCurso; //mayoria instancia se declaran private Ocultamiento de datos
	//private String nombreInstructor;
	//constructor
	public LibroCalificaciones(String nombreC, String nombreI) {
		nombreDelCurso = nombreC;
		//nombreInstructor = nombreI;
	}
	//metodo establecerNombreDelCurso
	public void establecerNombreDelCurso(String nombreC) {
		nombreDelCurso = nombreC;
	}
	//Metodo obtener nombre del curso
	public String obtenerNombreDelCurso() {
		return nombreDelCurso;
	}
	/*
	public void establecerNombreInstructor(String nombreI) {
		nombreInstructor = nombreI;
	}
	//Metodo obtener nombre del curso
	public String obtenerNombreInstructor() {
		return nombreInstructor;
	}
    */

	public void mostrarMensaje() {
		System.out.printf("Bienvenido al curso de Calificaciones para \n%s!\n", obtenerNombreDelCurso());
		//System.out.printf("Este curso es dirigido por: ", obtenerNombreInstructor());
	}
	public void determinarPromedioClase() {
		Scanner entrada = new Scanner(System.in);
		int total;
		int contadorCalif;
		int calificacion;
		double promedio;
		total = 0;
		contadorCalif = 0;  //inicializa el contador del ciclo
		System.out.print("Escriba la calificacion o -1 para terminar: "); //-1 es un centinela
		calificacion = entrada.nextInt();

		while(calificacion != -1) {  
			//System.out.print("Escriba la calificacion: ");
			//calificacion = entrada.nextInt();
			total = total + calificacion;
			contadorCalif = contadorCalif + 1;
			System.out.print("Escriba la calificacion o -1 para terminar: "); 
			calificacion = entrada.nextInt();
		}

		if (contadorCalif != 0){
		promedio = (double) total /contadorCalif;
		System.out.printf("\nEl total de las 10 Calificaciones es %d\n", total);
		System.out.printf("El promedio de la Clase es %.2f\n", promedio);
		}
		else
			System.out.println("No se introdujeron las calificaciones.");
	}
}
