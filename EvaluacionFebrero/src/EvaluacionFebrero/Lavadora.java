package EvaluacionFebrero;

public class Lavadora extends Electrodomestico{

	//Carga por defecto
	private final static int cargaDefecto=5;

	//Carga lavadora
	private int carga;

	//Devuelve la carga
	public int getCarga() {
		return carga;
	}

	//Precio Final
	public double precioFinal(){
		double plus=super.precioFinal();
		if (carga>30){
			plus+=50;
		}

		return plus;
	}

	//Constructores
	//Contructor por defecto
	public Lavadora(){
		this(precioBaseDefecto, pesoDefecto, consumoEnergeticoDefecto, colorDefecto, cargaDefecto);
	}

	//Constructor precio y base
	public Lavadora(double precioBase, double peso){
		this(precioBase, peso, consumoEnergeticoDefecto, colorDefecto, cargaDefecto);
	}

	//Constructor completo
	public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
		super(precioBase,peso, consumoEnergetico,color);
		this.carga=carga;
	}

}