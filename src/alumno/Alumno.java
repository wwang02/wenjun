package alumno;
public class Alumno {
	//Atributos
	public String Nombre;
	String Apellidos;//La misma clase y el paquete de la clase
	private int Edad;
	protected String Inicial;
	private double Coste;	

	//Constructor por defecto
	public Alumno() {
		
	}

	//Constructor parametrizado con los atributos
	public Alumno (String Nombre,String Apellidos, int Edad, String Inicial, double Coste) {
		
		this.Nombre=Nombre;
		this.Apellidos=Apellidos;
		this.Edad=Edad;
		this.Inicial=Inicial;
		this.Coste=Coste;
		
	}

	 // Método set y get de los atributos que son privados
	 //para poder acceder a ellos
	public void setEdad (int valor1) {
		this.Edad=valor1;
	}
	public int getEdad() {
		return this.Edad;
	}
	public void setCoste(int valor2) {
		this.Coste=valor2;
	}
	public double getCoste() {
		return this.Coste;
	}


	}
