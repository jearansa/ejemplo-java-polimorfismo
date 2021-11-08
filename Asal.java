
public class Asal{

	private	String nombre;
	private long dni;
	private double salarioBase;

	public Asal(String n, long dni, double sb){
   		this.nombre = n;
   		this.dni = dni;
   		this.salarioBase = sb;
	}

	public String getNombre (){
     		return this.nombre;
	}

	public void setNombre (String nn){
     		this.nombre = nn;
	}

	public long getDni (){
     		return this.dni;
	}

	public void setDni (long nd){
     		this.dni = nd;
	}
	
	// Este m�todo ser� redefinido en las subclases,
	// pero, a diferencia de C++, no hace falta 
	// advert�rselo a Java,
	// ya que todos los m�todos, si es necesario,
	// se enlazan de manera din�mica.
	public double getSalario (){
		return this.salarioBase;
	}
}