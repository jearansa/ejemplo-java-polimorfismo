
public class EmplDistr extends Asal{

	private String region;

	// Observar el constructor; la primera línea del mismo
	// siempre debe contener una invocación a un constructor
	// de la clase Base
	// La sintaxis es por medio de "super (lista_de_parámetros)"
	// Si en la clase Base hubiese un constructor sin parámetros,
	// Java directamente (y de forma transparente al programador)
	// invocaría a "super ();"
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

	// Al igual que en C++, para invocar a un método de la clase Base
	// que se esté redefiniendo en la clase Derivada, debemos usar la
	// sintaxis especial "super.metodo (lista_de_parámetros);"
	// Si no incluimos "super._" estaríamos invocando al propio
	// método, y caeríamos en un bucle infinito

	public double getSalario (){
		return super.getSalario () * (1 + 0.10);
	}
}