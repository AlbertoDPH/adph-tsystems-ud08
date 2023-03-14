package ud08_04;

public class Main {

	public static void main(String[] args) {

		// Instaciamos los objetos de tipo SerieApp
		SerieApp ser1 = new SerieApp();
		SerieApp ser2 = new SerieApp("Batman", "Matt Reeves");
		SerieApp ser3 = new SerieApp("IronMan", 4, "Ciencia fición", "Jon Favreau");

		// Mostrando el contenido de los objetos con toString()
		System.out.println(ser1.toString());
		System.out.println(ser2.toString());
		System.out.println(ser3.toString());

	}
}
