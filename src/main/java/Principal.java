
import java.lang.reflect.Method;

public class Principal {

	public static void main (String [] args) {

		// Las definici�n de las clases "Asal", "EmplProd" y "EmplDistr"
		// no han sufrido ninguna modificaci�n con respecto al c�digo
		// del ejemplo de herencia y redefinici�n que presentamos en el Tema 2

		Asal a1 = new EmplProd ("Juan Abad", 112233, 1500, "Tarde");
		Asal a2 = new EmplDistr ("Pedro R�os", 221133, 1800, "Norte");
		Asal a3 = new Asal ("Antonio Le�n", 445566, 1200);

		Asal a4 = new EmplDistr ("Antoni Camino", 55366, 1200, "Granada");

		// Repasamos las operaciones que ve�amos para conseguir
		// informaci�n sobre los tipos de los objetos

		Asal [] v = {a1, a2, a3, a4};

		// Hacemos un doble bucle para mostrar todos los m�todos
		// de cada objeto del vector v
		// Piensa qu� m�todos (y que definici�n de los mismos) deber�an
		// estar disponibles sobre cada objeto;
		// Despu�s compila el ejemplo y compru�balo
		// �C�mo podr�as escribir el equivalente de este bucle sin usar
		// los iteradores, con bucles "for" "tradicionales"?

		for (Asal a: v) {
			System.out.println ("El objeto pertenece a la clase " + a.getClass().getName());
			System.out.println ("Su lista de m�todos es: " );
			for (Method i: a.getClass().getMethods()){
				System.out.println ("\t M�todo: " + i.toString());
			}
		}

		// 3.3.1 POLIMORFISMO DE M�TODOS TRABAJANDO CON OBJETOS

		// �Qu� versi�n del m�todo "getSalario(): double" se invocar�a sobre
		// cada uno de lo siguientes objetos?

		a1.getSalario (); // La de la clase EmplProd
		a2.getSalario (); // La de la clase EmplDistr
		a3.getSalario (); // La de la clase Asal
		// Reasignamos los punteros o referencias:
		a3 = a2;
		a3.getSalario (); // Ahora a3 apunta a un objeto de la clase EmplDistr,
				 // la versi�n invocada ser� la de esa clase

		// 3.3.2 POLIMORFISMO DE M�TODOS TRABAJANDO SOBRE ESTRUCTURAS DE DATOS

		// En realidad, hemos visto que el doble bucle "for" anterior
		// ya se comportaba de manera polimorfa, �por qu�?

		// Ahora construimos un array "w" para invocar a m�todos de sus objetos:

		Asal [] w = {	new Asal ("J. A.", 111111, 2000),
				new EmplDistr("A. L.", 222222, 2400, "sur"),
				new EmplProd ("R. M.", 333333, 2200, "noche"),
				new Asal("E.R.", 4444444, 2500)};

		w[0].getSalario (); // Llamamos a "getSalario()" en "Asal"
		w[1].getSalario (); // Llamamos a "getSalario()" en "EmplDistr"
		w[2].getSalario (); // Llamamos a "getSalario()" en "EmplProd"
		w[3].getSalario (); // Llamamos a "getSalario()" en "Asal"

		// De nuevo con un iterador podemos mostrar las clases,
		// en tiempo de ejecuci�n, a las que pertenece cada objeto,
		// observando que de nuevo tenemos comportamiento polimorfo

		for (Asal a: w) {
			System.out.println (a.getNombre () + " es de la clase "
				+ a.getClass().getName ());
		}

		// 3.3.3 POLIMORFISMO DE M�TODOS TRABAJANDO SOBRE FUNCIONES AUXILIARES
		// De nuevo no obtenemos ning�n problema, dentro de la funci�n
		// auxiliar los m�todos ser�n invocados en la definici�n
		// de la clase a la que correspondan en tiempo de ejecuci�n:

		muestra3Asal (new Asal ("J. A.", 111111, 2000),
				new EmplDistr("A. L.", 222222, 2400, "sur"),
				new EmplProd ("R. M.", 333333, 2200, "noche"));
	}

	// La siguiente funci�n, en tiempo de ejecuci�n, enlazar� din�micamente cada
	// objeto recibido con la definici�n de "getSalario(): double" correspondiente

	static void muestra3Asal (Asal a1, Asal a2, Asal a3){
		System.out.println (a1.getNombre () + " tiene salario " + a1.getSalario());
		System.out.println (a2.getNombre () + " tiene salario " + a2.getSalario());
		System.out.println (a3.getNombre () + " tiene salario " + a3.getSalario());
		// Otra forma de ver que los objetos est�n "bien tipados" dentro
		// del m�todo ser�a comprobar el tipo de las variables locales "a1",
		// "a2" y "a3"
		System.out.println ("El tipo de a1 " + a1.getClass().getName());
		System.out.println ("El tipo de a2 " + a2.getClass().getName());
		System.out.println ("El tipo de a3 " + a3.getClass().getName());
	}
}