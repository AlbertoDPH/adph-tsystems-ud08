package ud08_03;

public class Main {

	public static void main(String[] args) {

		// Instanciamos los objetos de tipo ElectrodomesticoApp
		ElectrodomesticoApp electro1 = new ElectrodomesticoApp();
		ElectrodomesticoApp electro2 = new ElectrodomesticoApp("Amarillo");
		ElectrodomesticoApp electro3 = new ElectrodomesticoApp(200, "Rojo", 80);

		// Mostrando el contenido de los objetos con toString()
		System.out.println(electro1.toString());
		System.out.println(electro2.toString());
		System.out.println(electro3.toString());

	}

}
