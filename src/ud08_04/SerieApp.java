package ud08_04;

public class SerieApp {

	// Variables
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	/**
	 * Constructor por defecto, el que tiene asiginados valores por omision en
	 * numTemporadas y entregado
	 */
	public SerieApp() {
		this.numTemporadas = 3;
		this.entregado = false;
	}

	/**
	 * Constructor por defecto, el que tiene asiginados valores por omision en
	 * numTemporadas y entregado recibe por parámetro los valores de titulo y
	 * creador
	 * 
	 * @param titulo  valor pasado por parámetro
	 * @param creador valor pasado por parámetro
	 */
	public SerieApp(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemporadas = 3;
		this.entregado = false;
		this.creador = creador;
	}

	/**
	 * Recibe todos los valores por parámetro de las variables excepto entregado
	 * 
	 * @param titulo        valor pasado por parámetro
	 * @param numTemporadas valor pasado por parámetro
	 * @param genero        valor pasado por parámetro
	 * @param creador       valor pasado por parámetro
	 */
	public SerieApp(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	/**
	 * Muestra los datos del objeto al llamar al método
	 */
	@Override
	public String toString() {
		return "SerieApp [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}

}
