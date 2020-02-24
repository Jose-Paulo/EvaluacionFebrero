package EvaluacionFebrero;

public class Television extends Electrodomestico{

	//Resolucion por defecto
	private final static int resolucionDefecto=20;

	//Resolución del televisor
	private int resolucion;

	private boolean sintonizadorTDT;


	//Precio final de la television
	public double precioFinal(){
		double plus=super.precioFinal();

		if (resolucion>40){
			plus+=precioBase*0.3;
		}
		if (sintonizadorTDT){
			plus+=50;
		}

		return plus;
	}

	//Constructores
	//Contructor por defecto
	public Television(){
		this(precioBaseDefecto, pesoDefecto, consumoEnergeticoDefecto, colorDefecto, resolucionDefecto, false);
	}

	//Constructor precio y base
	public Television(double precioBase, double peso){
		this(precioBase, peso, consumoEnergeticoDefecto, colorDefecto, resolucionDefecto, false);
	}

	//Constructor completo
	public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
		super(precioBase, peso, consumoEnergetico, color);
		this.resolucion=resolucion;
		this.sintonizadorTDT=sintonizadorTDT;
	}
}
