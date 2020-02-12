/** Algoritmo
*inicializar drivedKm en cero
*inicializar gasLt en cero
*inicializar totalKmperLt en cero
*
*Mientras el usuario no haya ingresado el valor del centinela (-1) 
*	Pedir al usuario ingresar kilometros conducidos en entero
*	Si kilometros conducidos difernte de -1 entonces
*		Pedir al usuario ingresar litros de gasolina consumidos en numero entero
*		Calcular kmporLt conducidos  drivedKm/gasLt
*		imprimir el valor de los kilometros por litro obtenidos en cada viaje, resultado en flotante
*		sumar a totalKmperLt kmperLitro
*		imprimir el valor de total de km por litro en todos los viajes
*/
import java.util.Scanner;

public class Exercise_417{
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		int drivedKm = 0;
		int gasLt = 0;
		double totalKmperLt = 0;

		while (drivedKm != -1){
			System.out.println("Enter the drived Kilometers or -1 if you already finished");
			drivedKm = enter.nextInt();
			
			if (drivedKm != -1) {
				System.out.println("Enter the gasolina used during the last driving");
				gasLt = enter.nextInt();
				double kmperLt =  (double) drivedKm / gasLt;
				System.out.printf("The Kilometers per Liter in this journey were %.3f (km/lt)\n", kmperLt);
				totalKmperLt += kmperLt;
				System.out.printf("The total of Kilometers per liter is: %.3f\n", totalKmperLt);
			}
		}
	}
	
}