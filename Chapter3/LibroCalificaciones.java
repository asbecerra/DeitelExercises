public class LibroCalificaciones {
	 //declaracion linea de instacia
	private String nombreDelCurso; //mayoria instancia se declaran private Ocultamiento de datos
	private String nombreInstructor;
	//constructor
	public LibroCalificaciones(String nombreC, String nombreI) {
		nombreDelCurso = nombreC;
		nombreInstructor = nombreI;
	}
	//metodo establecerNombreDelCurso
	public void establecerNombreDelCurso(String nombreC) {
		nombreDelCurso = nombreC;
	}
	//Metodo obtener nombre del curso
	public String obtenerNombreDelCurso() {
		return nombreDelCurso;
	}
	public void establecerNombreInstructor(String nombreI) {
		nombreInstructor = nombreI;
	}
	//Metodo obtener nombre del curso
	public String obtenerNombreInstructor() {
		return nombreInstructor;
	}
    
	public void mostrarMensaje() {
		System.out.printf("Bienvenido al curso de Calificaciones para \n%s!\n", obtenerNombreDelCurso());
		System.out.printf("Este curso es dirigido por: ", obtenerNombreInstructor());
	}
}
