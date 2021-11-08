
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
	
	// Este método será redefinido en las subclases,
	// pero, a diferencia de C++, no hace falta 
	// advertírselo a Java,
	// ya que todos los métodos, si es necesario,
	// se enlazan de manera dinámica.
	public double getSalario (){
		return this.salarioBase;
	}
}