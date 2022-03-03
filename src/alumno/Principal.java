package alumno;

public class Principal {

	public static void main(String[] args) {
		Alumno Alumno2=new Alumno("Wenjun","Wang",18,"W",0);
		System.out.println("Los atributos son: ");
		System.out.println("Nombre: "+ Alumno2.Nombre);
		System.out.println("Apellidos: "+ Alumno2.Apellidos);
		System.out.println("Edad: "+ Alumno2.getEdad() );
		System.out.println("Inicial de su nombre: "+Alumno2.Inicial);
		System.out.println("Coste matrícula: "+ Alumno2.getCoste());
	}
}

