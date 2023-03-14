package ud08_01;

public class Persona {

	// Atributos estaticos
	final String DNI = "123456789B";
	final String SEXO = "H";

	// Variables
	private String nombre;
	private int edad;
	private String dni;
	private String sexo;
	private double peso;
	private double altura;

	// Contructor por defecto con valores estaticos dni y sexo
	public Persona() {
		this.dni = DNI;
		this.sexo = SEXO;
	}

	/**
	 * Contructor pasando por parametro nombre, edad y sexo y el resto de atributos
	 * por defecto
	 * 
	 * @param nombre valor pasado por parámetro
	 * @param edad   valor pasado por parámetro
	 * @param sexo   valor pasado por parámetro
	 */
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.sexo = sexo;

	}

	/**
	 * Constructor pasando por parámetro todos los atributos
	 * 
	 * @param nombre valor pasado por parámetro
	 * @param edad   valor pasado por parámetro
	 * @param sexo   valor pasado por parámetro
	 * @param peso   valor pasado por parámetro
	 * @param altura valor pasado por parámetro
	 * @param dni    valor pasado por parámetro
	 */
	public Persona(String nombre, int edad, String sexo, double peso, double altura, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.dni = dni;
	}

	/**
	 * Muestra los datos del objeto al llamar al método
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

}
