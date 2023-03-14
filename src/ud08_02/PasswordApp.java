package ud08_02;

public class PasswordApp {

	// Varaibles de clase
	private int longitud;
	private String contrasenya;

	/**
	 * Constructor por defecto, que tiene asignado la logitud por defecto
	 */
	public PasswordApp() {
		this.longitud = 8;
	}

	/**
	 * Constructor que crea una contraseña aleatoria con una longitud pasada por
	 * parámetro
	 * 
	 * @param longitud
	 */
	public PasswordApp(int longitud) {
		this.longitud = longitud;
		int numAlea = 0;

		String password = "";
		for (int i = 0; i < longitud; i++) {
			numAlea = (int) (Math.random() * 10);
			password += numAlea;
		}
		this.contrasenya = "" + password;
	}

	/**
	 * Muestra los datos del objeto al llamar al método
	 */
	@Override
	public String toString() {
		return "PasswordApp [longitud=" + longitud + ", contrasenya=" + contrasenya + "]";
	}

}
