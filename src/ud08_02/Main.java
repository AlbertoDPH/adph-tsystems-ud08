package ud08_02;

public class Main {

	public static void main(String[] args) {

		// Intanciamos un objeto de la clase PasswordApp contrcutor por defecto
		PasswordApp pass1 = new PasswordApp();

		// Se muestra el contenido del objeto del contructor por defecto con toString()
		System.out.println(pass1.toString());

		// Intanciamos un objeto de la clase PasswordApp le pasamos longitud de la contraseña
		PasswordApp pass2 = new PasswordApp(12);

		// Muestra la longitud de la contraseña y la contraseña aleatoria con esa
		// longitud
		System.out.println(pass2.toString());

	}
}
