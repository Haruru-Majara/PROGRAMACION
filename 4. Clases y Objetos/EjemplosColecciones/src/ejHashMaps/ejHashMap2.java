package ejHashMaps;

import java.util.HashMap;

public class ejHashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<ClaveAlumno,Double> notas=new HashMap<ClaveAlumno,Double>();
		System.out.println("Dni del alumno asignatura y nota...");
		notas.put(new ClaveAlumno("23T","marcas"),7.2);
	}

}
