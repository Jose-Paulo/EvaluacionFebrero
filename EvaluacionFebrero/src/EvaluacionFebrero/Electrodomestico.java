package EvaluacionFebrero;

public class Electrodomestico {

	//Color por defecto
	final static String colorDefecto= "Blanco";

	//Consumo energetico por defecto
	final static char consumoEnergeticoDefecto='F';

	//Precio base por defecto
	final static double precioBaseDefecto=100;

	//Peso por defecto
	final static double pesoDefecto=5;


	//Precio base electrodomestico
	double precioBase;

	//Color electrodomestico
	String color;

	//Consumo energetico electrodomestico
	char consumoEnergetico;

	//Peso electrodomestico
	double peso;


	private void comprobarColor(String color){

		String colores[]={"Blanco", "Negro", "Rojo", "Azul", "Gris"};
		boolean encontrado=false;

		for(int i=0;i<colores.length && !encontrado;i++){

			if(colores[i].equals(color)){
				encontrado=true;
			}

		}

		if(encontrado){
			this.color=color;
		}else{
			this.color=colorDefecto;
		}


	}

	public void comprobarConsumoEnergetico(char consumoEnergetico){

		if(consumoEnergetico>=65 && consumoEnergetico<=70){
			this.consumoEnergetico=consumoEnergetico;
		}else{
			this.consumoEnergetico=consumoEnergeticoDefecto;
		}

	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public double precioFinal(){
		double extra=0;
		switch(consumoEnergetico){
		case 'A':
			extra+=100;
			break;
		case 'B':
			extra+=80;
			break;
		case 'C':
			extra+=60;
			break;
		case 'D':
			extra+=50;
			break;
		case 'E':
			extra+=30;
			break;
		case 'F':
			extra+=10;
			break;
		}

		if(peso>=0 && peso<19){
			extra+=10;
		}else if(peso>=20 && peso<49){
			extra+=50;
		}else if(peso>=50 && peso<=79){
			extra+=80;
		}else if(peso>=80){
			extra+=100;
		}

		return precioBase+extra;
	}

	//Constructores
	//Contructor por defecto
	public Electrodomestico(){
		this(precioBaseDefecto, pesoDefecto, consumoEnergeticoDefecto, colorDefecto);
	}

	//Constructor precio y base
	public Electrodomestico(double precioBase, double peso){
		this(precioBase, peso, consumoEnergeticoDefecto, colorDefecto);
	}

	//Constructor completo
	public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
		this.precioBase=precioBase;
		this.peso=peso;
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
	}

}