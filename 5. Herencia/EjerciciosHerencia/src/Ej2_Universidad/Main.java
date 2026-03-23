package Ej2_Universidad;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alumnos[]=new Alumno[4];
		alumnos[0]=new Alumno("Sahara","Mendez","2ESO",700);
		alumnos[1]=new Al_Extranjero("Amaya","Uriarte","1ESO",700,"Bélgica");
		alumnos[2]=new Alumno("Luna","Llena","4ESO",700);
		alumnos[3]=new Al_CursoPuente("Olga","Rivera","2Carrera",1800,"Artes");
		
		System.out.println("Estos son los datos de los alumnos: ");
		
		for(Alumno a:alumnos) {
			System.out.println(a);
		}
	}

}
