package Ej1_ArraysReales;

public class ArraysReales implements Estadisticas {
    private double numeros[];
    
    
	public ArraysReales(double[] numeros) {
		this.numeros = numeros;
	}

	@Override
	public double minimo() {
		// TODO Auto-generated method stub
		double min=numeros[0];
		for(int i=0;i<numeros.length;i++)
			if (numeros[i]<min)
				min=numeros[i];
		return min;
	}

	@Override
	public double maximo() {
		// TODO Auto-generated method stub
		double max=numeros[0];
		for(int i=0;i<numeros.length;i++)
			if (numeros[i]>max)
				max=numeros[i];
		return max;
	}

	@Override
	public double sumatorio() {
		double total=0;
		for(int i=0;i<numeros.length;i++) {
			total=total+numeros[i];
		}
		return total;		
	}

}
