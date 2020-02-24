package EvaluacionFebrero;

public class Ejecutable {

	public static void main(String[] args) {

		//Array
		Electrodomestico listaElectrodomesticos[]= new Electrodomestico[10];

		
		//Posiciones
		listaElectrodomesticos[0]=new Electrodomestico(200, 60, 'A', "Blanco");
		listaElectrodomesticos[1]=new Lavadora(200, 40);
		listaElectrodomesticos[2]=new Television(400, 60, 'C', "Negro", 24, false);
		listaElectrodomesticos[3]=new Electrodomestico(350, 55, 'F', "Rojo");
		listaElectrodomesticos[4]=new Electrodomestico(600, 20, 'D', "Gris");
		listaElectrodomesticos[5]=new Lavadora(600, 30, 'F', "Blanco", 50);
		listaElectrodomesticos[6]=new Television(250, 70);
		listaElectrodomesticos[7]=new Lavadora(455, 100, 'A', "Azul", 15);
		listaElectrodomesticos[8]=new Television(700, 25, 'B', "Rojo", 32, true);
		listaElectrodomesticos[9]=new Electrodomestico(75, 35);

		//Variables suma precios
		double sumaElectrodomesticos=0;
		double sumaTelevisores=0;
		double sumaLavadoras=0;

				for(int i=0;i<listaElectrodomesticos.length;i++){
		
			if(listaElectrodomesticos[i] instanceof Electrodomestico){
				sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
			}
			if(listaElectrodomesticos[i] instanceof Lavadora){
				sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
			}
			if(listaElectrodomesticos[i] instanceof Television){
				sumaTelevisores+=listaElectrodomesticos[i].precioFinal();
			}
		}

		System.out.println("La suma de los electrodomésticos es: " + sumaElectrodomesticos);
		System.out.println("La suma de las lavadoras es: "+ sumaLavadoras);
		System.out.println("La suma de los televisores es: " + sumaTelevisores);

	}

	
}