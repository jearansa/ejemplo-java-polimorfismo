
public class EmplDistr extends Asal{

	private String region;

	// Observar el constructor; la primera l�nea del mismo
	// siempre debe contener una invocaci�n a un constructor
	// de la clase Base
	// La sintaxis es por medio de "super (lista_de_par�metros)"
	// Si en la clase Base hubiese un constructor sin par�metros,
	// Java directamente (y de forma transparente al programador)
	// invocar�a a "super ();"
	public EmplDistr (String n, long dni, double sb, String r){
		super (n, dni, sb);
		this.region = r;
	}

	public String getRegion (){
		return this.region;
	}

	public void setRegion (String nueva_region){
		this.region = nueva_region;
	}

	// Al igual que en C++, para invocar a un m�todo de la clase Base
	// que se est� redefiniendo en la clase Derivada, debemos usar la
	// sintaxis especial "super.metodo (lista_de_par�metros);"
	// Si no incluimos "super._" estar�amos invocando al propio
	// m�todo, y caer�amos en un bucle infinito

	public double getSalario (){
		return super.getSalario () * (1 + 0.10);
	}
}