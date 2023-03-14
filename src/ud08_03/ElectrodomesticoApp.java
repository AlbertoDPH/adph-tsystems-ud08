package ud08_03;

public class ElectrodomesticoApp {

	// Variables estaticas
	final String COLOR = "Blanco";
	final double PRECIOBASE = 100;
	final double PESO = 5;

	// Variables
	protected double precioBase;
	protected String color;
	protected String consumo;
	protected double peso;

	/**
	 * Constructor por defecto que recoge todos los valores de las variables
	 * estáticas
	 */
	public ElectrodomesticoApp() {
		this.precioBase = PRECIOBASE;
		this.color = COLOR;
		this.consumo = "F";
		this.peso = PESO;
	}

	/**
	 * Contructor que recibe los valores estaticos del precioBase y el peso El color
	 * por parémetro, y se comrprueba que sea blanco,negro,rojo,azul o gris Además
	 * no importa si el nombre esta escrito en mayúsculas o minúsculas la app lo
	 * detecta. El consumo es un valor por defecto que la app genera aletoriamente
	 * entre A y F.
	 * 
	 * @param color que recibe por teclado
	 */
	public ElectrodomesticoApp(String color) {
		this.precioBase = PRECIOBASE;
		this.color = compruebaColor(color);
		this.consumo = eligeConsumo();
		this.peso = PESO;
	}

	/**
	 * Recibe los valores de precioBase, color y peso El color por parémetro, y se
	 * comrprueba que sea blanco,negro,rojo,azul o gris Además no importa si el
	 * nombre esta escrito en mayúsculas o minúsculas la app lo detecta. El consumo
	 * es un valor por defecto que la app genera aletoriamente entre A y F.
	 * 
	 * @param precioBase recibe el precioBase por parámetro
	 * @param color      recibe el color por parámetro
	 * @param peso       recibe el peso por parámetro
	 */
	public ElectrodomesticoApp(double precioBase, String color, double peso) {
		this.precioBase = precioBase;
		this.color = compruebaColor(color);
		this.consumo = eligeConsumo();
		this.peso = peso;
	}

	/**
	 * Comprueba que el color pasado por parametro corresponda a alguno de los qeu
	 * contiene el array Si el color es correcto, devuelve ese mismo color, si no
	 * devuelve Color no valido
	 * 
	 * @param color recibe el color por parámetro
	 * @return el color
	 */
	private String compruebaColor(String color) {
		String[] colores = { "blanco", "negro", "rojo", "azul", "gris" };
		boolean esColor = false;

		for (String colors : colores) {
			if (color.equalsIgnoreCase(colors)) {
				esColor = true;
			}
		}
		if (esColor)
			return color;
		else
			return "Color no valido";
	}

	/**
	 * Devuelve F o A de forma aleatoria.
	 * 
	 * @return devuelve el consumo
	 */
	private String eligeConsumo() {

		int valor = (int) (Math.random() * 2);

		if (valor == 1)
			consumo = "A";
		else
			consumo = "F";
		return consumo;
	}

	/**
	 * Muestra los datos del objeto al llamar al método
	 */
	@Override
	public String toString() {
		return "ElectrodomesticoApp [precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo + ", peso="
				+ peso + "]";
	}

}
