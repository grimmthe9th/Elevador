package Gon;

/*Por favor realice un algoritmo que simule 
 * el comportamiento de un elevador de puertas 
 * automaticas de un edificio de 15 pisos
 tomando en cuenta que para ser llamado se debe "presionar"
 el boton de subida o bajada (ambos valores deberian ingresarse por consola)
 Antes de llamar al elevador se le debe indicar en que piso esta ud.Una vez 
 haya sido llamado el elevador,este debe indicar el piso por el cual esta pasando
 Al llegar , el elevador ,este debe indicar que las puertas han sido abiertas
 . Luego de colocar el piso a donde se dirige, cerrar las puertas y repetir el proceso,
 tomando en  cuenta las validaciones correspondientes
 
   Para esta evaluacion se tomara en cuanta todo lo indicado en clases hasta ahora
 */
public class Elevador {
	public static void main(String[] args) {
		// declaracion de variables
		Robot obj = new Robot();
		int boton = 0;
		int posicionUsuario = 0;
		int posicionDestino = 0;
		int posicionElevador = 1;

		for (int a = 0; a != 2; a++) {
			// solicitamos al usuario si va a subir o bajar y filtramos posibles
			// errores e intruciones de memoria
			obj.pedirNuevamente = true;
			while (obj.pedirNuevamente) {
				System.out.println("Presione boton 1 para subir o boton 2 para bajar");
				boton = (int) obj.leer();
				if (boton == 1 || boton == 2) {
					System.out.println("Ascensor en movimiento");
				} else {
					System.out.println("Accion ilegal detectada");
					a=0;
				}

			}
			obj.pedirNuevamente = true;

			// solicitamos al usuario en que piso se encuentra y filtramos datos
			// invalidos y errores e intruciones de memoria
			while (obj.pedirNuevamente) {
				System.out.println("¿En que piso esta?");
				posicionUsuario = (int) obj.leer();
				if (posicionUsuario > 0 && posicionUsuario < 16) {
				} else {
					System.out.println("Piso erroneo");
					a=0;
				}
			}
			// mostramos el piso en el que el usuario se encuentra
			System.out.println("Usted esta en el piso " + posicionUsuario);

			// se verifica si la posicion del elevador es en un piso mayor o
			// menor
			// al del usuario y se lo desplaza hasta su posicion actual
			// mostrando
			// los pisos a recorrer.
			if (posicionElevador > posicionUsuario) {
				for (int i = posicionElevador; i != posicionUsuario; i--) {
					posicionElevador--;
					System.out.println("El elevador se encuentra en el piso " + posicionElevador);
				}
			} else if (posicionElevador < posicionUsuario) {
				for (int i = posicionElevador; i != posicionUsuario; i++) {
					posicionElevador++;
					System.out.println("El elevador se encuentra en el piso " + posicionElevador);
				}
			}
			// se indica que el elevador llego a destino y se abren las puertas
			System.out.println("Abriendo puertas");

			// se solicita el piso al que se desea ir y se verifica que no haya
			// datos erroneos o errores de memoria o intrucciones en la
			// ejecucion
			obj.pedirNuevamente = true;
			while (obj.pedirNuevamente) {
				// se indica que se cerraran las puertas
				System.out.println("Cerrando Puertas");
				System.out.println("ingrese al piso que desea ir");
				posicionDestino = (int) obj.leer();
				if (posicionDestino > 0 && posicionDestino < 16) {
					// se indica que se cerraran las puertas
				} else {
					System.out.println("Piso erroneo");
					a=0;
				}
			}

			// se verificara si la operacion solicitada por el usuario es valida
			// o
			// no y se desplazara el acensor
			if (posicionDestino > posicionUsuario && boton == 1) {
				for (int x = posicionElevador; x != posicionDestino; x++) {
					posicionElevador++;
					System.out.println("El elevador se encuentra en el piso " + posicionElevador);
				}
			} else if (posicionDestino < posicionUsuario && boton == 2) {
				for (int x = posicionElevador; x != posicionDestino; x--) {
					posicionElevador--;
					System.out.println("El elevador se encuentra en el piso " + posicionElevador);
				}
			} else {
				System.out.println("Boton erroneo");
				a=0;
			}
			System.out.println("Abriendo Puertas");
			//return;
			a = 0;
		}
	}
}
