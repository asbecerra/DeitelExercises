public class LibroCalificaciones {
	 //declaracion linea de instacia
	private String nombreDelCurso; //mayoria instancia se declaran private Ocultamiento de datos
	//constructor
	public LibroCalificaciones(String nombre) {
		nombreDelCurso = nombre;
	}
	//metodo establecerNombreDelCurso
	public void establecerNombreDelCurso(String nombre) {
		nombreDelCurso = nombre;
	}
	//Metodo obtener nombre del curso
	public String obtenerNombreDelCurso() {
		return nombreDelCurso;
	}
    
	public void mostrarMensaje() {
		System.out.printf("Bienvenido al curso de Calificaciones para \n%s!\n", obtenerNombreDelCurso());
	}
}
