package ud08_01;

public class Persona {

	// Atributos
	private String nombre;
	private int edad;
	private final String DNI = "";
	private String sexo;
	private double peso;
	private double altura;

	// Contructor por defecto
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.peso = 0;
		this.sexo = "H";
		this.altura = 0;
	}

	// Contructor pasando por parametro nombre, edad y sexo y el resto de atributos
	// por defecto
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = 0;
		this.altura = 0;
	}

	// Constructor pasando por parámetro todos los atributos
	public Persona(String nombre, int edad, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
}
